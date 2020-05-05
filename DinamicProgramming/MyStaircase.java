import java.util.*;

class MyStaircase{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int last = scanner.nextInt();
		int m = scanner.nextInt();
		
		if( last < 0 )
			System.out.println(0);
		else{
			
			int cache[] = new int[last+m-1];
			
			cache[0] = 1;
			
			if( last > 0 )
				cache[1] = 1;
			
			for(int j = 2 ; j < cache.length && j <= m ; j++)
				cache[j] = cache[j-1] + cache[j-2];
			
			for( int i = m ; i <= last ; i++){
				
				cache[i] = cache[i-1];
				for(int j = 2 ; j <= m ; j++)
					cache[i] = cache[i] + cache[i-j];
			}
			
			System.out.println(cache[last]);
		}
	}
}