import java.util.*;

class Binarysum{
	public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int carry = 0, temp1 = 0 , temp2 = 0 , rem1 , rem2 , sum = -1;
			int l1 = String.valueOf(a).length();
			int l2 = String.valueOf(b).length();
			String s , f = "";
			
			while( temp1 <= l1 || temp2 <= l2){
			
				
				if(temp1 <= l1){
					rem1 = a % 10;
					a = a / 10;
					temp1++;
					
				}
				else{
					rem1 = 0;
				}
				
				if(temp2 <= l2){
					rem2 = b % 10;
					b = b / 10;
					temp2++;
				}
				else{
					rem2 = 0;
				}
				
				if((rem1 != 1 || rem2 != 1) && carry == 0){
					sum = rem1 + rem2;
					
				}
				
				else if(rem1 == 1 && rem2 == 1 && carry == 0){
					sum = 0;
					carry = 1;
					
				}
				
				else if(carry == 1 && rem1 == 1 && rem2 == 1){
					sum = 11;
					carry = 0;
					
				}
			
				else if((rem1 != 1 || rem2 != 1) && carry == 1){
					
					if(rem1 == 1 ){
						sum = 0;
						carry = 1;
						
					}
						
					else if(rem2 == 1){
						sum = 0;
						carry = 1;
						
					}
						
					else{
						sum = carry;
						carry = 0;
					}
				}
				s = Integer.toString(sum);
				f = s + f;
			}
			System.out.print(f);
	}
}