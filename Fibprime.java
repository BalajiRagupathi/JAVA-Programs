import java.util.*;

class Fibprime{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int start = 0 , end = 1 , key , sum , pri = 2;
		
		key = sc.nextInt();
		
		for(int i = 0 ; i < key ; i++){
			
			for(int k = 2 ; k <= pri/ 2 ; k++){
				
				if(pri%k == 0){
					
					k = 2;
					pri++;
				}
			}
			
			System.out.print(pri);
			System.out.print(" ");
			System.out.print(start);
			if(i != key)
				System.out.print(" ");
			sum = start + end;
			start = end;
			end = sum;
			pri++;
		}
	}
}