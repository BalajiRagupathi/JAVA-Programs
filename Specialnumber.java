import java.util.*;

class Specialnumber{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int arr[] = new int [t];
		
		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int rem , sum , q , mul ;
		
		for(int i = 0 ; i < t ; i++){
			
			if(arr[i] >= 10 && arr[i] <= 99){
				
				rem = arr[i] % 10;
				q = arr[i] / 10;
				sum = rem + q;
				mul = rem * q;
				if(sum+ mul == arr[i])
					System.out.println("Special number");
				
				else 
					System.out.println("Not a special number");
			}
			else
				System.out.println("Invalid input");
		}
	}
}