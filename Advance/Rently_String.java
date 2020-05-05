import java.util.*;

class Index_Count{
	
	int index;
	String present;
	
	public Index_Count(int i , String p){
		
		index = i;
		present = p;
	}
}

class Rently_String{
	
	static HashMap<String,Index_Count> hm = new HashMap<>();
	
	static String find(List<String> q){
		
		String index = "";
		int count = 0;
		
		for(int i = 0 ; i < q.size() ; i++){
			
			String s = "";
			String temp = q.get(i).replaceAll("[\\W+]","");
			
			if( hm.containsKey(q.get(i)) && temp.length() == q.get(i).length() ){
				
				count++;
				Index_Count v = (Index_Count) hm.get(q.get(i));
				
				s = v.present;
				if( s.length() > index.length() )
					index = s;
			}
			else if( hm.containsKey(temp) && temp.length() != q.get(i).length() ){
				
				count++;
				index = "-2";
				break;
			}
		}
		
		if( count == q.size() )
			return index;
		else
			return "-1";
	}
	
	static String hash_put(List<String> sent , List<String> queri , int id ){//iterator each words in sentence and put frequency of words with index count
		
		String index = "";
		
		for(int i = 0 ; i < sent.size() ; i++){
			
			if( hm.containsKey(sent.get(i)) ){
				
				Index_Count v = (Index_Count) hm.get(sent.get(i));
				String t_p = v.present + v.index + " ";
				
				hm.put(sent.get(i),new Index_Count(id,t_p));
				
				
				if( queri.contains(sent.get(i)) && ( t_p.length() > 20 || sent.get(i).length() > 11 ) ){
					
					index = "-2";
					break;
				}
			}
			else if( sent.get(i).length() <= 11 ){
				
				String t = "" + id + " ";
				hm.put( sent.get(i) , new Index_Count( id , t ) );
				
				if( queri.contains(sent.get(i)) && sent.get(i).length() > 11 ){
					
					index = "-2";
					break;
				}
			}
		}
		
		if( !index.equals("-2") )
			index = find(queri);
		
		hm.clear();
		return index;
	}
	
	static String sentence_split(List<String> sents , List<String> querie){//splitting sentences for each line
		
		String index = "";
		int flag = 0;
		
		for(int i = 0 ; i < sents.size() ; i++){
			
			List<String> set = Arrays.asList(sents.get(i).split(" "));
			
			String t_index = hash_put(set,querie,i);
			
			if( t_index.equals("-2") || ( flag != 1 && i == sents.size()-1 ) ){
				
				index = t_index;
				break;
			}
			else if( !t_index.equals("-2") && !t_index.equals("-1") ){
				
				index = index + t_index + " ";
				flag = 1;
			}
		}
		
		return index;
	}
	
	static void solution(List<String> sentences , List<String> queries){//splitting queries for each line
		
		for(int i = 0 ; i < queries.size() ; i++){
		
			List<String> qe = Arrays.asList(queries.get(i).split(" "));
			
			String id = sentence_split(sentences,qe);
			System.out.println(id);
			
		}
	}
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int sent_size = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<String> se = new <String>ArrayList();
		
		for(int i = 0 ; i < sent_size ; i++)
			se.add(scanner.nextLine());
		
		int que_size = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<String> qe = new <String>ArrayList();
		
		for(int i = 0 ; i < que_size ; i++)
			qe.add(scanner.nextLine());
		
		solution(se,qe);
	}
}