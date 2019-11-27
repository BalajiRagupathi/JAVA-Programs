import java.util.*;

class Matrixchar{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter single number size");
		int size = scanner.nextInt();
		char matrix[][] = new char [size][size];
		
		System.out.println("Enter elements");
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
			
				matrix[i][j] = scanner.next().charAt(0);
			}
		}
		
		System.out.println("Enter key");
		String key = scanner.next();
		int bk[] = new int[100];
		
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
			
				String st = "";
				st = st + matrix[i][j];
				if(key.contains(st))
					continue;
				else
					matrix[i][j] = '*';
			}
		}
		
		System.out.println("Unwanted elements");
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
			
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int s1 = 0 , bkflag = 0;
		
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
			
				int lrflag = 0 , st = 0;
				String pt;
				bkflag = 0;
				
				if(matrix[i][j] != '*' && j+(key.length()) <= size){
					
					pt = "";
					for(int k = j ; k < j+key.length() ; k++){
						
						
						if(matrix[i][k] != '*'){
							
							pt = pt + matrix[i][k];
						}
						
					}
					StringBuffer str = new StringBuffer(pt);
					str = str.reverse();
					String str1 = str.toString();
					
					if( str1.equals(key) || pt.equals(key) ){
							
						for(int k = j ; k < j+key.length() ; k++){
								
							bk[s1] = (i*10)+k;
							s1++;
						}
					}
				}
				
				if(matrix[i][j] != '*' && i+(key.length()) <= size){
					
					pt = "";
					for(int k = i ; k < i+key.length() ; k++){
						
						
						if(matrix[k][j] != '*'){
							
							pt = pt + matrix[k][j];
						}
						
					}
					StringBuffer str = new StringBuffer(pt);
					str = str.reverse();
					String str1 = str.toString();
					
					if( str1.equals(key) || pt.equals(key) ){
							
						for(int k = i ; k < i+key.length() ; k++){
								
							bk[s1] = (k*10)+j;
							s1++;
						}
					}
				}
				
				if(matrix[i][j] != '*' && i+(key.length()) <= size && j+(key.length()) <= size){
					
					pt = "";
					for(int k = i , l = j; k < i+key.length() && l < j+key.length() ; k++ , l++){
						
						
						if(matrix[k][l] != '*'){
							
							pt = pt + matrix[k][l];
						}
						
					}
					StringBuffer str = new StringBuffer(pt);
					str = str.reverse();
					String str1 = str.toString();
					if( str1.equals(key) || pt.equals(key) ){
							
						for(int k = i , l = j; k < i+key.length() && l < j+key.length() ; k++ , l++){
								
							bk[s1] = (k*10)+l;
							s1++;
						}
					}
				}
				
				if(matrix[i][j] != '*' && i+(key.length()) <= size && j-(key.length()-1) >= 0){
					
					pt = "";
					for(int k = i , l = j; k < i+key.length() && l >= j-(key.length()-1) ; k++ , l--){
						
						
						if(matrix[k][l] != '*'){
							
							pt = pt + matrix[k][l];
						}
					}
					
					StringBuffer str = new StringBuffer(pt);
					str = str.reverse();
					String str1 = str.toString();
					
					if( str1.equals(key) || pt.equals(key) ){
							
						for(int k = i , l = j; k < i+key.length() && l >= j-(key.length()-1) ; k++ , l--){
								
							bk[s1] = (k*10)+l;
							s1++;
						}
					}
				}
				
				for(int b = 0 ; b < s1 ; b++){
					
					if( (i*10)+(j) == bk[b]){
						
						bkflag = 1;
					}
				}
				
				if(lrflag != key.length() && bkflag == 0 && matrix[i][j] != '*')
					matrix[i][j] = '1';
			}
		}
		
		System.out.println("String found");
		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size ; j++){
			
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(s1);
	}
}