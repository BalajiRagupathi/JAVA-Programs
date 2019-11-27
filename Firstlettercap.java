import java.util.*;

class Firstlettercap{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String arr[] = new String [size+1];
		
		for(int i = 0 ; i <= size ; i++){
			
			arr[i] = sc.nextLine();
		}
		
		for(int i = 1 ; i <= size ; i++){
			
			char ch[] = arr[i].toCharArray();
			
			for(int j = 0 ; j < ch.length ; j++){
				
				if(' ' == ch[j]){
					if(ch[j+1] >= 'a' && ch[j+1] <= 'z'){
						
						ch[j+1] = Character.toUpperCase(ch[j+1]);
					}
				}
				else if(j == 0){
					
					ch[j] = Character.toUpperCase(ch[j]);
				}
			}
			String st = new String(ch);
			System.out.println(st);
		}
	}
}