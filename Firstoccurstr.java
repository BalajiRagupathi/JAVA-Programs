import java.util.*;

class Firstoccurstr{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String arr[] = new String[t+1];
		
		String key[] = new String[t+1];
		
		
		for(int i = 0 ; i <= t ; i++){
			
			key[i] = sc.nextLine();
			if(i < t)
				arr[i] = sc.nextLine();
			
		}
		
		int x = -1 , flag = 0;
		
		for(int i = 0 ; i < t ; i++){
			
			String ch = "";
			flag = 0;
			for(int j = 0 ; j < arr[i].length() ; j++){
				
				if(arr[i].charAt(j) != ' '){
					
					ch = ch + arr[i].charAt(j);
				}
				else if(arr[i].charAt(j) == ' '){
					
					ch = "";
				}
				if (ch.contains(key[i+1]) && flag == 0){
					
					x = (j - key[i+1].length())+1;
					flag = 1;
				}
				
			}
			if(flag == 1)
				System.out.println(key[i+1]+""+x);
			else
				System.out.println("-1");
		}
	}	
}