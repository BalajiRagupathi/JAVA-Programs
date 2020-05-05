//coin change sum

import java.util.*;

class CoinChange{

	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int [] arr = new int[size];
		
		for(int i = 0 ; i < size ; i++)
			arr[i] = scanner.nextInt();
		
		int n = scanner.nextInt();
		
		int [] val = new int[n+1];
		
		val[0] = 1;
		
		for(int i = 0 ; i < arr.length ; i++){
			
			for(int j = 0 ; j < n+1 ; j++){
				
				if( j >= arr[i] )
					val[j] = val[j] + val[ (int) j-arr[i]];
			}
		}
		
		System.out.println(val[(int)n]);
	}
}