import java.util.*;

class Hexa{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String hexa = scanner.nextLine();
		
		
		for(int i = 0 ; i < hexa.length() ; i++){
			
			String bits = "";
			int ct = 0;
			int num , rem;
			if(hexa.charAt(i) == 'A' || hexa.charAt(i) == 'a')
				num = 10;
			else if(hexa.charAt(i) == 'B' || hexa.charAt(i) == 'b')
				num = 11;
			else if(hexa.charAt(i) == 'C' || hexa.charAt(i) == 'c')
				num = 12;
			else if(hexa.charAt(i) == 'D' || hexa.charAt(i) == 'd')
				num = 13;
			else if(hexa.charAt(i) == 'E' || hexa.charAt(i) == 'e')
				num = 14;
			else if(hexa.charAt(i) == 'F' || hexa.charAt(i) == 'f')
				num = 15;
			else{
				
				String st = "";
				st = st + hexa.charAt(i);
				num = Integer.parseInt(st);
			}
			
			while(num != 0){
				
				rem = num % 2;
				num = num / 2;
				bits = rem + bits;
				ct++;
			}
			while(i != 0 && ct < 4){
				System.out.print("0");
				ct++;
			}
			System.out.print(bits);
		}
		
	}
}