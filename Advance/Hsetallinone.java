import java.util.*;

class Students{ //implements Comparable<Students> for compare using comparable class , it's present under lang library
	
	String name;
	int roll;
	
	public Students(String s1 , int r1){
		
		name = s1;
		roll = r1;
	}
	
	/* Comparable compare only compares one data type at a time
	public int compareTo( Students s1 ){
		
		return name.compareTo(s1.name);
	}*/
}

class Namecomparator implements Comparator<Students>{
	
	public int compare(Students o1 , Students o2){
		
		return o1.name.compareTo(o2.name);
	}
}

class Rollcomparator implements Comparator<Students>{
	
	public int compare(Students o1 , Students o2){
		
		return o1.roll - o2.roll;
	}
}

class Hsetallinone{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		HashSet<Students> hset = new HashSet<Students>();
		
		System.out.println("Enter the size");
		
		int size = sc.nextInt();
		
		for(int i = 0 ; i < size ; i++){
		   
		   int roll = sc.nextInt();
		   String name = sc.nextLine();
		   hset.add(new Students(name,roll));
		}
		
		System.out.println("Elements in user defined class before sorting");
		Iterator<Students> itr = hset.iterator();  
		
		while(itr.hasNext()){
		
			Students temp = (Students) itr.next();
			System.out.println("Name - "+temp.name+"\tRoll No. - "+temp.roll);
		}
		
		/*System.out.println("Sorting by Name"); 
		
		Collections.sort(hset , new Namecomparator());
		
		Iterator itr2 = hset.iterator(); 
		
		while(itr2.hasNext()){
			
			Students temp = (Students)itr2.next();
			System.out.println("Name - "+temp.name+"\tRoll No. - "+temp.roll);
		}
		
		System.out.println("Sorting by Roll");
		
		Collections.sort(hset , new Rollcomparator());
		
		Iterator itr1 = hset.iterator();
		
		while(itr1.hasNext()){
			
			Students temp1 = (Students)itr1.next();
			System.out.println("Name - "+temp1.name+"\tRoll No. - "+temp1.roll);
		}*/
		
		/*System.out.println("Size "+hset.size());
		//System.out.println("LastIndexOf "+hset.lastIndexOf(temp1.name));
		
		System.out.println("Remove ");
		hset.remove(1);
		Iterator itr3 = hset.iterator();
		
		while(itr3.hasNext()){
			
			Students temp1 = (Students)itr3.next();
			System.out.println("Name - "+temp1.name+"\tRoll No. - "+temp1.roll);
		}*/
	}
}