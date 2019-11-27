import java.util.*;

class Uniquesort{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt();
		int s = sc.nextInt();
		int arr1[] = new int[f];
		int arr2[] = new int[s];
		int vt[] = new int[s+f];
		
		for(int i = 0 ; i < f ; i++)
			arr1[i] = sc.nextInt();
		
		for(int i = 0 ; i < s ; i++){
			arr2[i] = sc.nextInt();	
		}
		int b = 0, flag = 0;
		
		for(int i = 0 ; i < f ; i++){
			
			if(flag == 0){
				
				vt[b] = arr1[i];
				b++;
			}
		}
		for(int i = 0 ; i < s ; i++){
			
			flag = 0;
			if(i < s){
				for(int j = 0 ; j < b ; j++){
				
					if(arr2[i] == vt[j]){
					
						flag = 1;
					}
				}
			}
			if(flag == 0){
				
				vt[b] = arr2[i];
				b++;
			}
		}
		
		Arrays.sort(vt);
		
		for(int i = 0 ; i < vt.length ; i++)
			if(vt[i] != 0)
				System.out.print(vt[i]+" ");
	}
}