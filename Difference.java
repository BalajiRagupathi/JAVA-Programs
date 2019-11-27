import java.util.*;

class Difference{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int size[] = new int[t];
		int arr[][] = new int[t][100];
		
		for(int i = 0 ; i < t ; i++){
			
			size[i] = sc.nextInt();
			for(int j = 0 ; j < size[i] ; j++){
				
				arr[i][j] = sc.nextInt();
			}
		}
		int sub , dif;
		
		for(int i = 0 ; i < t ; i++){
			dif = arr[i][0] - arr[i][1];
			if(dif < 0)
				dif = dif * (-1);
			for(int j = 0 ; j < size[i] ; j++){
				
				for(int k = 0 ; k < size[i] ; k++){
				
					sub = arr[i][j] - arr[i][k];
					if( sub < 0)
						sub = sub * (-1);
					if(sub > 0 && dif > sub)
						dif = sub;
				}
			}
			if(dif > 0)
				System.out.println(dif);
			else
				System.out.println("No");
		}
	}
}