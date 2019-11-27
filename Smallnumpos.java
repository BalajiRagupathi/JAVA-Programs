import java.util.*;

class Smallnumpos{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int arr[] = new int[t+1];
		
		for(int i = 1 ; i <= t ; i++){
		
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		Arrays.sort(arr);
		if( k <= t)
			System.out.println(arr[k]);
		else 
			System.out.println("Invalid Input");
	}
}