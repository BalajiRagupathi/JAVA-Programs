import java.util.*;

class Invertedtriangle{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int arr[] = new int[test];
		
		for(int i = 0 ; i < test ; i++){
			
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < test ; i++){
			
			if(arr[i] > 0){
				
				int value = (arr[i] * (arr[i] + 1)) / 2;
				for(int j = arr[i] ; j > 0 ; j--){
					
					for(int k = 0 ; k < j ; k++){
						
						System.out.print(value+" ");
						value--;
					}
					System.out.println(	);
				}
			}
			else
				System.out.println("Ivalid Input");
		}
	}
}