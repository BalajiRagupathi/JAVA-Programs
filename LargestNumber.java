import java.io.*;
import java.util.Scanner;
import java.util.*;

class LargestNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size,temp,temp1;

		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		
		
		int count[]=new int[size];
		int arr[]=new int[size];
		
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			int dig=0;
			count[i] = 1;
			temp=arr[i];
			while(temp!=0)
			{
				dig++;
				temp=temp/10;
			}
			for(int j = 1 ; j < dig ; j++){
				
				count[i] = count[i] * 10;
			}
		}
		
		for(int i = 0 ; i < size-1 ; i++){
			for(int j = i+1 ; j < size ; j++){
				
				int dig = arr[i] / count[i];
				int digt = arr[j] / count[j];
				
				if(dig < digt){
					
					
					temp = count[i];
					count[i] = count[j];
					count[j] = temp;
					
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
				
				else if(dig == digt){
					
					if(count[i] > count[j]){
						
						temp=count[i];
						count[i]=count[j];
						count[j]=temp;
					
						temp1 = arr[i];
						arr[i] = arr[j];
						arr[j] = temp1;
					}
					
					else if(count[i] == count[j]){
						
						if(arr[i] < arr[j]) {
							
							temp=count[i];
							count[i]=count[j];
							count[j]=temp;
					
							temp1 = arr[i];
							arr[i] = arr[j];
							arr[j] = temp1;
						}
					}
				}
			}
		}
		
		for(int i = 0 ; i < size ; i++){
			
			System.out.print(arr[i]);
		}
	}
}