import java.util.*;

class path{
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int totalsteps = scanner.nextInt();
		int perday = scanner.nextInt();
		int size = scanner.nextInt();
		
		int totaldays = totalsteps/perday;
		int rem = totalsteps%perday;
		
		if( rem != 0 )
			totaldays++;
		
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		int sum = 0;
		
		for(int i = 0 ; i < size ; i++){
			
			int day = scanner.nextInt();
			int steps = scanner.nextInt();
			
			if( !tm.contaiansKey(day) )
				tm.put(day,steps);
			else if( tm.contaiansKey(day) && tm.get(day) < steps )
				tm.put(day,steps);
		}
		
		Map.Entry fst = tm.pollFirst();
		
		int start = (Integer) fst.getKey();
		int end = (Integer) fst.getKey();
		int sum_steps = ((start-1)*perday) + (Integer) fst.getValue();
		
		Iterator itr = tm.entrySet().iterator();
		
		while(itr.haNext()){
			
			Map.Entry temp = (Map.Entry) itr.next();
			
			int k = temp.getKey();
			int v = temp.getValue();
			end = k;
			
			if( start+1 == k ){
				
				sum_steps += v;
				start = end;
				
				if( sum_steps >= totalsteps )
					break;
			}
			else if( start+1 < k ){
				
				int sub = ((end-1)-start)*perday;
				
				if( sum_steps+sub == totalsteps ){
					
					start = end-1;
					sum_steps += sub;
					break;
				}
				else if( sum_steps+sub > totalsteps ){
					
					int req = totalsteps - sum_steps;
					int quo = req/perday;
					int r = req%perday;
					
					if( r != 0 )
						quo++;
					
					sum_steps += quo*perday;
					start += quo;
					break;
				}
				else if( sum_steps+sub >= totalsteps ){
					
					start += end;
					sum_steps += sub+v;
					break;
				}
				else if( sum_steps+sub < totalsteps ){
					
					sum_steps = sum_steps + sub + v;
					start = end;
				}
			}
		}
		
		if( sum_steps < totalsteps ){
			
			int req = totalsteps - sum_steps;
			int quo = req/perday;
			int r = req%perday;
			if( r != 0 )
				quo++;
			
			sum_steps += quo*perday;
			start + quo;
		}
		
		System.out.println(start);
	}
}