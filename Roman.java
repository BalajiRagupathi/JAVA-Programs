import java.util.*;

class Roman{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int arr[] = new int[test];
		
		for(int i = 0 ; i < test ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < test ; i++){
			
			String size = Integer.toString(arr[i]);
			int digits = size.length();
			int pw = digits - 1;
			int quo = arr[i];
			String rom = "";
			
			while( pw >= 0 ){
				
				quo =  quo / (int) Math.pow(10, pw);
				int num = quo * (int) Math.pow(10, pw);
				int rem = arr[i] % (int) Math.pow(10, pw);
				quo = rem;
				
				if(num == 0)
					break;
				else if( num >= 1 && num <= 9){
					
					if( num < 4 ){
						
						for(int j = 0 ; j < num ; j++ )
							rom = rom + "I"; 
					}
					else if( num > 5 && num < 9 ){
						
						rom = rom + "V";
						for(int j = 5 ; j < num ; j++ )
							rom = rom + "I";
					}
					else if( num == 4 ){
						
						rom = rom + "IV";
					}
					else if( num == 5 ){
						
						rom = rom + "V";
					}
					else
						rom = rom + "IX";
				}
				else if( num >= 10 && num <= 90 ){
					
					if( num < 40 ){
						
						for(int j = 0 ; j < num/10 ; j++ )
							rom = rom + "X"; 
					}
					else if( num > 50 && num < 90 ){
						
						rom = rom + "L";
						for(int j = 5 ; j < num/10 ; j++ )
							rom = rom + "X";
					}
					else if( num == 40 ){
						
						rom = rom + "XL";
					}
					else if( num == 50 ){
						
						rom = rom + "L";
					}
					else
						rom = rom + "XC";
				}
				else if( num >= 100 && num <= 900 ){
					
					if( num < 400 ){
						
						for(int j = 0 ; j < num/100 ; j++ )
							rom = rom + "C"; 
					}
					else if( num > 500 && num < 900 ){
						
						rom = rom + "D";
						for(int j = 5 ; j < num/100 ; j++ )
							rom = rom + "C";
					}
					else if( num == 400 ){
						
						rom = rom + "CD";
					}
					else if( num == 500 ){
						
						rom = rom + "D";
					}
					else
						rom = rom + "CM";
				}
				else if( num >= 1000 && num <= 9000 ){
					
					if( num < 4000 ){
						
						for(int j = 0 ; j < num/1000 ; j++ )
							rom = rom + "M"; 
					}
					else if( num > 5000 && num < 9000 ){
						
						rom = rom + "~V";
						for(int j = 5 ; j < num/1000 ; j++ )
							rom = rom + "M";
					}
					else if( num == 4000 ){
						
						rom = rom + "~MV";
					}
					else if( num == 5000 ){
						
						rom = rom + "~V";
					}
					else
						rom = rom + "~IX";
				}
				else if( num == 10000){
					
					rom = rom + "~X";
				}
				
				pw--;
			}
			System.out.println(rom);
		}
	}
}

/*

1 I
4 IV
5 V
9 IX
10 X
40 XL
50 L
90 XC
100 C
400 CD
500 D
900 CM
1000 M
4000 ~IV
5000 ~V
10000 ~X



*/