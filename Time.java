import java.util.*;

class Time{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		String arr[] = new String [test];
		
		for(int i = 0 ; i < test ; i++){
			
			arr[i] = sc.next();
		}
		
		for(int i = 0 ; i < test ; i++){
			if(arr[i].contains("PM") || arr[i].contains("pm")){
				
				String spt[] = arr[i].split(":");
				int hr = Integer.parseInt(spt[0]) + 12;
				System.out.println(hr+":"+spt[1]+":"+spt[2]);
			}
			else
				System.out.println(arr[i]);
		}
	}
}