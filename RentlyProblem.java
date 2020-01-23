//00:05:17,959-720-018 00:03:00,959-720-018 00:04:59,959-720-018

//00:04:59,959-720-018 00:05:00,750-222-197 00:15:31,892-545-277

//00:05:17,959-720-018 00:19:39,750-222-197 00:14:00,959-720-018 00:17:01,892-545-277

import java.util.*;

class Calculation{
	
	int bill , hr , min , sec , duration;
	Long ph ;
	
	public Calculation( int hour , int minutes , int seconds , Long phone ){
		
		hr = hour;
		min = minutes;
		sec = seconds;
		ph = phone;
		RentlyProblem rm = new RentlyProblem();
		bill = rm.each_bill(hour,minutes,seconds,ph);
		duration = rm.each_duration(hour,minutes,seconds,ph);
	}
	
	public int getBill(){
		return bill;
	}
	public int getDuration(){
		return duration;
	}
}

class RentlyProblem{
	
	public static HashMap<Long,Calculation> call_details = new HashMap<Long,Calculation>();
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		RentlyProblem rp = new RentlyProblem();
		
		rp.split(str);
	}
	
	public void split( String st ){
		
		String spt[] = st.replaceAll("-","").split(" ");
		
		for(int i = 0 ; i < spt.length ; i++){
			
			String temp = spt[i];
			int hr = Integer.parseInt(temp.substring(0,2));
			int min = Integer.parseInt(temp.substring(3,5));
			int sec = Integer.parseInt(temp.substring(6,8));
			Long pn = Long.parseLong(temp.substring(9,19)); //System.out.println(" Split ");			System.out.println(" H "+hr+" M "+min+" S "+sec+" PH "+pn);
			call_details.put(pn,new Calculation(hr,min,sec,pn));
			
			if( i == spt.length-1 ){ //System.out.println(" Print ");
			
				RentlyProblem re = new RentlyProblem();
				re.print_bill();
			}
		}
	}
	
	public void print_bill( ){
		
		Iterator itr = call_details.entrySet().iterator();
		int final_amount = 0 , max_amt = -1 , max_dur = 0 ;
		Long max_key = Long.parseLong("0");

		while(itr.hasNext()){
			
			Map.Entry<Long,Calculation> temp_it = (Map.Entry) itr.next();
			Long key = temp_it.getKey();
			Calculation v = temp_it.getValue();
			
			if( v.duration > max_dur ){
				
				max_dur = v.duration;
				max_amt = v.bill;
				max_key = key;
			}
			else if( v.duration == max_dur ){
				
				if( key > max_key ){
					
					max_dur = v.duration;
					max_amt = v.bill;
					max_key = key;
				}
			}
			final_amount = final_amount + v.bill;
		}
		System.out.println("Bill Amount "+(final_amount-max_amt));
	}
	
	public int each_bill(int h , int m , int s , Long p){
		
		int value = 0;
		if( m >= 5 ){
			
			value = (value + (h*60) + m)*150;
			if( s > 0 )
				value = value + 150;
		}
		else if( m < 5 ){
			
			value = (value + (m*60) + s)*3;
		}
		
		if(call_details.containsKey(p)){
			
			int temp_bill = call_details.get(p).getBill();
			temp_bill = temp_bill + value;//			System.out.println("Bill Same "+value);
			return temp_bill;
		}
		else{//			System.out.println("Bill "+value);
			
			return value;
		}
	}
	
	public int each_duration( int h , int m , int s , Long p ){
		
		if(call_details.containsKey(p)){
			
			int temp_duration = call_details.get(p).getDuration();
			temp_duration = temp_duration + (h*60*60) + (m*60) + s;
			return temp_duration;
		}
		else 
			return (h*60*60) + (m*60) + s;
	}
}
