import java.io.*;
import java.util.Scanner;
import java.util.*;

public class SumIsZero{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int neg = -1,pos = 0,flag = 0;
		
		int arr[] = new int[size];

		for(int i = 0 ; i < size ; i++){
			
			arr[i] = sc.nextInt();
			if(arr[i] < 0){
				
				neg = neg + arr[i];
			}
		}
		
		
		for( int i = 0 ; i < size-1 ; i++){
			pos = arr[i];
			if(pos != (-1)*neg){
				
				for( int j = i+1 ; j < size && flag != 1; j++){
				
					if( arr[j] >= 0 && pos < (-1)*neg && arr[j] < (-1)*neg){

						pos = pos + arr[j];
						if(pos == neg){
					
							flag = 1 ;
						}
					}
				}
			}
			else {
				
				flag = 1;
				break;
			}
		}
		
		if( flag == 1 ){
			
			System.out.println("true");
		}
		else{
			
			System.out.println("false");
		}
	}
}