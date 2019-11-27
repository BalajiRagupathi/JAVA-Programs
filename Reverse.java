import java.util.*;

class Reverse{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a;
		int arr[] = new int[t];
		
		for(int i = 0 ; i < t ; i++){
		
			arr[i] = sc.nextInt();
		}
		
		int last = t-1;
		for(int i = 0 ; i < t ; i++){
			
			if(i < last){
				a = arr[i];
				arr[i] = arr[last];
				arr[last] = a;
				last--;
			}
			System.out.println(arr[i]);
		} 
	}
}