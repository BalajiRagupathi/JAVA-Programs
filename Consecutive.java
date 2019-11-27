import java.util.*;

class Consecutive{
	public static void main(String args[]){

			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			int arr[] = new int[t];
			
			for(int i = 0 ; i < t ; i++){
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			int ct = 1 , premax = 0 , flag = 0;
			
			for(int i = 0 ; i < t ; i++){
				System.out.println("INP"+arr[i]);
				
				if(i != t - 1){
					
					if(arr[i] - arr[i+1] == -1){
					
						ct++;
						flag = 1;
						if(ct > premax){
						
							premax = ct;
						}
						System.out.println("C"+arr[i]);
					}
					else
						ct = 1;
				}
				
			}
			if(flag == 1)
				System.out.println(premax);
	}
}