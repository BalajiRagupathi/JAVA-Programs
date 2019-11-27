import java.util.*;

class Mobile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int t  = sc.nextInt();
		String arr[] = new String[t];

		for(int i = 0 ; i < t ; i++){

			arr[i] = sc.next();
			arr[i] = arr[i].toUpperCase();
		}

		for(int i = 0 ; i < t ; i++){

			for(int j = 0 ; j < arr[i].length() ; j++){

				char a = arr[i].charAt(j);

				if(a == ('A') || a == ('B') || a == ('C') ){
			
					System.out.print("2");
				}
				else if(a == ('D') || a==('E') || a==('F') ){
			
					System.out.print("3");
				}
				else if(a==('G') || a==('H') || a==('I') ){
			
					System.out.print("4");
				}
				else if(a==('J') || a==('K') || a==('L') ){
			
					System.out.print("5");
				}
				else if(a==('M') || a==('N') || a==('O') ){
			
					System.out.print("6");
				}
				else if(a==('P') || a==('Q') || a==('R') || a==('S')){
			
					System.out.print("7");
				}
				else if(a==('T') || a==('U') || a==('V') ){
			
					System.out.print("8");
				}
				else if(a==('W') || a==('X') || a==('Y') || a==('Z')){
			
					System.out.print("9");
				}
			}
			System.out.print("\n");
		}
	}
}