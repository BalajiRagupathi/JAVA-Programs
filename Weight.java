import java.util.*;
import java.lang.*;

class Weight{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int arr[] = new int[t];
		int wt[] = new int[t];
		
		for(int i = 0 ; i < t ; i++){
		
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < t ; i++){
		
			wt[i] = 0;
			double sq  = Math.sqrt(arr[i]);
			if(arr[i]%2 == 0)
				wt[i] = wt[i] + 3;
			if(arr[i] % 4 == 0 && arr[i] % 6 == 0 )
				wt[i] = wt[i] + 4;
			if( (sq - Math.floor(sq)) == 0)
				wt[i] = wt[i] + 5;
		}
		
		int temp;
		
		for(int i = 0 ; i < t-1 ; i++){
			for(int j = i+1 ; j < t ; j++){
				if(wt[i] > wt[j]){
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					temp = wt[i];
					wt[i] = wt[j];
					wt[j] = temp;
				}
				else if(wt[i] == wt[j]){
					if(arr[i] > arr[j]){
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						
						temp = wt[i];
						wt[i] = wt[j];
						wt[j] = temp;
					}
				}
			}
		}
		
		for(int i = 0 ; i < t ; i++){
		
			System.out.print(arr[i]+" ");
		}
	}
}