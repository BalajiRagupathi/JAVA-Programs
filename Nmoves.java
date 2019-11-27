import java.util.*;

class Nmoves{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = 0;
		}
		
		int index , count = 1 , ones = 0;
		while( count <= size ){
			
			index = -1;
			
			while( index < size ){
				
				index = index + count;
				if(index < size){
					
					if(arr[index] == 0){
						
						arr[index] = 1;
					}
					else
						arr[index] = 0;
				}
			}
			count++;
		}
		
		for(int i = 0 ; i < size ; i++ ){
			
			if(arr[i] == 1){
					
				ones++;
			}
		}
		System.out.println(ones);
	}
}