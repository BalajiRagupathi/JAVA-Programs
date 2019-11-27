import java.util.*;

class Wordsort{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		String word[] = sentence.split("\\s+");
		
		String temp , sorted_words = "";
		
		for(int i = 0 ; i < word.length - 1 ; i++){
			for(int j = i+1 ; j < word.length ; j++){
			
				if(word[i].length() > word[j].length() ){
					
					temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
			}
			sorted_words = sorted_words + word[i] + " ";
		}
		sorted_words = sorted_words + word[word.length - 1];
		System.out.println(sorted_words);
	}
}