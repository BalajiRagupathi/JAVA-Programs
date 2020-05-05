import java.util.*;

class Shortest_path{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String bin[] = str.split("/");
		String last[] = new String[bin.length];
		
		String path = "";
		int c = 0;
		
		for( int i = 0 ; i < bin.length ; i++){
			
			if( !bin[i].equals("..") && !bin[i].isEmpty() ){
				
				path = path + "/" + bin[i];
				last[c] = bin[i];
				c++;
			}
			else if( bin[i].equals("..") && !bin[i].isEmpty() ){
				
				c--;
				path = "";
				if( c >= 0){
					for( int k = 0 ; k < c ; k++){
						
						path = path + "/" + last[k];
					}
				}
				else
					path = path + "No path";
			}
		}
		
		System.out.println(path);
	}
}