import java.util.*;

public class HelloWorld{

    static int count=0 , min = Integer.MAX_VALUE;

    static boolean find(int [][] arr , int [][] sol , int i , int j , int m , int n , int key , int [][] mini){
        
        if( i >= m && j >= n && arr[i][j] != 1){
            
            sol[i][j] = 1;
            count++;
            
            if( count < min ){
                
                min = count;
                
                for(int k = 0 ; k <= m ; k++){
                    for(int l = 0 ; l <= n ; l++){
                        
                        
                        mini[k][l] = sol[k][l];
                    }
                }   
            }
            
            count--;
            sol[i][j] = 0;
            return false;
        }
        else if(i >= m && j >= n && arr[i][j] == 1 && key != 0){
            
            sol[i][j] = 1;
            count++;
            
            if( count < min ){
                
                min = count;
                
                for(int k = 0 ; k <= m ; k++){
                    for(int l = 0 ; l <= n ; l++){
                        
                        
                        mini[k][l] = sol[k][l];
                    }
                }   
            }
            
            count--;
            sol[i][j] = 0;
            return false;
        }
        
        if( i <= m && j <= m && i >= 0 && j >= 0 && arr[i][j] == 0 && sol[i][j] == 0 ){
            
            sol[i][j] = 1;
            count++;
            
            if( find(arr,sol,i+1,j,m,n,key,mini) == true )
                return true;
            if( find(arr,sol,i,j+1,m,n,key,mini) == true )
                return true;
            if( find(arr,sol,i-1,j,m,n,key,mini) == true )
                return true;
            if( find(arr,sol,i,j-1,m,n,key,mini) == true )
                return true;
            
            count--;
            sol[i][j] = 0;
        }
        else if( i <= m && j <= m && i >= 0 && j >= 0 && arr[i][j] != 0 && sol[i][j] == 0 && key != 0 ){
            
            int temp = arr[i][j];
            arr[i][j] = 0;
            if( find(arr,sol,i,j,m,n,key-1,mini) == true )
                return true;
                
            arr[i][j] = temp;
        }
        return false;
    }
    
     public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int arr[][] = new int[m][n];
        int sol[][] = new int[m][n];
        int mini[][] = new int[m][n];
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                
                arr[i][j] = scanner.nextInt();
            }
        }
        
        int key = scanner.nextInt();
        
        find(arr,sol,0,0,m-1,n-1,key,mini);
        
        System.out.println(min);
        
        for(int k = 0 ; k < m ; k++){
            for(int l = 0 ; l < n ; l++){
                
                System.out.print(mini[k][l]+" ");
            }
            System.out.println();
        }
        
     }
}