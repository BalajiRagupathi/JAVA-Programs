/*
5
6

X X X X X   
X 0 0 0 X   
X 0 X 0 X   MID 3C 3R 0'S
X 0 X 0 X   
X 0 0 0 X   
X X X X X   

6
6

X X X X X X
X 0 0 0 0 X
X 0 X X 0 X  NO MID 3C 4C 3R X'S
X 0 X X 0 X
X 0 0 0 0 X
X X X X X X

8
8

X X X X X X X X
X 0 0 0 0 0 0 X
X 0 X X X X 0 X
X 0 X 0 0 X 0 X
X 0 X 0 0 X 0 X
X 0 X X X X 0 X
X 0 0 0 0 0 0 X
X X X X X X X X

8
7

X X X X X X X X
X 0 0 0 0 0 0 X
X 0 X X X X 0 X
X 0 X 0 0 X 0 X
X 0 X X X X 0 X
X 0 0 0 0 0 0 X
X X X X X X X X


8
3

X X X X X X X X
X 0 0 0 0 0 0 X
X X X X X X X X
*/


import java.util.*;

class Patternpro{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		char arr[][] = new char[row+1][col+1];
		int tr = row , tc = col;
		
		for(int i = 1 ; i <= row ; i++){
	
			for(int j = i ; j <= col && j == i ; j++){
				
				int k = 0 , l = 0 , m = 0 , n = 0;
				if(i % 2 != 0){
					
					for(k = j ; k <= col ; k++){
					
						arr[i][k] = 'X';
					}
					
					for(l = i + 1 ; l <= row ; l++){
					
						arr[l][k-1] = 'X';
					}
					
					col--;
					
					for(m = k - 1 ; m >= j ; m--){
					
						arr[l-1][m] = 'X';
					}
					
					row--;
					
					for(n = l - 1 ; n >= i ; n--){
					
						arr[n][j] = 'X';
					}
				}
				else{
					for(k = j ; k <= col ; k++){
					
						arr[i][k] = '0';
					}
					
					for(l = i + 1 ; l <= row ; l++){
					
						arr[l][k-1] = '0';
					}
					
					col--;
					
					for(m = k - 1 ; m >= j ; m--){
					
						arr[l-1][m] = '0';
					}
					
					row--;
					
					for(n = l - 1 ; n >= i ; n--){
					
						arr[n][j] = '0';
					}
				}
			}
		}
		
		for(int i = 1 ; i <= tr ; i++){
			for(int j = 1 ; j <= tc ; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
