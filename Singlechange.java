import java.util.*;

class Singlechange{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String arr[] = new String[6];
		int idx[] = new int[6];
		
		for(int i = 0 ; i < 6 ; i++){
			
			arr[i] = scanner.next();
		}
		
		int ct , j , mct = 1 , k = 0;
		
		if(arr[0].length() == arr[1].length() && !arr[1].equals(arr[0]) ){	
			
			for(int i = 2 ; i < 6 ; i++){
				
				j = 0;
				ct = 0;
				while( j < arr[1].length() ){
					
					String st = "";
					st = st + arr[i].charAt(j);
					if(arr[1].contains(st)){
						
						ct++;
					}
					j++;
				}
				
				if(ct == mct){
					
					idx[k] = i;
					mct++;
					k++;
				}
			}
			
			if(mct-1 == arr[1].length()){
			
				System.out.print("['"+arr[0]+"', ");
				for(int i = 0 ; i < k ; i++){
					
					System.out.print("'"+arr[idx[i]]);
					if(i < k - 1)
						System.out.print("', ");
				}
				System.out.print("']");
			}
			
			else{
				
				System.out.println("null");
			}
		}
		else
			System.out.println("null");
	}
}