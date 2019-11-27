import java.util.*;

class Cashdenomination{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int arr[] = new int[test];
		
		for(int i = 0 ; i < test ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int fh = 0 , oh = 0 , ft = 0 , tt = 0 , ot = 0 , f = 0 , t = 0 , o = 0;
		
		for(int i = 0 ; i < test ; i++){
			
			fh = oh = ft = tt = ot = f = t = o = 0; 
			while( arr[i] > 0 ){
				
				if( arr[i] >= 500 ){
					
					fh = fh + arr[i]/500;
					arr[i] = arr[i] % 500;
				}
				else if( arr[i] >= 100 ){
					
					oh = oh + arr[i]/100;
					arr[i] = arr[i] % 100;
				}
				else if( arr[i] >= 50 ){
					
					ft = ft + arr[i]/50;
					arr[i] = arr[i] % 50;
				}
				else if( arr[i] >= 20 ){
					
					tt = tt + arr[i]/20;
					arr[i] = arr[i] % 20;
				}
				else if( arr[i] >= 10 ){
					
					ot = ot + arr[i]/10;
					arr[i] = arr[i] % 10;
				}
				else if( arr[i] >= 5 ){
					
					f = f + arr[i]/5;
					arr[i] = arr[i] % 5;
				}
				else if( arr[i] >= 2 ){
					
					t = t + arr[i]/2;
					arr[i] = arr[i] % 2;
				}
				else if( arr[i] >= 1 ){
					
					o = o + arr[i]/1;
					arr[i] = arr[i] % 1;
				}
			}
			
			System.out.println("500:"+fh);
			System.out.println("100:"+oh);
			System.out.println("50:"+ft);
			System.out.println("20:"+tt);
			System.out.println("10:"+ot);
			System.out.println("5:"+f);
			System.out.println("2:"+t);
			System.out.println("1:"+o);
		}
	}
}