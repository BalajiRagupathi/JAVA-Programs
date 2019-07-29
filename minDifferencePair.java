import java.io.*;
import java.util.Scanner;

public class minDifferencePair{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
	
		int test,sub;
		do {
			System.out.println("Enter number of test case you need between 1 - 10");
			test = sc.nextInt();
			if(test < 0 || test > 10){
				System.out.println("Enter a valid Integer");
			}
		}while(test < 0 || test > 10);

		int num[] = new int[100];
		int range[][] = new int[100][100];
		
		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Number of elements inserting");
			do{
				num[i] = sc.nextInt();
				if(num[i] <= 1){
					System.out.println("Enter a valid Integer");
				}
			}while(num[i] <= 1);
				
			System.out.println("Enter Elements");
			
			for(int j=0;j<num[i];j++){
				range[i][j] = sc.nextInt();
			}
		}

		int md[] = new int[100];
		for(int i = 0 ; i < test ; i++){
			md[i] = range[i][0] - range[i][1];
			for(int j=0 ; j < num[i] ; j++){
				for(int k = 0 ; k < num[i] ; k++){
					
					if(j != k){
		
						sub = range[i][j] - range[i][k];
						if(sub < 0){
							sub = sub*(-1);
							System.out.println("sub="+range[i][j]+"-"+range[i][k]+"="+sub);
							if(sub <= md[i]){
								md[i]=sub;
								System.out.println("md="+md[i]);
							}
						}
						else if(sub >=0){
							System.out.println("sub="+range[i][j]+"-"+range[i][k]+"="+sub);
							if(sub <= md[i]){
								md[i]=sub;
								System.out.println("md="+md[i]);
							}
						}
					}
				}
			}
		}
		for(int i = 0 ; i < test ; i++){
			System.out.println("ANSWER = "+md[i]);
		}
	}
}