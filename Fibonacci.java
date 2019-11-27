import java.util.*;

class Fibonacci{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] b = new int[] {0,1,1,2,3,5};

		for(int i = 0 ; i < b.length ; i++){

			if(b[i] == a){
				System.out.println("True");
				break;
			}
		}
	}
}