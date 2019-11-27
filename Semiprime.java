import java.util.*;

class Semiprime{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size*2];
		
		for(int i = 0 ; i < size*2 ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < size*2 ; i = i + 2){
			
			int semi = 0 , temp1;
			
			if( arr[i] > arr[i+1]){
				
				temp1 = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp1;
			}
			
			for(int j = arr[i] ; j <= arr[i+1] ; j++){
				
				if(j >= 4){
					int flag = 0;
					
						for(int k = 2 ; k <= j/2 && flag == 0 ; k++){
							
							int ct = 0;
							
							for(int m = 2 ; m <= k && ct < 2; m++){
								
								if( k%m == 0 ){
									
									ct++;
								}
							}
							if( ct == 1){
								
								int temp = j / k , ct1 = 0;
								
								if( temp*k == j){
									for(int n = 2 ; n <= temp && ct1 < 2; n++){
									
										if( temp%n == 0 ){
										
											ct1++;
										}
									}
									
									if(ct1 == 1){
										
										semi++;
										flag = 1;
									}
								}
							}
							else if( k >= j/2 ){
								
								flag = 1;
							}
						}
				}
			}
			System.out.print(semi+" ");
		}
	}
}