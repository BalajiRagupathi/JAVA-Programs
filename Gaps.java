import java.util.*;

class Gaps{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int decimal = scanner.nextInt();
		int remainder , gap = 0 , ct = 0 , bt = 0, flag = 0;
		
		while( decimal != 0 ){
			
			remainder = decimal % 2;
			decimal = decimal / 2;
			
			if(remainder == 1){
				
				flag = 1;
				ct = 0;
			}
			else if(flag == 1 && remainder == 0){
				
				ct++;
				if(gap < ct)
					gap = ct;
			}
		}
		if(gap > 0)
			System.out.println("The longest binary gap is "+gap);
		else
			System.out.println("No binary gap");
	}
}