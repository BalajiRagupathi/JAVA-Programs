import java.util.*;

class Vowelsuplw{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String arr[] = new String [size+1];
		
		for(int i = 0 ; i <= size ; i++){
			
			arr[i] = sc.nextLine();
		}
		
		for(int i = 1 ; i <= size ; i++){
			
			arr[i] = arr[i].toLowerCase();
			arr[i] = arr[i].replaceAll("a","A").replaceAll("e","E").replaceAll("i","I").replaceAll("o","O").replaceAll("u","U");
			
			System.out.println(arr[i]);
		}
	}
}