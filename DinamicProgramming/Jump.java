import java.util.*;

class Jump{

	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i = 0 ; i < test ; i++){
		
			int size = scanner.nextInt();
			
			int arr[] = new int[size];
			
			for(int j = 0 ; j < size ; j++)
				arr[j] = scanner.nextInt();
				
			int jump = -1;
			if( arr[0] != 0 ){
			
				jump = 0;
				
				for(int j = 0 ; j < size ; j++){
				
					if(  arr[j] != 0 ){
					
						System.out.println(j+" "+arr[j]);
						if( arr[j]+jump < size-1 ){
							
							int max = Integer.MIN_VALUE;
							int pos = j;
							for(int k = j+1 ; k <= arr[j]+j ; k++){
								
								if( max < arr[k] ){
									
									max = arr[k];
									pos = k;
								}
							}
							
							jump++;
							j = pos-1;
						}
						
						if( j >= size-1 ){
							
							jump++;
							break;
						}
					}
					
					if( arr[j] == 0 || arr[j] < 0 ){
						
						jump = -1;
						break;
					}
				}
			}
			
			System.out.println(jump);
		}
	}
}