import java.io.*;
import java.util.Scanner;
import java.util.*;

public class TimeStamp {
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of entries");
		int size = sc.nextInt();
		
		
		
		int time[] = new int[size];
		int people[] = new int[size];
		String str[] = new String[size];
		String s1[] = new String[size];
		
		for(int i = 0 ; i < size ; i++){
			
			s1[i] = sc.next();
		}
		
		for(int i = 0 ; i < size ; i++){
			
			String leftParen = sc.next();
			time[i] = sc.nextInt();
			String comma1 = sc.next();
			people[i] = sc.nextInt();
			String comma2 = sc.next();
			str[i] = sc.next();
			String rightParen = sc.next();
		}
		
		int count1 = 0,count2 = 0,di = 0,time1 = -1 , time2 = -1;
		
		for(int i = 0 ; i < size; i++){
			
			if( str[i].equals("enter")){
				
				di=i;
					
				count1 = count1 + people[i];
				
				
			}
			else if ( str[i].equals("exit") && people[i] != 0 ){
						
				if(count1 > count2){
					
					count2 = count1;
					time1 = time[di];
					time2 = time[i];
				}
				count1 = count1 - people[i];
		
			}
		}
		
		System.out.println(time1+" "+time2);
	}
}
