import java.util.*;

class Most_freq_sam_min{
	public static void main(String args[]){
	
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		int max = -2147483648;
		int size = scanner.nextInt();
		
		for(int i = 0 ; i < size ; i++){
		
			int val = scanner.nextInt();
			
			if( hm.containsKey(val) ){
				
				int temp = hm.get(val);
				temp = temp + 1;
				hm.put(val,temp);
				
				if( max < temp ){
					
					max = temp;
				}
			}
			else
				hm.put(val,1);
		}
		
		TreeSet<Integer> tr = new TreeSet<>(hm.keySet());
		
		Iterator itr = tr.iterator();
		
		while(itr.hasNext()){
			
			Integer tem = (Integer) itr.next();
			if( hm.get(tem) == max ){
				
				System.out.println(tem);
				break;
			}
		}
	}
}