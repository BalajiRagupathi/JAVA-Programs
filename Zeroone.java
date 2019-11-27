import java.util.*;

class Zeroone{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int arr[] = new int[size];
		int flag = 0;
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = scanner.nextInt();
			if(arr[i] > 1)
				flag = 1;
		}
		
		if(flag == 0){
			
			Arrays.sort(arr);
			for(int i = 0 ; i < size ; i++)
				System.out.print(arr[i]+" ");
		}
		else
			System.out.println("Invalid Input");
	}
}