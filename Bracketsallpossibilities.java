import java.util.*;

class Main{
    
    static boolean valid(String str){
        
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            
            if(str.charAt(i) == '(')
                count++;
            else if(str.charAt(i) == ')')
                count--;
            if(count < 0)
                return false;
        }
        return count == 0;
    }
    
    static boolean para(char str){
        return (str==')' || str == '(')?true:false;
    }
    
    static void find(String str){
        
        String ans = "";
        HashSet<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        set.add(str);
        q.offer(str);
        String temp = "";
        
        boolean level = false;
        
        while(!q.isEmpty()){
            
            str = q.poll();
            
            if(valid(str)){
                ans = str;
                level = true;
            }
            
            if(level)
                continue;
            
            for(int i = 0 ; i < str.length() ; i++){
                
                if(!para(str.charAt(i)))
                    continue;
                else{
                    
                    temp = str.substring(0,i)+str.substring(i+1);
                    
                    if(!set.contains(temp)){
                        
                        q.offer(temp);
                        set.add(temp);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        find(st);
    }
}
