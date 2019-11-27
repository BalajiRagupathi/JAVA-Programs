import java.util.*;

class Primeles{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a;
		int arr[] = new int[t];
		
		for(int i = 0 ; i < t ; i++){
		
			arr[i] = sc.nextInt();
		}
		
		int premax = 0 , flag = 0;
		for(int i = 0 ; i < t ; i++){
			premax = 0;
			for(int j = 2 ; j < arr[i] ; j++){
				flag = 0;
				for(int k = 2 ; k < j ; k++){

					if( j%k == 0){
						
						flag = 1;
					}
				}
				if(flag == 0){
					
					if(premax <= j){
						
						premax  = j;
					}
				}
				
				
			}
			if(premax > 0)
				System.out.println(premax);
			else
				System.out.println("NO");
		} 
	}
}