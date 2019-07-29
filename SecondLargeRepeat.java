import java.io.*;
import java.util.Scanner;

public class SecondLargeRepeat {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		String s1;
		s1 = sc.next();
		int count[] = new int[100];
		int same = 0,b = 0, x = 0;
		char vt[] = new char[100];
		char idx[] = new char[100];

		for(int i = 0 ; i < s1.length() ; i++){
			
			count[x] = 0;
			same = 0;
			for(int n = 0 ; n < b ; n++){

				if(vt[n] == s1.charAt(i)){

					same=1;
				}
			}
			for(int j = 0 ; j < s1.length() ; j++){

				if(s1.charAt(i) == s1.charAt(j) && same == 0){

					count[x]++;
					idx[x] = s1.charAt(i);
					
				}
			}
			
			if(same == 0){
				
				x++;
			}
			
			b = b+1;
			vt[i] = s1.charAt(i);
		}
		
		for(int i = 0 ; i < x ; i++){
			
			System.out.println(idx[i]);
			System.out.println(count[i]);
		}
		
		int temp;
		char temp1;
		for(int i = 0 ; i < x-1 ; i++){
			for(int j = i+1 ; j < x ; j++){
				
				if(count[i] < count[j]){
					
					temp = count[i];
					count[i] = count[j];
					count[j] = temp;
					
					temp1 = idx[i];
					idx[i] = idx[j];
					idx[j] = temp1;
				}
			}
		}
		
		System.out.println(idx[1]);
		System.out.println(count[1]);
	}
}