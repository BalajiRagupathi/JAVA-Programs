import java.io.*;
import java.util.Scanner;

public class countXInRange{
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
		int range[][] = new int[100][100];
		int range1[][] = new int[100][100];
		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Digit ");
			
			num[i] = sc.nextInt();
				
			System.out.println("Enter Range");
			int j = 0;
			range[i][j] = sc.nextInt();
			range1[i][j+1]= sc.nextInt();
		}
		
		int at;
		int count[] = new int[100];
		int j;
		for(int i = 0;i<test;i++){
			count[i]=0;
			int n = 0;
			for(j=range[i][n]+1; j <= range1[i][n+1];j++){
				int temp = j,digits=0;
				while(temp != 0){
					digits++;
					temp = temp/10;
					
				}
				int temp1 = j;
				for(int k = 0;k<digits;k++){
					at = temp1%10;
					System.out.println(at);
					if(at==num[i]){
						count[i] = count[i] + 1;
					}
					temp1=temp1/10;
				}
			}
		}
		
		for(int i = 0;i<test;i++){
		
			System.out.println(count[i]);
		}
	}
}