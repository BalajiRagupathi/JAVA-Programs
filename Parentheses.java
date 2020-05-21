import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
    
        String s = scanner.nextLine();
        int size = s.length();    

        Stack<Character> st = new Stack<Character>();
        
        for(int j = 0; j < size ; j++){

            char c = s.charAt(j);
            
            if(  ( c == ')' || c == '}' || c == ']') && st.isEmpty() ){
                
                st.push(c);
                break;
            }
            else if( c == '{' || c == '(' || c == '[' ){

                st.push(c);
            }
            else if( !st.isEmpty() && ( (c == ')' && st.peek() == '(' ) || (c == '}' && st.peek() == '{' ) || (c == ']' && st.peek() == '[' ) ) ){

                st.pop();
            }
            else{

                st.push(c);
            }
        }

        if( st.isEmpty() )
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}
