import java.util.*;

class Grandchildren{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		String arr[][] = new String[size][2];
		
		for(int i = 0 ; i < size ; i++){
			
			for(int j = 0 ; j < 2 ; j++){
				
				arr[i][j] = scanner.next();
			}
		}
		
		String grand_father = scanner.next();
		int grdcld = 0;
		
		for(int i = 0 ; i < size ; i++){
			
			if(arr[i][1].equals(grand_father)){
				
				String son = arr[i][0];
				for(int k = 0 ; k < size ; k++){
					
					if(arr[k][1].equals(son))
						grdcld++;
				}
			}
		}
		
		System.out.println(grdcld);
	}
}