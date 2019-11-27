import java.util.*;

class Numpatterns{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt() , s = 0;
		int a[] = new int[t];

		for(int i = 0 ; i < t ; i++){

			a[i] = sc.nextInt();
		}

		for(int i = 0 ; i < t ; i++){
			
			s = 0;
			for(int j = 1 ; j <= a[i] ; j++){
				for(int k = 1 ; k <= j ; k++){

					s = s + 1;
					System.out.print(s+" ");
				}System.out.print("\n");		
			}
		}
	}
}