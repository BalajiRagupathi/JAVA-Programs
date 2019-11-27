import java.io.*;
import java.util.Scanner;
import java.util.*;

class MatrixShift {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Row");
		int Row = sc.nextInt();
		
		System.out.println("Enter the Column");
		int Column = sc.nextInt();
		
		int mat[][] = new int[Row][Column];
		
		System.out.println("Enter the Elements");
		for(int i = 0 ; i < Row ; i++){
			for(int j = 0 ; j < Column ; j++){
				
				mat[i][j] = sc.nextInt();
			}
		}
		int m = Row , n = Column;
		int row = 0, col = 0; 
        int prev, curr; 
		
        while (row < m && col < n) 
        { 
            if (row + 1 == m || col + 1 == n) 
                break; 
			
            prev = mat[row + 1][col]; 
      
            for (int i = col; i < n; i++) 
            { 
                curr = mat[row][i]; 
                mat[row][i] = prev; 
                prev = curr; 
            } 
            row++; 
			
            for (int i = row; i < m; i++) 
            { 
                curr = mat[i][n-1]; 
                mat[i][n-1] = prev; 
                prev = curr; 
            } 
            n--; 
			
            if (row < m) 
            { 
                for (int i = n-1; i >= col; i--) 
                { 
                    curr = mat[m-1][i]; 
                    mat[m-1][i] = prev; 
                    prev = curr; 
                } 
            } 
            m--; 
			
            if (col < n) 
            { 
                for (int i = m-1; i >= row; i--) 
                { 
                    curr = mat[i][col]; 
                    mat[i][col] = prev; 
                    prev = curr; 
                } 
            } 
            col++; 
        }
		
		System.out.println("Rotated Elements are"); 
		
        for (int i = 0; i < Row; i++) { 
			for (int j = 0; j < Column; j++){
				
				System.out.print( mat[i][j] + " "); 
			}
            System.out.print("\n");
		}	
	}
}