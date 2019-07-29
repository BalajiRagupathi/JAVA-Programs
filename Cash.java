import java.io.*;
import java.util.Scanner;

public class Cash {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int temp = num,q;
		System.out.println("Enter number of different notes you have");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter  amounts");
		for( int i = 0 ; i < size ; i++){

			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < size ; i++ ){

			if(temp >= arr[i]){

				q = temp / arr[i];
				temp = temp%arr[i];
				System.out.println("Number of "+arr[i]+" is "+q);
			}
		}		
	}
}