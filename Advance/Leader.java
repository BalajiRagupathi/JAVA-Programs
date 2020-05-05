import java.util.*;

class Leader{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int arr [] = new int[size];
		
		for( int i = 0 ; i < size ; i++ ){
			
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < size  ; i++){
			
			int flag = 0;
			if( i != size - 1 ){
				for(int j = i+1 ; j < size ; j++){
					
					if( arr[i] < arr[j]){
						
						flag = 1;
						break;
					}
				}
			}
			
			if( flag == 0 )
				System.out.print(arr[i]+" ");
		}
	}
}