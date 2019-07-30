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
		for(int i = 0 ; i < size ; i++){
			
			String leftParen = sc.next();
			time[i] = sc.nextInt();
			String comma1 = sc.next();
			people[i] = sc.nextInt();
			String comma2 = sc.next();
			str[i] = sc.next();
			String rightParen = sc.next();
		}
		
		int count1 = 0,count2 = 0,di = 0,time1 = -1 , time2 = -1, flag = 0;
		
		for(int i = 0 ; i < size; i++){
			
			System.out.println(str[i]+"111");
			if( str[i].equals("enter")){
				
				System.out.println(str[i]+"222");
					if(flag==0){
						
						di=i;
					}
				count1 = count1 + people[i];
				flag = 1;
			}
			else if ( str[i].equals("exit") ){
				
				System.out.println(str[i]+"444");			
				if(count1 > count2){
					
					count2 = count1;
					time1 = time[di];
					time2 = time[i];
					System.out.println(time1+" 555 "+time2);
				}
				count1 = count1 - people[i];
				flag = 0;
			}
		}
		
		System.out.println(time1+" "+time2);
	}
}
