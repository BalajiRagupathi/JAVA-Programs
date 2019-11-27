import java.util.*;

class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt() ;
		int ct , max , premax = 0;

		int a[] = new int[t];
		int b[] = new int[t];

		for(int i =  0 ; i < t ; i++){

			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < t ; i++){
			for(int j = a[i] ; j <= b[i] ; j++){

				ct = 0;
				if(j > 2 ){
					for(int k = 2 ; k <= j/2 ; k++ ){
						if(j%k == 0){

							ct++;
						}
					}				
					if(ct == 0){
						
						max = j;
						System.out.print(j);System.out.print(" ");
						if( premax < max){
							premax = max;
						}
					}
				}
				else if(j <= 2 && j > 0 ){

					System.out.print(j);
				}
				
			}
			if(premax > 0){
			
				System.out.println("\n"+premax);
			}
		}
	}
}