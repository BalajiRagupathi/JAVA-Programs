import java.util.*;

public class Substringcompare{
	
	static boolean check(List<String> sub , List<String> k){
	    
	    if( sub != null && k != null ){
    	    
    	    Collections.sort(sub);
    	    Collections.sort(k);
    	    
    	    if( sub.equals(k) )
    	        return true;
	    }
    	
    	return false;
	}
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		String k = scanner.nextLine();
		
		List<String> chk = new ArrayList<String>(Arrays.asList(k.split("")));
		
		int kl = k.length();
		int n = s.length() - kl , flag = 0 , count = 0;
		
		for(int i = 0 ; flag == 0 && i <= n ; i++){
		    
		    count++;
			for(int j = 0 ; flag == 0 && j <= n-i ; j++){
				
				String sub = s.substring(j,j+kl+i);
				
				List<String> chsub = new ArrayList<String>(Arrays.asList(sub.split("")));
				
				chsub.retainAll(chk);
				
				if( check(chsub , chk ) ){
					
					System.out.println(sub);
					flag = 1;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}
}


//its order is n = s.length() - k.length() + 1
// n + ((n*n(n+1))/2)
//example
//s = "abcdefghijklmnopqrstuvwxyz"
//k = "az"
//loop runs 350 times
// n = 26 - 2 + 1 = 25
//25 + ((n*(n+1)/2))