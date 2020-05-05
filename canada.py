import boto3
from prettytable import PrettyTable
from datetime import date, timedelta
import datetime
import json
import os


def lambda_handler(event, context):
    # TODO implement
    ec2_cli = boto3.client('ec2')
    ec2_res = boto3.resource('ec2')

    ec2_backup_count = ec2_total_count = ami_taken_count = other_amis = worker_node_count = 0
    all_ec2_list = []
    instances_list = []
    other_ami_list = []
    ami_list = []
    ec2_no_backup = []
    rds_db_snap_list = []
    rds_db_count = rds_snap_count = 0
    sns_subject = ""
    today_date = date.today().strftime('%Y-%m-%d')
    #today_date = date.today()-datetime.timedelta(1)
    today_dat = date.today()
    print("Today Date: ", today_date)

    for ec2s in ec2_res.instances.all():
        all_ec2_list.append(ec2s.id)
        ec2_total_count+=1
    print("Total EC2 instances: ", ec2_total_count)

    reservations = ec2_cli.describe_instances( Filters=[ {'Name': 'tag-key', 'Values': ['prod','yes']}, ] )
    for r in (reservations["Reservations"]):
        for inst in r["Instances"]:
            for tags in ec2_res.Instance(inst["InstanceId"]).tags:
                if (tags["Key"] == 'Backup') and (tags["Value"] == 'yes'):
                    ec2_backup_count+=1
                    instances_list.append(inst["InstanceId"])
    print("PROD-EC2 with Backup enabled: ", ec2_backup_count)
    #print("EC2 IDs: ", instances_list)
    #print("All Instances: ", all_ec2_list)
    for all_ec2 in all_ec2_list:
        count = 0
        for backup_ec2 in instances_list:
            if all_ec2 == backup_ec2:
                count+=1
        if count == 0:
            try:
                for tags in ec2_res.Instance(all_ec2).tags:
                    ec2_no_bkp = {}
                    if tags["Key"] == 'Name':
                        ec2_no_bkp[all_ec2]=tags["Value"]
                        ec2_no_backup.append(ec2_no_bkp)
            except:
                ec2_no_bkp[all_ec2]="NO NAME"
                ec2_no_backup.append(ec2_no_bkp)
                continue
    print("PROD-EC2 with no backup enabled Count: ", len(ec2_no_backup))
    print("PROD-EC2 with no backup enabled: ", ec2_no_backup)

    tabular_report = PrettyTable()
    tabular_report.field_names = ["Instance ID", "Instance Name"]
    for ec2 in ec2_no_backup:
        for key, value in ec2.items():
            tabular_report.add_row([key,value])
            
    todays_ami_count = 0
    ec2_images = ec2_cli.describe_images(Filters=[ { 'Name': 'state', 'Values': [ 'available'] }], Owners = ['self']).get("Images")
    print("Total AMIs Count: ", len(ec2_images))
    for ec2_ami in ec2_images:
        #print("AMI Name: ", ec2_ami['Name'])
        other_ami = {}
        if str(ec2_ami['Name']).endswith(str(today_date)):
            todays_ami_count+=1
            count = 0
            for ec2_instance in instances_list:
                #print("EC2 ID: ", ec2_instance)
                #if ec2_ami['Name'].find(ec2_instance):
                if ec2_instance in ec2_ami['Name']:
                    count+=1
                if count == 1:
                    #print("AMI avail for the EC2: ", ec2_instance)
                    ami_taken_count += 1
                    other_ami[ec2_ami['ImageId']] = ec2_ami['Name']
                    ami_list.append(other_ami)
                else:
                    #print("Other AMIs: ", ec2_ami['Name'])
                    other_ami[ec2_ami['ImageId']] = ec2_ami['Name']
                    #other_ami_list.append(ec2_ami['Name'])
                    other_ami_list.append(other_ami)
                    other_amis+=1

    if todays_ami_count == ec2_backup_count:
        sns_subject = str(os.environ['env']) + ":  AMI Backup has been completed successfully in Canada central!!"
        print(sns_subject)
        print("Total AMI taken count: ", ami_taken_count)
        #print("AMIs :", ami_list)
        tabular_ami_report = PrettyTable()
        tabular_ami_report.field_names = ["AMI ID", "Image Name"]
        for ami in ami_list:
            for key, value in ami.items():
                tabular_ami_report.add_row([key,value])
    else:
        sns_subject = str(os.environ['env']) + ": HGS AMI Backup was NOT completed successfully in Canada central!!"
        print(sns_subject)
        print("AMI Taken Count: ", ami_taken_count)
        print("Other AMIs count: ", other_amis)
        print("Other AMIs: ", other_ami_list)
        tabular_ami_report = PrettyTable()
        tabular_ami_report.field_names = ["AMI ID", "Image Name"]
        for ami in other_ami_list:
            for key, value in ami.items():
                tabular_ami_report.add_row([key,value])
                
    ## Checking  RDS Details ###
    rds_cli = boto3.client('rds')
    rds_instances = rds_cli.describe_db_instances().get('DBInstances')
    
    for rds in rds_instances:
        rds_db_count+=1
        rds_snap_desc = rds_cli.describe_db_snapshots(DBInstanceIdentifier=rds['DBInstanceIdentifier']).get('DBSnapshots')
        for rds_snap in rds_snap_desc:
            snap_list = {}
            snap_date = rds_snap['SnapshotCreateTime'].date()#.strftime("%Y-%m-%d")
            if snap_date == today_dat:
                rds_snap_count+=1
                print("RDS: ", rds['DBInstanceIdentifier'])
                print("RDS Snap: ", rds_snap['DBSnapshotIdentifier'])
                snap_list[rds['DBInstanceIdentifier']] = rds_snap['DBSnapshotIdentifier']
                rds_db_snap_list.append(snap_list)
    
    rds_report = PrettyTable()
    rds_report.title = "RDS Snapshot Details"
    rds_report.field_names = ["RDS DB Name", "RDS DB Snapshot Name"]
    for rds_snap in rds_db_snap_list:
        for key, value in rds_snap.items():
            rds_report.add_row([key, value])

    sns_ec2 = "Total EC2 instances: " + str(len(all_ec2_list)) + "\nEC2 with Backup enabled: "+ str(ec2_backup_count) + "\nEC2 WORKER NODE Count: " + str(worker_node_count) + "\nEC2 with no backup enabled Count: " + str(len(ec2_no_backup)) + "\n\n" + str(tabular_report.get_string(title="EC2 instance with no backup enabled"))
    sns_ami = "\n\nTotal AMIs Count: " + str(len(ec2_images)) + "\nAMI related to EC2 instances count: " + str(ami_taken_count) + "\nAMIs count today: " + str(todays_ami_count) + "\n\n" + tabular_ami_report.get_string(title="AMI Details")
    sns_rds = "\n\nTotal RDS DB Count: " + str(rds_db_count) + "\nRDS DB Snapshot count today: " + str(rds_db_count) + "\n\n" + str(rds_report)

    sns_body = sns_ec2 + sns_ami + sns_rds
    print(sns_body)
    
    ### Sending an email using SNS Topic
    sns_topic = os.environ['mail_topic']
    print("Sending an email: ", sns_sendemail(sns_topic, sns_subject, sns_body))
    #sns_topic = os.environ['ctx_mgmt']
    #print("Sending an email: ", sns_sendemail(sns_topic, sns_subject, sns_body))
    
    return { 'statusCode': 200, 'body': json.dumps('Hello from Lambda!') }

def sns_sendemail(sns_topic, sns_subject, sns_body):
    sns = boto3.client('sns')
    respose = sns.publish(TopicArn=sns_topic, Subject = sns_subject, Message=sns_body)

