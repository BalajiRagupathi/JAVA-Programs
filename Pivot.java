import java.util.*;
import java.util.Collections;

class Pivot{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int arr[] = new int[t];
		int les[] = new int[t];
		int eq[] = new int[t];
		int gr[] = new int[t];
		
		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int piv = sc.nextInt();
		int min = 0 , last = 0 , eql = 0 , temp;
		
		for(int i = 0 ; i < t-1 ; i++){
			for(int j = i+1 ; j < t ; j++){
				
				if(arr[i] < arr[j]){
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		for(int i = 0 ; i < t ; i++){
			
			if(arr[i] < piv){
				
				les[min] = arr[i];
				min++;
			}
			else if(arr[i] == piv){
				
				eq[eql] = arr[i];
				eql++;
			}
			else if(arr[i] > piv){
				
				gr[last] = arr[i];
				last++;
			}
		}
		
		for(int i = 0 ; i < les.length && les[i] != 0 ; i++)
			System.out.print(les[i]+" ");
		for(int i = 0 ; i < eq.length && eq[i] != 0; i++)
			System.out.print(eq[i]+" ");
		for(int i = 0 ; i < gr.length && gr[i] != 0; i++)
			System.out.print(gr[i]+" ");
	}
}