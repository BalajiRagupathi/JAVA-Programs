import java.util.*;
import java.lang.*;

public class Sudoku 
{ 
	public static boolean isSafe(int[][] sudoku, int row, int col,  int num)  
	{
		
		for (int d = 0; d < sudoku.length; d++)  
		{ 
			if (sudoku[row][d] == num)  
			{ 
				return false; 
			} 
		} 
		
		for (int r = 0; r < sudoku.length; r++) 
		{ 
			if (sudoku[r][col] == num) 
			{ 
				return false; 
			} 
		} 
		
		int sqrt = (int) Math.sqrt(sudoku.length); 
		int boxRowStart = row - row % sqrt; 
		int boxColStart = col - col % sqrt; 
	  
		for (int r = boxRowStart; r < boxRowStart + sqrt ; r++)  
		{ 
			for (int d = boxColStart; d < boxColStart + sqrt ; d++)  
			{ 
				if (sudoku[r][d] == num)  
				{ 
					return false; 
				} 
			} 
		} 
		
		return true; 
	} 
  
	public static boolean solveSudoku(int[][] sudoku, int n)  
	{ 
		int row = -1; 
		int col = -1; 
		boolean isEmpty = true; 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < n; j++)  
			{ 
				if (sudoku[i][j] == 0)  
				{ 
					row = i; 
					col = j; 
					isEmpty = false;  
					break; 
				} 
			} 
			if (!isEmpty) 
			{ 
				break; 
			} 
		} 
	  
		if (isEmpty)  
		{ 
			return true; 
		} 
	  
		for (int num = 1; num <= n; num++) 
		{ 
			if (isSafe(sudoku, row, col, num)) 
			{ 
				sudoku[row][col] = num; 
				if (solveSudoku(sudoku, n))  
				{ 
			
					return true; 
				}  
				else
				{ 
					sudoku[row][col] = 0;
				} 
			} 
		} 
		return false; 
	} 
  
	public static void print(int[][] sudoku, int N) 
	{ 
		for (int r = 0; r < N; r++) 
		{ 
			for (int d = 0; d < N; d++) 
			{ 
				System.out.print(sudoku[r][d]); 
				System.out.print(" "); 
			} 
			System.out.print("\n"); 
			  
			if ((r + 1) % (int) Math.sqrt(N) == 0)  
			{ 
				System.out.print(""); 
			} 
		} 
	} 
  
	public static void main(String args[]) 
	{ 
	  
		Scanner scanner = new Scanner(System.in);
		
		int[][] sudoku = new int[9][9];
		
		for(int i = 0 ; i < 9 ; i++){
			for(int j = 0 ; j < 9 ; j++){
			
				sudoku[i][j] = scanner.nextInt();
			}
		}
		
		int N = 9; 
	  
		if (solveSudoku(sudoku, N)) 
		{ 
			print(sudoku, N);
		}  
		else
		{ 
			System.out.println("No solution"); 
		}
	} 
} 