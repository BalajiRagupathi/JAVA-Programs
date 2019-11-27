import java.io.*;
import java.util.Scanner;
import java.util.*;

public class NearestGreaterNum {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements");
		for(int i = 0 ; i < size ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < size-1 ; i++){
			int b = 0;
			for( int j = i+1 ; j < size ; j++){
				
				int n = i;
				
				b++;
				
				if(arr[i] < arr[j]){
					arr[i] = arr[j];
					if(b > 0){
						
						n = i-j;
					}
					for(int u = n ; u < size-1 ; u++){
						
						arr[u] = arr[u+1];
						System.out.println("uuu"+arr[u]);
					}
					b = 0;
				}
			}
		}
		
		for(int i = 0 ; i < size ; i++){
			
			System.out.println(arr[i]);
		}
	}
}