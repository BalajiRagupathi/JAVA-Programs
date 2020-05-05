import java.util.*;

public class BackTrackRat{

    public static ArrayList<Integer> al = new ArrayList<>();
    
    static int peek = -1;
    
    static int peek(){
        
        return al.get(peek);
    }
    
    // static void checktop(){
        
    //     if( al.contains(Integer.parseInt(id)-10) && Integer.parseInt(id)-10 != 0 ){
                        
    //         arr[i-1][j] = 1;
    //         al.remove(al.indexOf(Integer.parseInt(id)-10));
    //         peek--;
    //     }
    // }
    
    static void calculate(int [][] arr , int m , int n){
        
        for(int i = 0 ; i < m ; i++){
             
            for(int j = 0 ; j < n ; j++){
                
                String id = "" + i + j;
                
                if( arr[i][j] == 0 && al.isEmpty() ){
                    
                    al.add(Integer.parseInt(id));
                    peek++;
                }
                
                else if( arr[i][j] == 0 && !al.isEmpty() ){
                    
                    if( Integer.parseInt(id)-1 == peek()  ){
                        
                        al.add(Integer.parseInt(id));
                        peek++;
                    }
                    
                    
                    else if( Integer.parseInt(id)-10 == peek() ){
                        
                        al.add(Integer.parseInt(id));
                        peek++;
                    }
                    
                    else if( al.contains(Integer.parseInt(id)-10) ){
                        
                        al.add(Integer.parseInt(id));
                        peek++;
                    }
                    
                    else if( al.contains(Integer.parseInt(id)-1) ){
                        
                        al.add(Integer.parseInt(id));
                        peek++;
                    }
                }
                else if( arr[i][j] == 1 ){
                    
                    if( al.contains(Integer.parseInt(id)-10) && Integer.parseInt(id)-10 != 0 ){
                                    
                        arr[i-1][j] = 1;
                        al.remove(al.indexOf(Integer.parseInt(id)-10));
                        peek--;
                    }
                }
            }
        }
    }
    
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int arr[][] = new int[m][n];
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                
                arr[i][j] = scanner.nextInt();
            }
        }
        
        calculate(arr,m,n);
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(al);
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}