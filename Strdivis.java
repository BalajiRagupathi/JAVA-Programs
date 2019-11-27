import java.util.*;

class Strdivis{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		String x = sc.nextLine();
		String y = sc.nextLine();
		String cp = "";
		int flag = 0;
		
		for(int i = 0 ; i < y.length() ; i++){
			
			cp = cp + y.charAt(i);
			if(x.equals(cp) && x.length() == cp.length()){
				
				flag = 0;
				cp = "";
			}
			else if( i == (y.length() - 1) ){
				
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("divisor");
		else
			System.out.println("Not a divisor");
	}
}