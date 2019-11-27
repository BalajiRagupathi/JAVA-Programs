import java.util.*;
public class Repeatchar
{
    public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		String word[] = str.split("\\d+");
		String num[] = str.split("\\D+");
		
		for(int i = 0; i < word.length ; i++)
		{
			int rep = Integer.parseInt(num[i+1]);
			
			for(int j = 0 ; j < rep ; j++)
				System.out.print(word[i]);
		}
	}
}