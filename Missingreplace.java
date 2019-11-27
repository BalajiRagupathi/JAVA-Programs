import java.util.*;

class Missingreplace{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int arr[] = new int[t];
		int b = 0;
		
		for(int i = 0 ; i < t ; i++){
		
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr[t-1]+1 ; i++){
			
			if(arr[b] == i){
				
				System.out.print(arr[b]);
				b++;
			}
			else
				System.out.print("-1");
			
			System.out.print(" ");
		} 
	}
}