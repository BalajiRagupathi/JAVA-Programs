import java.util.*;

public class Alpha_Pattern{

    static String dash(int size){
    
        String s = "";
    
        for(int i = 0 ; i < size ; i++)
            s = s + "-";
    
        return s;
    }
    
    static String alpha(char c , int size){
    
        String s = "";
    
        for(int i = 0 ; i < size ; i++)
            s = s + (char)(c-i) + "-";
    
        return s;
    }
     public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dashs = ( num * 2 ) - 2;
        char ch = (char) (96+num);
        
        for(int i = 0 ; i < num ; i++){
            String st = "";
            String std = "";
            std = std + dash(dashs);
            System.out.print(std);
            
            if( i == 0 )
                System.out.print(ch);
            else{
             
                st = st + alpha(ch,i);
                System.out.print(st);
                System.out.print((char)(ch-i));
                StringBuffer s = new StringBuffer(st);
                System.out.print(s.reverse());
            }
            
            System.out.print(std);
            System.out.println();
            dashs = dashs - 2;
        }
        dashs = 2;
        for(int i = num-2 ; i > -1 ; i--){
            
            String st = "";
            String std = "";
            std = std + dash(dashs);
            System.out.print(std);
            
            if( i == 0 )
                System.out.print(ch);
            else{
             
                st = st + alpha(ch,i);
                System.out.print(st);
                System.out.print((char)(ch-i));
                StringBuffer s = new StringBuffer(st);
                System.out.print(s.reverse());
            }
            
            System.out.print(std);
            System.out.println();
            dashs = dashs + 2;
        }
     }
}