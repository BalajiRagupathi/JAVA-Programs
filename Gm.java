import java.util.*;

class Gm{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int a[] = new int[t];
		int arr[][] = new int[t][100];

		for(int i = 0 ; i < t ; i++){
			
			a[i] = sc.nextInt();
			for(int j = 0 ; j < a[i] ; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int premax = 0 , max ;

		for(int i = 0 ; i < t ; i++){

			premax = 0;
			for(int j = 0 ; j < a[i]-1 ; j++){

				for(int k = j+1 ; k < a[i] ; k++){

					max = arr[i][j] * arr[i][k];
					if(premax < max){
						premax = max;
					}
				}
			}
			if(a[i] > 1){
			
				System.out.println(premax);
			}
			else{

				System.out.println("No pairs exists");
			}
		}
	}
}