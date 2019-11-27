import java.util.*;

class Secondstr{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		String arr[] = new String[t];
		String key[] = new String[t];
		
		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.next();
			key[i] = sc.next();
		}
		
		String cp = "";
		int flag = 0;
		
		for(int i = 0 ; i < t ; i++){
			
			for(int j = 0 ; j < key[i].length() ; j++){
				
				cp = cp + key[i].charAt(j);
				if(arr[i].contains(cp)){
					
					arr[i] = arr[i].replaceAll(cp,"");
				}
				cp = "";
			}
			System.out.println(arr[i]);
		}
	}
}