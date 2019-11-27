import java.util.*;

class Wordrev{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		String word[] = sentence.split("\\s+");
		
		for(int i = 0 ; i < word.length ; i++){
			
			String st = "";
			for(int j = word[i].length() - 1 ; j >= 0  ; j--){
				
				st = st + word[i].charAt(j);
			}
			System.out.print(st+" ");
		}
		
	}
}