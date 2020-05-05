import java.util.*;

class Number_all_possible{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		int dig = scanner.nextInt();
		int val = scanner.nextInt();
		
		String arr[] = s.split(" ");
		
		for(int i = 0 ; i < a.length ; i++){
			
			String com = arr[i];
			if( com.length() < String.valueOf(val).length() ){
				for(int j = 0 ; j < a.length ; j++){
					
					com = first_com + arr[j];
					if(com.length() == String.valueOf(val).length()){
						
						if( Integer.parseInt(com) == val )
							count++;
					}
				}
			}
		}
	}
}