import java.util.*;

class Threearray{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int sum = t , i = 0 , ct = 1 , temp;
		int arr[] = new int[100];
		
		while(ct <= 3){
			
			while(i < sum){
				
				arr[i] = sc.nextInt();
				i++;
			}
			if(ct < 3){
				
				t = sc.nextInt();
				sum = sum + t;
			}
			ct++;
		}
		
		for(int j = 0 ; j < i-1 ; j++){
			for(int k = j+1 ; k < i ; k++){
				
				if(arr[j] > arr[k]){
					
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		for(int j = 0 ; j < i-2 ; j++){
			
			if(arr[j] == arr[j+1] && arr[j] == arr[j+2])
				System.out.println(arr[j]);
		} 
	}
}