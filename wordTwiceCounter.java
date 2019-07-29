import java.io.*;
import java.util.Scanner;

public class wordTwiceCounter{
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
		String arr[][] = new String[100][100];

		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Number of Words");
			
			num[i] = sc.nextInt();
							
			System.out.println("Enter Words");
			for(int j = 0 ; j < num[i] ; j++){
				
				arr[i][j] = sc.next();
			}
		}
		
		int count[] = new int[100];
		String vt[][] = new String[100][100];
		int flag,same = 0;
		for(int i = 0; i < test ; i++){
			int b=1;
			count[i] = 0;
			for(int j = 0 ; j < num[i] ; j++){
				flag = 0; 
				for(int k = 0 ; k < num[i]  ; k++){
					
					if(arr[i][j].equals(arr[i][k]) && j != k && same == 0){
						
						flag++;						
					}
				}
				if(flag == 1){
					System.out.println("Flag = 1"+arr[i][j]);
					count[i]++;
				}
				vt[i][j+1] = arr[i][j];b = b+1;same = 0;
				for(int n = 1 ; n < b ; n++){
						
						if(vt[i][n].equals(arr[i][j+1])){
							same = 1;
							System.out.println("LOOPSAME"+vt[i][n]);
						}
					}
				System.out.println(vt[i][j+1]);
			}
		}
		
		for(int i = 0; i < test ; i++){

			System.out.println(count[i]);
		}
	}
}