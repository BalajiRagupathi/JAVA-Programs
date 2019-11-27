import java.util.*;

class Trend{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int arr[] = new int [t];
		int q , mid;

		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < t ; i++){

			if(arr[i] >= 100 && arr[i] <=999 ){

				q = arr[i] /10;
				mid = q % 10 ;

				if( mid % 3 == 0 ){

					System.out.println("Trendy number");
				}
				else{

					System.out.println("Not a trendy number");
				}
			}
		}
	}
}