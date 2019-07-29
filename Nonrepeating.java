import java.io.*;
import java.util.Scanner;

public class Nonrepeating{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
	
		String s1,s2;
		s1 = sc.next();
		char vt[] = new char[100];	
		int b = 0;

		for(int i = 0; i < s1.length() ; i++){
			
			int flag = 0;
			for(int j = 0; j < s1.length() ; j++){

				if( s1.charAt(i) == s1.charAt(j) && i != j ){

					flag = 1;
				}
			}
			if( flag == 0 ){

				b++;
				vt[b] = s1.charAt(i);break;
			}			
		}

		
		if(b != 0){

			System.out.println(vt[b]);			
		}
		else{

			System.out.println("-1");	
		}
	}
}