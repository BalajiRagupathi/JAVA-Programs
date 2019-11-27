import java.util.*;
class Geek
{
    public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int units[] = new int[test];
		int key[] = new int[test];
		
		for(int i = 0 ; i < test ; i++){
			
			units[i] = scanner.nextInt();
			key[i] = scanner.nextInt();
		}
		
		int last;
		
		for(int i = 0 ; i < test ; i++){
			
			last = 0;
			
			for(int j = 0; j <= key[i] ; j++){
			
				if( j != key[i] - 1){
					
					units[i] = units[i] / 2;
					last = units[i];
				}
				else{
					
					System.out.println(last);
				}
			}
		}
	}
}