import java.util.*;

class Myfibonacci{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		if( size < 2 )	
			System.out.println(size);
		else{
					
			int cache[] = new int[size+1];
			
			cache[0] = 0;	
			cache[1] = 1;
			
			for(int i = 2 ; i <= size ; i++)
				cache[i] = cache[i-1] + cache[i-2];
			
			System.out.println(cache[size]);
		}
	}
}