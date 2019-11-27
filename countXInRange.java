import java.io.*;
import java.util.Scanner;

public class countXInRange{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
	
		int test = sc.nextInt();
			
		int num[] = new int[test];
		int range[] = new int[test];
		int range1[] = new int[test];
		for(int i = 0; i < test;i++){
			
			System.out.println("Enter Element to Find");
			num[i] = sc.nextInt();
			System.out.println("Enter Number of Range1");
			range[i] = sc.nextInt();
			System.out.println("Enter Number of Range2");
			range1[i]= sc.nextInt();
		}
		
		int at;
		int count[] = new int[test];
		
		for(int i = 0;i<test;i++){
			
			count[i]=0;
			
			for(int j =range[i]+1; j < range1[i] ; j++){
				
				int temp = j,digits=0;
				
				while(temp != 0){
					
					digits++;
					at = temp % 10;
					temp = temp/10;
					
					if(at == num[i]){
						
						count[i] = count[i] + 1;
					}
				}
			}
		}
		
		for(int i = 0 ; i < test ; i++){
		
			System.out.println(count[i]);
		}
	}
}