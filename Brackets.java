import java.util.*;

class Brackets{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int op = 0 , cl = 0 , k = 0 ;
		
		int open[] = new int[str.length()];
		int close[] = new int[str.length()];
		
		for(int i = 0 ; i < str.length() ; i++){

			if( str.charAt(i) == '(' ){
			
				int trig = 0;
				for(int m = i + 1 ; m < str.length() ; m++ ){
					
					if( str.charAt(m) == ')' ){
						
						trig = 1;
					}
				}
				if( trig == 1 ){
					
					open[op] = i;
					op++;
				}
			}
			else if ( op > 0 && str.charAt(i) == ')' ){
			
				close[cl] = i;
				cl++;
			}
			
			
			if( cl == op && cl > 0 && op > 0 ){
				
				for(int j = k ; j <= close[cl-1] ; j++){
						
					int flag = 0;
					if( str.charAt(j) == '(' ){
						for(int n = 0 ; n < op ; n++){
							
							if( open[n] == j ){
								
								flag = 1;
							}
						}
					}
					else if( str.charAt(j) == ')' ){
						for(int n = 0 ; n < cl ; n++){
							
							if( close[n] == j ){
								
								flag = 1;
							}
						}
					}
					else
						flag = 1;
					
					if( flag == 1 )
						System.out.print(str.charAt(j));
					
					k++;
				}
				op = 0;
				cl = 0;
			}
			else if( cl != op && i == str.length() - 1 ){
				
				int start = 0, stop = 0;
				
				if( cl > op ){
					
					stop = cl - op - 1;
				}
				else
					start = op - cl;
				
				for(int j = k ; j < str.length() ; j++){
					
					
					int flag = 0;
					if( str.charAt(j) == '(' ){
						for(int n = op - 1 ; n >= start ; n--){
							
							
							if( open[n] == j ){
								
								flag = 1;
							}
						}
					}
					else if( str.charAt(j) == ')' ){
						for(int n = 0 ; n <= stop ; n++){
							
							if( close[n] == j )
								flag = 1;
						}
					}
					else
						flag = 1;
					
					if( flag == 1 )
						System.out.print(str.charAt(j));
					
					k++;
				}
			}
			
			if( i == str.length() - 1 && k != str.length() - 1 ){
				
				for(int n = k ; n < str.length() ; n++){
					if( str.charAt(n) != ')' && str.charAt(n) != '('){
						System.out.print(str.charAt(n));
					}
				}
			}
		}
	}
}


/*
class Remove{
	public int removeandprint(int [] arr , int start , int end , int open , int close , int inc , String st){
		
		while( open != 0 && close != 0 ){
					
			for(int j = arr[start] ; j <= end ; j++){
						
				System.out.print(st.charAt(j));
			}
			open = open - inc;
			close = close - inc;
			start--;
			System.out.print("op"+open);
		}
	}
}


import java.util.*;
class Brackets{
	
	public int open;
	public int close;
	
	public void removeandprint(int [] arr , int start , int end , int open , int close , int inc , String st){
		System.out.print("st"+start);
		while( open != 0 && close != 0 ){
					
			for(int j = arr[start] ; j <= end ; j++){
						
				System.out.print(st.charAt(j));
			}
			open = open - inc;
			close = close - inc;
			start--;
		}System.out.print("i"+end);
		System.out.print("op"+open);
		System.out.print("cl"+close);
		this.open = open;
		this.close = close;
	}
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int op = 0 , cl = 0 , k = 0;
		
		int stk[] = new int[str.length()];
		
		Brackets re = new Brackets();
		
		for(int i = 0 ; i < str.length() ; i++){

			if( str.charAt(i) == '(' ){
			
				stk[k] = i;
				op++;
				k++;
			}
			else if ( op > 0 && str.charAt(i) == ')' ){
			
				cl++;
			}
			if( cl == op && i > 0){
				
				int temp = k - op;
				re.removeandprint(stk , temp , i , op , cl , cl , str);
				op = 0;
				cl = 0;
			}
			else if( cl > 0 && op > 0){
				
				int temp = k - 1;
				re.removeandprint(stk , temp , i , op , cl , 1 , str);
				op = re.open;
				cl = re.close;
			}
		}
	}
}*/