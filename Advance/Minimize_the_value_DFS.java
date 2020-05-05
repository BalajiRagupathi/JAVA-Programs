/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
//2 1 
//1 1
//1 2
 
class Minimize_the_value_DFS {
    static int arrays[];
	static List<Integer> arraylist[];
	static long ans[];
	static int bfs(int node){
		LinkedList<Integer> list=new LinkedList<>();
		Set<Integer> set=new HashSet<>();
		set.add(node);
		list.add(node);
		while(list.size()!=0){
			int tem=list.remove(0);
			if(tem==1){
				if(arraylist[tem].size()<2)
					return tem;
			}
			else{
				if(arraylist[tem].size()<3)
					return tem;
			}
			for(int i=0;i<arraylist[tem].size();i++){
				node=arraylist[tem].get(i);
				if(!set.contains(node)){
					list.add(node);
					set.add(node);
				}
			}
		}
		return -1;
	}
	static long  find(int node ,int p){
		long sum=arrays[node];
		for(int i=0;i<arraylist[node].size();i++){
			if(arraylist[node].get(i)==p) continue;
			sum+=find(arraylist[node].get(i),node);
		}
		ans[node]=sum;
		return sum;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int val=in.nextInt();
		arrays=new int[n+2];
		ans=new long[n+2];
		arraylist=new ArrayList[n+2];
		for(int i=1;i<=n+1;i++){
			arraylist[i]=new ArrayList<>();
		}
		for(int i=1;i<=n;i++)
			arrays[i]=in.nextInt();
		arrays[n+1]=val;
		for(int i=0;i<n-1;i++){
			int x=in.nextInt();
			int y=in.nextInt();
			arraylist[x].add(y);
			arraylist[y].add(x);
		}
		int node=bfs(1);
		arraylist[node].add(n+1);
		ans[1]=find(1,-1);
		long res=0;
		for(int i=1;i<=n+1;i++){
			res+=ans[i];
		}
		System.out.println(res);
	}
}