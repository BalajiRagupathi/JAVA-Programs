import java.util.*;

class Max_length_chain_fashion{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i = 0 ; i < test ; i++){
			
			int pairs = scanner.nextInt();
			int c[] = new int[pairs];
			int d[] = new int[pairs];
			for(int j = 0 ; j < pairs ; j++){
				
				c[j] = scanner.nextInt();
				d[j] = scanner.nextInt();
			}
			
			int chain = 0;
			
			for(int j = 0 ; j < pairs-1 ; j++){
				
				for(int k = j+1 ; k < pairs ; k++){
					
					if(c[j] > d[k] ){
						
						chain++;
						System.out.println(c[j]+" c "+d[j]+" > "+c[k]+" c "+d[k]);
					}
					else if(d[j] > c[k]){
						
						chain++;
						System.out.println(c[j]+" d "+d[j]+" > "+c[k]+" d "+d[k]);
					}
				}
			}
			
			System.out.println(chain);
		}
	}
}