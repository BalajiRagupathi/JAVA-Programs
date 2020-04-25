import java.util.*;
import java.text.DecimalFormat;

public class Cricket{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int p[] = new int[11];
		String balls = scanner.nextLine();
		
		
		int run , total = 0, extra = 0 , wickets = 0, wickets_remain = 10, strike = 0 , non_strike = 1 , b = 0 , w = 2 ;
		
		for(int i = 0 ; i < balls.length() ; i++){
			
			String st = "";
			int temp = 0;
			
			if(balls.charAt(i) != ' ')
				b++;
			
			if(balls.charAt(i) == 'o' || balls.charAt(i) == 'O'){
				
				wickets = wickets + 1;
				wickets_remain = wickets_remain - 1;
				strike = w;
				w++;
			}
			else if(balls.charAt(i) == 'W' || balls.charAt(i) == 'w'){
				
				extra = extra + 1;
				total = total + 1;
				b--;
			}
			else if(Character.isDigit(balls.charAt(i))){
				
				st = st + balls.charAt(i);
				temp = Integer.parseInt(st);
				p[strike] = p[strike] + Integer.parseInt(st);
				total = total + Integer.parseInt(st);
			}
			
			if( b >= 6 && b%6 == 0){
				
				int swap_strike = strike;
				strike = non_strike;
				non_strike = swap_strike;
			}
			if( temp != 0 && temp % 2 != 0 ){
				
				int swap_strike = strike;
				strike = non_strike;
				non_strike = swap_strike;
			}
		}
		
		for(int i = 0 ; i <= strike || i <= non_strike ; i++)
			System.out.println("P"+(i+1)+"-"+p[i]+"(runs)");
		
		System.out.println("Strike-P"+(strike+1));
		System.out.println("Non-Strike-P"+(non_strike+1));
		System.out.println("Total-"+total);
		System.out.println("Overs-"+b/6+"."+b%6);
		System.out.println("Extra-"+extra);
		System.out.println("Wicker(s)-"+wickets);
		System.out.println("Remaining Wicker(s)-"+wickets_remain);
	}
}
