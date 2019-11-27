import java.util.*;

class Intersection{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int firstsize = scanner.nextInt();
		int secondsize = scanner.nextInt();
		int arr1[] = new int[firstsize];
		int arr2[] = new int [secondsize];
		int minsize;
		
		for(int i = 0 ; i < firstsize ; i++){
			
			arr1[i] = scanner.nextInt();
		}
		for(int i = 0 ; i < secondsize ; i++){
			
			arr2[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(firstsize > secondsize)
			minsize = secondsize;
		else
			minsize = firstsize;
		
		for(int i = 0 ; i < minsize ; i++){
			
			if(arr1[i] == arr2[i]){
				System.out.print(arr1[i]+" ");
			}
		}
	}
}