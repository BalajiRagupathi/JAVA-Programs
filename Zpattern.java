import java.util.*;

class Zpattern{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt();
		int leftspace = 0;
		
		for(int i = rows ; i > 0 ; i--){
			
			if(i != 1 && i != rows){
				for(int k = 1 ; k <= i+(i-2) ; k++){
					
					System.out.print(" ");
				}
				System.out.print(i+" ");
			}
			else{
				for(int j = 1 ; j <= rows ; j++){
					
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}