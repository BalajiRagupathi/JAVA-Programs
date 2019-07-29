import java.io.*;
import java.util.Scanner;
import java.util.*;

public class lillyron {
	public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			
			int arr[] = new int[100];
			
			System.out.println("Enter Elements");
			for(int i = 0 ; i < size ; i++){
				
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter Day");
			int day = sc.nextInt();
			
			System.out.println("Enter Month");
			int month = sc.nextInt();
			
			int ct = 0;
			
			if(month == 1){
				
				for(int i = 0 ; i < size ; i++){
					
					if(arr[i] == day){
						
						ct++;
					}
				}
			}
			else {
				for(int i = 0 ; i < size ; i++){
					int sum = 0,nt=1;
					for( int j = i ; nt <= month ; j++) {
					
						sum = sum + arr[j];
						if(sum == day && nt == month){
							
							ct++;
							System.out.println("co="+ct);
						}
						nt++;
					}
				}
			}
			
			System.out.println("count="+ct);
	}
}