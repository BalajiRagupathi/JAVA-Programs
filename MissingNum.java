import java.io.*;
import java.util.Scanner;

public class MissingNum {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		
			int ln,n1,n2;
			
			int arr[] = new int[100];
		
		do{
			System.out.println("Enter a range");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			ln = n2 - n1;
			if(ln < 0 || n1 == n2){
				
					System.out.println("Enter a valid range");
			}
		}while(ln < 0 || n1 == n2);
		
		for(int i = 0 ; i <= ln ; i++){

			arr[i] = sc.nextInt();
		}

		int temp ;
		for(int i = 0 ; i <= ln-1 ; i++){
			for(int j = i+1 ; j <= ln; j++){
				if(arr[i] > arr[j]){

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int n = 0 , flag=0;

		for(int i = n1 ; i <= n2 ; i++){
		
			if(i == arr[n]){
			
				n++;
			}
			else if( i != arr[n] && flag == 0){
				
				System.out.println("no "+i);
				flag = 1;
			}
		}
	}
}