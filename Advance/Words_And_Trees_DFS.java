import java.io.*;
import java.util.*;
 
 public class CPTemplate {
 
    
 
    static void makeGraph(HashMap<Integer,ArrayList<Integer>> graph,int u,int v){
        if(graph.containsKey(u)){
            ArrayList<Integer> list = graph.get(u);
            list.add(v);
            graph.put(u,list);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(v);
            graph.put(u,list);
        }
    }
    static ArrayList<Character> dfs(HashMap<Integer,ArrayList<Integer>> graph,int start,boolean[] visited,HashMap<Integer,ArrayList<Character>> ans,char[] inp){
ArrayList<Character> all = new ArrayList<>();
        if(!visited[start]){
            ArrayList<Integer> adj = graph.get(start);
            all.add(inp[start]);
            visited[start]=true;
            for(int i=0 ; i<adj.size() ; i++){
                if(!visited[adj.get(i)]){
             ArrayList<Character> list = dfs(graph,adj.get(i),visited,ans,inp);
                    all.addAll(list);
                }
            }   
        }
        ans.put(start,all);
        return all;
 
    }
 
    public static void main(String args[] ) throws Exception {
        
        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = fs.nextInt();
        int q = fs.nextInt();
        char inp[] = new char[n+1];
        for(int i=1 ; i<=n ; i++){
         String s = fs.next();
         inp[i]=s.charAt(0);
        }
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0 ; i<n-1 ; i++){
            int u = fs.nextInt();
            int v = fs.nextInt();
            makeGraph(graph,u,v);
            makeGraph(graph,v,u);
        }
        boolean[] visited = new boolean[n+1];
        HashMap<Integer,ArrayList<Character>> map = new HashMap<>();
         dfs(graph,1,visited,map,inp);
 
        // for(int i=1 ; i<=n ; i++){
        //     ArrayList<Character> lis = map.get(i);
        //     System.out.print(i+"-> ");
        //     for(int j=0 ; j<lis.size(); j++){
        //         System.out.print(lis.get(j)+" ");
        //     }
        //     System.out.println();
        // }
 
        while(q-->0){
            int idx = fs.nextInt();
            String ip = fs.next();
            HashSet<Character> set = new HashSet<>();
            ArrayList<Character> lis = map.get(idx);
            HashMap<Character,Integer> map3 = new HashMap<>();
            for(int i=0 ; i<lis.size() ; i++){
                if(map3.containsKey(lis.get(i))){
                    int co = map3.get(lis.get(i));
                    co++;
                    map3.put(lis.get(i),co);
                }else{
                    map3.put(lis.get(i),1);
                }
            }
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0 ; i<ip.length() ; i++){
                char ch = ip.charAt(i);
                if(map2.containsKey(ch)){
                    int val = map2.get(ch);
                    val++;
                    map2.put(ch,val);
                }else{
                    map2.put(ch,1);
                }
            }
            int answ =0 ;
            for(Character ch : map2.keySet()){   
                if(map3.containsKey(ch)){
                    if(map2.get(ch)-map3.get(ch)>=0){
                        answ = answ + (map2.get(ch)-map3.get(ch));
                    }
                }else{
                       answ = answ + map2.get(ch);
                }
            }
 
            out.println(answ);
 
        }
 
out.close();
 
    }
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
    }
    //--------------------------------------------------------
}