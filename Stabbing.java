import java.util.*;

class Stabbing{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int above[] = new int[size];
		int below[] = new int[size];
		
		for(int i = 0 ; i < size ; i++){
			
			above[i] = scanner.nextInt();
			below[i] = scanner.nextInt();
		}
		
		Arrays.sort(above);
		Arrays.sort(below);
		
		System.out.print(below[0]+" "+above[size-1]);
	}
}