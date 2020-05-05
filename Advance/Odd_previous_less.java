import java.util.*;

class Odd_previous_less{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		ArrayList<Integer> al = new ArrayList<>(size);
		
		for( int i = 0 ; i < size ; i++){
			
			int ele = scanner.nextInt();
			al.add(ele);
		}
		
		for(int i = 1 ; i < size ; i = i + 2){
			
			if( al.get(i-1) > al.get(i) ){
				
				Collections.swap(al , i-1 , i);
			}
		}
		
		System.out.println(al);
	}
}