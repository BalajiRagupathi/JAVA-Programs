import java.util.*;

class Water{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int a[] = new int[num];
		
		for(int i = 0 ; i < num ; i++)
			a[i] = scanner.nextInt();
		
		int sum = 0;
		for(int i = 0 ; i < num-1 ; i++){
			
			int sub = 0;
			for(int j = i+1 ; j < num ; j++){
				 
				if( a[i] < a[j] ){
					
					i = j-1;
					break;
				}
				
				sub = sub + a[i] - a[j];
				
				if( j == num-1 && i+1 != j){
					
					if( a[i+1] < a[j] ){
						sub = sub -  ((a[i] - a[j]) * j);
						i = j-1;
						break;
					}
					else	
						sub = 0;
				}
			}
			
			sum = sum + sub;
		}
		
		System.out.println(sum);
	}
}