import java.util.*;

class Strnine{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String arr[] = new String [size+1];
		
		for(int i = 0 ; i <= size ; i++){
			
			arr[i] = sc.nextLine();
		}
		
		int flag = 1;
		for(int i = 1 ; i <= size ; i++){
			
			flag = 1;
			String arr1[] = arr[i].replaceAll("[\\W+]"," ").split("\\D+");
			for(int j = 1 ; j < arr1.length ; j++){
				
				if(!arr1[j].contains("9")){
					
					System.out.print(arr1[j]+" ");
					flag = 0;
				}
			}
			System.out.println();
			if(flag == 1)
				System.out.print("-1");
		}
	}
}