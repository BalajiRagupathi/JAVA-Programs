import java.util.*;

class RotateString{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String arr[] = new String [test*2];
		
		for(int i =  0 ; i < test*2 ; i++){
			
			arr[i] = sc.next();
		}
		
		for(int i = 0 ; i < test*2 ; i = i + 2){
			
			int flag = 0;
			
			for(int j = 1 ; j <= arr[i].length() ; j++){
			
				String front , back , comp = "";
				front = arr[i].substring(0,j);
				back = arr[i].substring(j,arr[i].length());
				comp = back + front;
				
				if( comp.equals(arr[i+1]) ){
					
					flag = 1;
					break;
				}
			}
			
			if(flag == 1)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}