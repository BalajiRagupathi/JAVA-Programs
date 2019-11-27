import java.util.*;

class Missing{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int arr[] = new int[t+1];
		
		for(int i = 1 ; i <= t ; i++){
		
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int flag = 1 , b = 1;
		
		for(int i = 1 ; i <= arr[t] ; i++){
		
			if(i != arr[b]){
				System.out.println("N"+i);
				flag = 0;
			}
			else
				b++;
		}
		if(flag == 1)
			System.out.println(-1);
	}
}