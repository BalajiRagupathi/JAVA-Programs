/*
Input:
7

Output:
 *****
*
* ****
*    *
*    *
*    *
 ****
 
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		
		if( row > 5 && row < 100){
		        
                        System.out.print(" ");
                        for(int i = 2 ; i <= row-1 ; i++){
                                System.out.print("*");
                        }
                        System.out.println();
                        for(int i = 2 ; i <= row/2 ; i++){
                                if( i < row/2 )
                                        System.out.println("*");
                                else {
                                
                                        System.out.print("* ");
                                        for(int j = 3 ; j <= row-1 ; j++){
                                                
                                                System.out.print("*");
                                        }
                                }
                        }
                        System.out.println();
                        
                        for(int i = (row/2) + 1 ; i <= row ; i++){
                                
                                if( i < row ){
                                        
                                        System.out.print("*");
                                        for(int j = 3 ; j <= row-1 ; j++){
                                                System.out.print(" ");
                                        }
                                        System.out.print("*");
                                        System.out.println();
                                }
                                else if( i == row ){
                                        
                                        System.out.print(" ");
                                        for(int j = 3 ; j <= row-1 ; j++)
                                                System.out.print("*");
                                }
                        }
                        
		}
	}
}
