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

class Alistinone{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Students> alist = new ArrayList<Students>();
		
		System.out.println("Enter the size");
		
		int size = sc.nextInt();
		
		for(int i = 0 ; i < size ; i++){
		   
		   int roll = sc.nextInt();
		   String name = sc.nextLine();
		   alist.add(new Students(name,roll));
		}
		
		System.out.println("Sorting by Name"); 
		
		Collections.sort(alist , new Namecomparator());
		
		Iterator itr = alist.iterator(); 
		
		while(itr.hasNext()){
			
			Students temp = (Students)itr.next();
			System.out.println("Name - "+temp.name+"\tRoll No. - "+temp.roll);
		}
		
		System.out.println("Sorting by Roll");
		
		Collections.sort(alist , new Rollcomparator());
		
		Iterator itr1 = alist.iterator();
		
		while(itr1.hasNext()){
			
			Students temp1 = (Students)itr1.next();
			System.out.println("Name - "+temp1.name+"\tRoll No. - "+temp1.roll);
			System.out.println("LastIndexOf "+alist.lastIndexOf(temp1.name));
		}
		
		System.out.println("Size "+alist.size());
		
		System.out.println("Remove ");
		Students key = new Students("Bala", 15);
		alist.remove(key);
		Iterator itr3 = alist.iterator();
		
		while(itr3.hasNext()){
			
			Students temp1 = (Students)itr3.next();
			System.out.println("Name - "+temp1.name+"\tRoll No. - "+temp1.roll);
		}
	}
}