import java.util.*;

class Bill_Seperator{
	
	static TreeMap<String,Double> hm = new TreeMap<String,Double>();
	static ArrayList<Double> bills = new ArrayList<Double>();
	
	static void shops_seperation(){
		
		for(int i = 0 ; i < Electricity_Bill_Report.shops.size() ; i++){
		
		    if( !Electricity_Bill_Report.shops.get(i).equals(" ") ){
		        
    			String spt[] = Electricity_Bill_Report.shops.get(i).split("\\$");
    			
    			for( int j = 0 ; j < spt.length ; j++ ){
    				
    				String units[] = spt[j].split("\\s+");
    				
    				int k = 0;
    				if( j == 0 )
    				    k++;
    				
    				if( !hm.containsKey(units[k]) )
    					hm.put(units[k],Double.parseDouble(units[k+1]));
    				else if( hm.containsKey(units[k]) ){
    					
    					double unit = hm.get(units[k]) + Double.parseDouble(units[k+1]);
    					hm.put(units[k],unit);
    				}
    			}
    		}
	    }
		
		calculate_bill();
	}
	
	static void calculate_bill(){
		
		Iterator itr = hm.entrySet().iterator();
		
		while(itr.hasNext()){
			
			Map.Entry value = (Map.Entry) itr.next();
			double bill = unit_calculation(hm.get(value.getKey()));
			
			bills.add(bill);
		}
		
		display();
	}
	
	static double unit_calculation(double v){
		
		if( v <= 999 ){
			
			v = v * 0.40;
			return (Math.round(v * 100.0)/100.0);
		}
		else if( v >= 1000 && v <= 2000 ){
			
			v = v * 0.33;
			return (Math.round(v * 100.0)/100.0);
		}
		else if( v >= 2001 && v <= 5000 ){
			
			v = v * 0.30;
			return (Math.round(v * 100.0)/100.0);
		}
		else if( v > 5000 ){
			
			v = v * 0.20;
			return (Math.round(v * 100.0)/100.0);
		}
		
		return 0;
	}
	
	static void display(){
		
		Iterator itr = hm.entrySet().iterator();
		int i = 0;
		
		while(itr.hasNext()){
			
			Map.Entry k = (Map.Entry) itr.next();
			System.out.println(k.getKey()+":"+String.format("%.2f",bills.get(i)));
			i++;
		}
	}
}

public class Electricity_Bill_Report{
	
	static ArrayList<String> days = new ArrayList<String>();
	static ArrayList<String> shops = new ArrayList<String>();
	
	static void split_datas(String s){
		
		String spt[] = s.split(":");
		days.add(spt[0]);
		shops.add(spt[1]);
	}
	
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		scanner.nextLine();
		
		Bill_Seperator bs = new Bill_Seperator();
		
		for(int i = 0 ; i < test ; i++){
			
			String s = scanner.nextLine();
			
			split_datas(s);
		}
		
		bs.shops_seperation();
	}
}