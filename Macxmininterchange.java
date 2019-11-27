import java.util.*;
public class Macxmininterchange
{
    public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int arr[] = new int[size+1];
		
		for(int i = 1 ; i <= size ; i++)
			arr[i] = scanner.nextInt();
		
		Arrays.sort(arr);
		
		int idx = 0 , first = 1 , last = size;
		
		for(int i = 1; i <= size ; i++){
		
			if(i %2 == 0){
				
				idx = first;
				first++;
			}
			else{
				
				idx = last;
				last--;
			}
			System.out.print(arr[idx]+" ");
		}
	}
}