import java.util.*;

class Freq{
	
	public static HashMap<Integer,Integer> hm = new HashMap<>();
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		for(int i = 0 ; i < test ; i++){
			
			for(int j = 0 ; j < 7 ; j++){
				
				int val = scanner.nextInt();
				if( hm.containsKey(val) ){
					
					int temp = 1;
					temp = temp + getValue(val);
					hm.put(val,temp);
				}
				else
					hm.put(val,1);
			}
		}
	}
	
	public static 
}