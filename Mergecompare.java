import java.util.*;

class Mergecompare{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int arr1[] = new int[first];
		
		for(int i = 0 ; i < first ; i++){
			
			arr1[i] = sc.nextInt();
		}
		
		int end = sc.nextInt();
		int arr2[] = new int[end];
		
		for(int i = 0 ; i < end ; i++){
			
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[first+end];
		int temp = 0 , limit = end , first_temp = 0 , end_temp = 0 , flage , flagf ;
		if(first > end)
			limit = first;
		
		for(int i = 0 ; i < limit ; i++){
			
			flage = 0;
			flagf = 0;
			
			if(i < first)
				first_temp = arr1[i];
				
			if(i < end)
				end_temp = arr2[i];
			
			if( first_temp != end_temp ){
				
				for(int k = 0 ; k < temp ; k++){
					
					if( first_temp == arr3[k] )
						flagf = 1;
					if( end_temp == arr3[k] )
						flage = 1;
				}
				if( flagf == 0 ){
					
					arr3[temp] = first_temp;
					temp++;
				}
				if(flage == 0 ){
					
					arr3[temp] = end_temp;
					temp++;
				}
				
					System.out.println("Eq");
			}
			else if( first_temp == end_temp && first_temp != 0 && end_temp != 0){
				
				for(int k = 0 ; k < temp ; k++){
					
					if( first_temp == arr3[k] )
						flagf = 1;
				}
				if( flagf == 0 ){
					
					arr3[temp] = first_temp;
					temp++;
				}
			}
			else
				temp++;
		}
		
		int temp1;
		
		for(int i = 0 ; i < temp ; i++){
			for(int j = 0 ; j < temp-1 ; j++){
				
				if(arr3[i] < arr3[j]){
					
					temp1 = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp1;
				}
			}
		}
		
		for(int i = 0 ; i < temp ; i++){
			
			System.out.print(arr3[i]);
			if(i < temp - 1)
				System.out.print(" ");
		}
	}
}