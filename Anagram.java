import java.io.*;
import java.util.Scanner;

public class Anagram{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
	
		String s1,s2;
		s1 = sc.next();
		s2 = sc.next();
		char vt[] = new char[100];
		int n = 0;

		for(int i = 0; i < s2.length() && s1.length() == s2.length(); i++){
			for(int j = 0; j < s2.length(); j++){

				if( s1.charAt(i) == s2.charAt(j)){
					vt[i] = s2.charAt(i);
					n++;
					break;
				}
			}			
		}

		if(n == s2.length()){

			System.out.println("Strings are Anagram");		
		}
		else{

			System.out.println("Strings are not Anagram");
		}
	}
}