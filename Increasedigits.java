import java.util.*;

class Increasedigits{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		for(int i = 0 ; i < str.length() ; i++){
			
			if(Character.isDigit(str.charAt(i))){
				
				String st = "";
				st = st + str.charAt(i);
				System.out.print((Integer.parseInt(st))+1);
			}
			else
				System.out.print(str.charAt(i));
		}
	}
}