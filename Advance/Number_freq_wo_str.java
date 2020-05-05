import java.util.*;

class Number_freq_wo_str{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num , ele = 0 , mc = 0 , c = 1 , ct = 0 , max = -2147483648;
		while( temp != 0 ){
			
			int rem = temp %10;
			temp = temp / 10;
			
			if( ct == 0 ){
				
				ele = rem;
				c = 1;
			}
			else if( ele == rem  && c > 0 ){
				
				c++;
			}
			else if( ele != rem ){
				
				ele = rem;
				c = 1;
			}
			
			if( c > mc && ele > max ){
				
				mc = c;
				max = ele;
			}
			ct++;
		}
		
		System.out.println("Maximum occurring digit is "+max);
	}
}