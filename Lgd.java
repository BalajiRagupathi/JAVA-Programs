import java.util.*;

class Lgd{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int gcd =1 , lcm ;
		int n1[] = new int[t];
		int n2[] = new int[t];

		for(int i = 0 ; i < t ; i++){
			
			n1[i] = sc.nextInt();
			n2[i] = sc.nextInt();
		}

		for(int i = 0 ; i < t ; i++){
			
			for(int j = 1 ; j <= n1[i] && j <= n2[i] ; ++j){

				if(n1[i] % j == 0 && n2[i] % j == 0){
					gcd = j;
				}
			}
			
			lcm = (n1[i] * n2[i]) / gcd;
			System.out.println(lcm);System.out.println(gcd);
		}
	}
}