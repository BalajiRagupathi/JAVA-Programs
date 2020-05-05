import java.io.*; 
  
class Zero { 
  
    // Function to calculate  
    // trailing zeros 
    static int trailingZeroes(int n) 
    { 
        int cnt = 0; 
        while (n > 0)  
        { 
            n /= 5; 
            cnt += n; 
        } 
        return cnt; 
    } 
  
    static void binarySearch(int n) 
    { 
        int low = 0; 
          
        // range of numbers 
        int high = 1000000; 
  
        // binary search for first number  
        // with n trailing zeros 
        while (low < high) { 
            int mid = (low + high) / 2; 
            int count = trailingZeroes(mid); 
            if (count < n) 
                low = mid + 1; 
            else
                high = mid; 
        } 
  
        // Print all numbers after low  
        // with n trailing zeros. 
        int result[] = new int[1000]; 
        int k = 0; 
        while (trailingZeroes(low) == n) { 
            result[k] = low; 
            k++; 
            low++; 
        } 
  
        // Print result 
        for (int i = 0; i < k; i++) 
            System.out.print(result[i] + " "); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 3; 
        binarySearch(n); 
    } 
} 