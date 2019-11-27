import java.util.*;

class Unique1{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int [t];
		int vt[] = new int [100];
		int temp;
		
		for(int i = 0 ; i < t ; i++){
			
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int flag = 0 , r , b = 0 , sm , presm , not = 0;
			
			presm = arr[t-1];
			sm = arr[t-1];
		
		for(int i = 0 ; i < t ; i++){

			r = 0;
			for(int k = 0 ; k < t && flag == 0; k++){

				if(arr[i] == arr[k]  && i != k ){

					r = 1;
					
				}
			}
			if(r != 1){

				sm = arr[i];
			}

			if(r!= 1 && flag == 0 && presm > sm){

				presm = sm;
				not = 1;
			}

			vt[i] = arr[i];
			b++;

			if(i != t-1 ){
				for(int n = 0 ; n < b  ; n++){

					
					if(arr[i+1] == vt[n]){
						flag = 1;
					}
					else{
						flag = 0;
					}
				}
			}
		}
		if(not == 1){

			System.out.println("P"+presm);
		}
		else{
			System.out.println("No unique elements");

		}
	}
}