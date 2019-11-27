import java.util.*;

class Coin{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int ct = 0 , n;
		int arr[] = new int[t];
		
		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < t ; i++){
			
			ct = 0;
			n = arr[i];
			while( n != 0){
		
				if(n >= 25){
				
					ct++;
					n = n - 25;
				}
				else if( n >= 10){
				
					ct++;
					n = n - 10;
				}
				else if(n >= 5){
				
					ct++;
					n = n - 5;
				}
				else if(n >= 1){
				
					ct++;
					n = n - 1;
				}
			}
			System.out.println(ct);
		}
	}
}