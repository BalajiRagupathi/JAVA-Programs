import java.util.*;

class Xpattern{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt();
		int rightspace = (2*(rows-1)+1) - 2;
		int leftspace = 0;
		
		for(int i = 0 ; i < (2*(rows-1)+1)/2 ; i++){
			
			for(int j = 0 ; j < leftspace ; j++)
				System.out.print(" ");
			
			System.out.print("*");
			for(int k = 0 ; k < rightspace ; k++)
				System.out.print(" ");
			
			System.out.print("*");
			System.out.println();
			
			rightspace = rightspace - 2;
			leftspace = leftspace + 1;
			
		}
		
		for(int i = ((2*(rows-1)+1)/2) ; i < (2*(rows-1)+1) ; i++){
			
			for(int j = 0 ; j < leftspace ; j++)
				System.out.print(" ");
			
			System.out.print("*");
			for(int k = 0 ; k < rightspace ; k++)
				System.out.print(" ");

			if(i != ((2*(rows-1)+1)/2))
				System.out.print("*");
			System.out.println();
			
			rightspace = rightspace + 2;
			leftspace = leftspace - 1;
		}
	}
}