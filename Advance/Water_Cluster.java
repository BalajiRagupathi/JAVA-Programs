import java.util.*;

class Cluster_details{
    
    String clust;
    int per_day , capacity , balance;
    
    public Cluster_details(String cl , int p , int cp , int b ){
        
        clust = cl;
        per_day = p;
        capacity = cp;
        balance = b;
    }
}

public class Water_Cluster{
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        int days = scanner.nextInt();
        
        HashMap<String,Cluster_details> cluster_arr = new HashMap<String,Cluster_details>();
        List<List<String>> federal_connect = new ArrayList<List<String>>();
        HashMap<String,String> hm = new HashMap<String,String>();
        
        int cluster_data_size = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0 ; i < cluster_data_size ; i++){
            
            String s = scanner.nextLine();
            String spt[] = s.split("\\s+");
            
            cluster_arr.put(spt[0], new Cluster_details(spt[0],Integer.parseInt(spt[1]),Integer.parseInt(spt[2]),1));
        }
        
        int connect_size = scanner.nextInt();
        scanner.nextLine();
        
        int id = 1;
        
        for(int i = 1 ; i <= connect_size ; i++){
            
            String s = scanner.nextLine();
            
            String spt[] = s.split("_");
            
            if( spt[0].equals("F") ){
                
                spt[0] += id;
                id++;
            }
            
            hm.put(spt[0],spt[1]);
        }
        
        for(int i = 1 ; i < id ; i++){
            
            String f = "F"+i;
            List<String> dum = new ArrayList<String>();
            
            while( hm.containsKey(f) ){
                
                dum.add(f);
                f = hm.get(f);
            }
            
            dum.add(f);
            
            federal_connect.add(dum);
        }
        
        int sum = 0;
        
        for(int i = 0 ; i < id-1 ; i++){
            
            List<String> dum = new ArrayList<String>(federal_connect.get(i));
            
            int dum_sum = 0;
            for(int j = dum.size()-1 ; j > 0 ; j-- ){
                
                String val = dum.get(j);
                int quo = cluster_arr.get(val).capacity/cluster_arr.get(val).per_day;
                
                if( quo >= days )
                    dum_sum = dum_sum + (cluster_arr.get(val).capacity*cluster_arr.get(val).balance);
                else{
                    
                    int ad = days - quo;
                    int bal = cluster_arr.get(val).balance;
                    
                    if( bal == 1 )
                        bal = bal + ad;
                    else {
                        
                        int dif = bal - 1;
                        
                        if( dif < ad ){
                            
                            ad = ad - dif;
                            bal = bal + ad;
                        }
                    }
                    
                    cluster_arr.put(val, new Cluster_details(cluster_arr.get(val).clust,cluster_arr.get(val).per_day,cluster_arr.get(val).capacity,bal));
                    
                    for(int k = 1 ; k < j ; k++){
                        
                        cluster_arr.put(dum.get(k), new Cluster_details(cluster_arr.get(dum.get(k)).clust,cluster_arr.get(dum.get(k)).per_day,cluster_arr.get(dum.get(k)).capacity,bal));
                    }
                    dum_sum = dum_sum + (cluster_arr.get(val).capacity*cluster_arr.get(val).balance);
                }
            }
            sum = sum + dum_sum;
        }
        
        System.out.println(sum);
    }
}