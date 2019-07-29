import java.io.*;
import java.util.Scanner;

public class rotateArrayNTimes{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
	
		int test;
		do {
			System.out.println("Enter number of test case you need between 1 - 10");
			test = sc.nextInt();
			if(test < 0 || test > 10){
				System.out.println("Enter a valid Integer");
			}
		}while(test < 0 || test > 10);

		int num[] = new int[100];
		int rotate[] = new int[100];
		int arr[][] = new int[100][100];
		
		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Number of Elements count");
			
			num[i] = sc.nextInt();
				
			System.out.println("Enter Rotating position");
			
			rotate[i] = sc.nextInt();

			System.out.println("Enter Elements");
			
			for(int j=0;j<num[i];j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < test ; i++){
			for(int j = 0 ;  j != rotate[i] ; j++){
				
				
				int n = 0 , temp = arr[i][0];
				do{

					arr[i][n] = arr[i][n+1];
					n++;
				}while( n < num[i]);
				arr[i][num[i]-1] = temp;
			}						
		}

		System.out.println("Rotated Array");
		for(int i = 0 ; i < test ; i++){

			System.out.println("Test Case: "+i+1);
			for(int j = 0 ; j < num[i] ; j++){

				System.out.println(arr[i][j]);
			}			
		}
	}
}