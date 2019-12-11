import java.util.*;

class Input
{
    String p_num,s_num;
    public Input(String p_num,String s_num)
    {
        this.p_num = p_num;
        this.s_num = s_num;
    }

}

public class Main
{
    
    public static HashMap<String,Input> hm = new HashMap<>();
    public static void main(String args[])
    {
        Main main=new Main();
        Scanner sc = new Scanner(System.in);
        String cond="";
        do
        {
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Primary Number: ");
            String p_num = sc.next();
            System.out.println("Enter Secondary Number: (y/no):");
            char chc=sc.next().charAt(0);
            String s_num="-";
            if(chc=='y')
            {
                s_num = sc.next();
            }
            System.out.println("Type 'stop' to stop,any other letter to continue!");
            cond = sc.next();
            hm.put(name,new Input(p_num,s_num));
        }while(!cond.equals("stop"));
        
        int ch;
        do
        {
            System.out.println("1.Display\n2.Search\n3.Exit\nEnter with choice");
            ch = sc.nextInt();
            
            if(ch==1){
                
                main.display();
            }
            else if(ch==2){
                
                 main.search();
            }
        }while(ch!=3);
        
    }

    void display()
    {
        Iterator ir = hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp = (Map.Entry) ir.next();
            String nm = temp.getKey();
            Input ph = temp.getValue();
            System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
            
        }
    }
    
    void search()
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Search key");
        String key=sc.next();
        Iterator ir=hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp=(Map.Entry) ir.next();
            String nm=temp.getKey();
            Input ph=temp.getValue();
            
            String temp1 = nm;
            temp1=temp1.toUpperCase();
            //System.out.println(temp1);
            String temp2 = key;
            temp2=temp2.toUpperCase();
            //System.out.println(temp2);
            if(temp1.contains(temp2))
            {
                System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
                flag=1;
            }
            
        }
            if(flag==0)
            {
                System.out.println("No record exists");
            }
        
    }

}
