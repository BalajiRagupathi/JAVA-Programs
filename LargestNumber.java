import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int size = scanner.nextInt();
                int arr[] = new int[size];

                for(int i = 0 ; i < size ; i++){
                        
                        arr[i] = scanner.nextInt();
                }
                
                Arrays.sort(arr);
                String max = "" + arr[0];
                
                for(int i = 1 ; i < size ; i++){
                        
                        String l = "";
                        l = l + arr[i];
                        if( l.length() != max.length() ){
                                
                                if( l.length() > max.length() ){
                                        
                                        int gflag = 0;
                                        int m = Integer.parseInt(max);
                                        int a = arr[i];
                                        int ct = max.length()-1;
                                        while( ct != 0 && gflag != 1 ){
                                                
                                                 int pw =(int) Math.pow(10,ct);
                                                 int m_first = m%pw;
                                                 m = m / pw;
                                                 int a_first = a%pw;
                                                 a = a / pw;
                                                 if( a_first > m_first ){
                                                        
                                                        max = arr[i] + max;
                                                        gflag = 1;
                                                 }
                                                 else if( a_first < m_first ){
                                                        
                                                        max = max + arr[i];
                                                        gflag = 1;
                                                 }
                                                 ct--;
                                        }
                                        
                                        if( gflag==0 ){
                                                
                                                max = max+arr[i];
                                        }
                                }
                                else{
                                        int gflag = 0;
                                        int m = Integer.parseInt(max);
                                        int a = arr[i];
                                        int ct = l.length()-1;
                                        while( ct != 0 && gflag != 1 ){
                                                
                                                 int pw =(int) Math.pow(10,ct);
                                                 int m_first = m%pw;
                                                 m = m / pw;
                                                 int a_first = a%pw;
                                                 a = a / pw;
                                                 if( a_first > m_first ){
                                                        
                                                        max = arr[i] + max;
                                                        gflag = 1;
                                                 }
                                                 else if( a_first < m_first ){
                                                        
                                                        max = max + arr[i];
                                                        gflag = 1;
                                                 }
                                                 ct--;
                                        }
                                        
                                        if( gflag==0 ){
                                                
                                                max = arr[i]+max;
                                        }
                                        
                                }
                        }
                        else if( l.length() == max.length() ){
                                
                                if( arr[i] > Integer.parseInt(max) ){
                                        
                                        max = arr[i] + max;
                                }
                                else if( arr[i] < Integer.parseInt(max) ){
                                        
                                        max = max + arr[i];
                                }
                                else
                                        max = max + arr[i];
                        }
                }
                
                System.out.println("Max = "+max);
	}
}
