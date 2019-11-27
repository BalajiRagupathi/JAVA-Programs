import java.util.*;

class Palindromepossible{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String arr[] = new String [test];
		
		for(int i = 0 ; i < test ; i++){
			
			arr[i] = sc.next();
			arr[i] = arr[i].toLowerCase();
		}
		
		String pt = "";
		int count = 0;
		
		for(int i = 0 ; i < test ; i++){
		
			count = 0;
			
			for(int j = 0 ; j < arr[i].length() ; j++){
				
				pt = "";
				pt = pt + arr[i].charAt(j);
				
				for(int k = j+1 ; k < arr[i].length() ; k++){
				
					pt = pt + arr[i].charAt(k);
					StringBuffer st = new StringBuffer(pt);
					st = st.reverse();
					String str = st.toString();
					
					if(pt.equals(str)){
						
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}