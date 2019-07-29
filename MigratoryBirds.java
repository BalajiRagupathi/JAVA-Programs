import java.io.*;
import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int count[] = new int[6];
		int ele[] = new int[6];

		System.out.println("Enter sighted id's");
		for( int i = 0 ; i < size ; i++){

			arr[i] = sc.nextInt();
			if(arr[i] > 5 ){
				
				System.out.println("Enter between range 1 - 5 ");
				i--;
			}
		}

		for(int i = 1 ; i <= 5 ; i++ ){
			count[i] = 0;
			for(int j = 0 ; j < size ; j++){
				
				if(i == arr[j]){
					
					count[i]++;
					ele[i] = i;
				}
			}
		}
		
		int temp,temp1,flag = 0;
		for(int i = 1 ; i < 5 ; i++){
			for(int j = i+1 ; j <=5 ; j++){
				
				if(count[i] < count[j]){
					
					temp = count[i];
					count[i] = count[j];
					count[j] = temp;
					
					temp1 = ele[i];
					ele[i] = ele[j];
					ele[j] = temp1;
					
					flag = 1;
				}
			}
		}
		
		if(flag == 1){
			
			System.out.println(ele[1]);
		}
		else{
			
			System.out.println("-1");
		}
	}
}