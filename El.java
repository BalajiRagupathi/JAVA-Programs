import java.util.*;

class El{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int [t];

		for(int i = 0 ; i < t ; i++){

			arr[i] = sc.nextInt();
		}

		int el ;
		for(int i = 0 ; i < t ; i++){
		
			el = 1;
			for(int j = 0 ; j < arr[i] ; j++){

				el = el * 11;
				System.out.println(el);
			}
		}
	}
}