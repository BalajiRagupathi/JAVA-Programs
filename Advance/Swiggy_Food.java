import java.util.*;

class Variety{
	
	int price , exp ;
	public Variety( int p , int e ){
		
		price = p;
		exp = e;
	}
}

class Namecomparator implements Comparator<Variety>{
	
	public int compare( Variety o1 , Variety o2 ){
		
		if( o1.exp - o2.exp != 0 )
			return o1.exp - o2.exp ;
		else
			return o1.price - o2.price;
	}
}

class Swiggy_Food{
	
	static int amount = 0 , delivery = 0 , total_varietys = 0;
	static ArrayList<Variety> al = new ArrayList<Variety>();
	
	static void find(){
		
		int sum = delivery , max = 0;
		
		for(int i = 0 ; i < al.size() ; i++){
			
			sum = sum + al.get(i).price;
			int cal = (amount / sum) * al.get(i).exp;
			
			System.out.println(sum+" "+cal+" "+al.get(i).price+" "+al.get(i).exp);
			
			if( max < cal )
				max = cal;
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		amount = scanner.nextInt();
		delivery = scanner.nextInt();
		total_varietys = scanner.nextInt();
		
		for(int i = 0 ; i < total_varietys ; i++){
			
			int price = scanner.nextInt();
			int exp = scanner.nextInt();
			al.add(new Variety(price,exp+1));
		}
		
		Collections.sort(al,new Namecomparator());
		
		System.out.println(" Sort ");
		for(int i = 0 ; i < al.size() ; i++){
			
			System.out.println(al.get(i).price+" "+al.get(i).exp);
		}
		
		find();
		
		
	}
}