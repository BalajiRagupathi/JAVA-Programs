import java.util.*;

class Chemicals_bowls{
	
	static ArrayList<String> customer_reactions = new ArrayList<>();
	static ArrayList<String> equation_left = new ArrayList<>();
	static ArrayList<String> equation_right = new ArrayList<>();
	static Stack<String> last_check = new Stack<String>();
	static int count = 0;
	static boolean find_bowl(String s){
		
		System.out.println(last_check);
		if( !equation_left.contains(s) ){
			
			return false;
		}
		
		if( equation_left.contains(s) ){
			
				last_check.push(s);
				String spt_plus[] = equation_right.get(equation_left.indexOf(last_check.peek())).split("\\+");
				count++;
				
				for(int i = 0 ; i < spt_plus.length ; i++){
					
					if( find_bowl(spt_plus[i]) == true )
						return true;
				}
				
				last_check.pop();
		}
		
		return false;
	}
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int total_reactions = scanner.nextInt();
		String equation [] = new String[total_reactions];
		
		scanner.nextLine();
		
		for(int reactions_index = 0 ; reactions_index < total_reactions ; reactions_index++){
			
			String equ = scanner.nextLine();
			String spt[] = equ.replaceAll(" ","").split("=");
			equation_left.add(spt[0]);
			equation_right.add(spt[1]);
		}
		
		int customer_total_need = scanner.nextInt();
		
		scanner.nextLine();
		for(int reactions_index = 0 ; reactions_index < customer_total_need ; reactions_index++){
			
			String cust = scanner.nextLine();
			
			if( !customer_reactions.contains(cust) ){
				
				customer_reactions.add(cust);
				find_bowl(cust);
			}
		}
		System.out.println(count);
	}
}