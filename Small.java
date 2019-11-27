import java.util.*;

class Small{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int arr[] = new int[t];
		int vt[] = new int[t];

		for(int i = 0 ; i < t ; i++){

			arr[i] = sc.nextInt();
		}

		int pre = t , r= 0 , flag = 0 , ct = 0 ,id = 0 , b =0;
		for(int i = 0 ; i < t -1 ; i++){
			ct = 0;
			for(int j = i+1 ; j < t && flag == 0; j++){
				
				if(arr[j] == arr[i]){
					
					ct++;
					r= 1;
				}
			}

			vt[i] = arr[i];b++;
			if(ct < pre && ct > 0 && flag == 0){

				id = arr[i];
				pre = ct;
			}

			for(int n = 0 ; n < b ; n++){

				if(vt[n] == arr[i+1] ){
					flag = 1;
				}
				else{
					flag = 0;
				}
			}

			
		}
		if(r== 1){
			System.out.println(id);
		}
		else{
			System.out.println("No repeating elements");
		}
	}
}