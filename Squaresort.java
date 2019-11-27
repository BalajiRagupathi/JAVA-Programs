import java.util.*;

class Squaresort{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = sc.nextInt();
			if(arr[i] < 0)
				arr[i] = arr[i] * (-1);
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = arr[i] * arr[i];
			System.out.print(arr[i]+" ");
		}
	}
}