import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0 , ml = 2147483647;
		String min = "";
		do{
		    
		    System.out.println("Enter name");
		    String name = sc.nextLine();
		    
		    System.out.println("Enter No to close");
		    String countinue = sc.next();
		    
		    if( hm.containsKey(name) ){
		        
		        int temp = hm.getValue();
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
		        else{ 
		            
		            max = temp;
		            min = name;
		            ml = min.length();
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
		        else if( temp == max ){
		            
		            if( min.length() > name.length() ){  
        		            
        		            max = temp1;
        		            min = name;
        		            ml = min.length();
    		          }
		        }
		        else{ 
		            
		            max = temp1;
		            min = name;
		            ml = min.length();
		        }
		        hm.put(name,temp1);
		    }
		}while( !countinue.equals("No") || !countinue.equals("no") );
		
		System.out.println("Name = "+min+" Length "+ml+" Count "+max );
	}
}
