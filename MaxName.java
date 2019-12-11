/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static HashMap<Long,String> hm = new HashMap<>();
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do{
		    
		    System.out.println("Enter name");
		    String name = sc.nextLine();
		    
		    System.out.println("Enter No to close");
		    String countinue = sc.next();
		    
		    if( hm.containsValue(name) ){
		        
		        int temp = hm.getKey();
		        temp = temp + 1;
		        while( hm.containsKey(temp) ){
		            
		            temp = temp * 10;
		        }
		        hm.put(temp,name);
		    }
		    else{
		        
		        hm.put(1,name);
		    }
		}while( !countinue.equals("No") || !countinue.equals("no") );
	}
}
