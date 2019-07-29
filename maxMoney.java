import java.io.*;
import java.util.Scanner;

public class maxMoney{
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
		int money[] = new int[100];
		int rob[] = new int[100];
		
		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Number of Houses");
			
			num[i] = sc.nextInt();
				
			System.out.println("Enter Money");
			
			money[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < test ; i++){

			rob[i] = 0;
			int j = 0;
			while( j < num[i]){
				
				rob[i] = rob[i] + money[i];
				j = j + 2;
			}
		}
		
		System.out.println("Robbed Money");
		for(int i = 0 ; i < test ; i++){

			System.out.println(rob[i]);
		}
	}
}