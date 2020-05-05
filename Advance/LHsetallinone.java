import java.util.*;

class Students{ //implements Comparable<Students> for compare using comparable class , it's present under lang library
	
	String name;
	int roll;
	
	public Students(String s1 , int r1){
		
		name = s1;
		roll = r1;
	}
	
	Comparable compare only compares one data type at a time
	public int compareTo( Students s1 ){
		
		return name.compareTo(s1.name);
	}
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

class LHsetallinone{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet<Students> lhset = new LinkedHashSet<Students>();
		
		System.out.println("Enter the size");
		
		int size = sc.nextInt();
		
		for(int i = 0 ; i < size ; i++){
		   
		   int roll = sc.nextInt();
		   String name = sc.nextLine();
		   lhset.add(new Students(name,roll));
		}
		
		System.out.println("Elements in user defined class");
		Iterator<Students> itr = lhset.iterator();  
		
		while(itr.hasNext()){
		
			Students temp = (Students) itr.next();
			System.out.println("Name - "+temp.name+"\tRoll No. - "+temp.roll);
		}
	}
}