import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0 , ml = 2147483647 ;
		int countinue = sc.nextInt();
		String min = "" , name;
		for(int i = 0 ; i < countinue ; i++){
		    
		    System.out.println("Enter name");
		    name = sc.next();
		    
		    if( hm.containsKey(name) ){
		        
		        int temp = hm.get(name);
		        temp = temp + 1;
		        if( temp > max ){
    		          
    		          max = temp;
    		          min = name;
    		          ml = min.length();
		        }
		        else if( temp == max ){
		            
		            if( ml > name.length() ){  
        		            
        		            max = temp;
        		            min = name;
        		            ml = min.length();
    		        }
		        }
		        hm.put(name,temp);
		    }
		    else{
		        
		        int temp1 = 1;
		        
		        if( temp1 > max ){
    		          
    		          max = temp1;
    		          min = name;
    		          ml = min.length();
		        }
		        else if( temp1 == max ){
		            
		            if( ml > name.length() ){
        		            
        		            max = temp1;
        		            min = name;
        		            ml = min.length();
    		          }
		        }
		        hm.put(name,temp1);
		    }
		}
		
		System.out.println("Name = "+min+" Length "+ml+" Count "+max );
	}
}
