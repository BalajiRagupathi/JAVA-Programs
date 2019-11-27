import java.util.*;
public class Program
{
    public static void main(String[] args) {
    
		int coef = 1 , key;
		
		key = new Scanner(System.in).nextInt();
		for(int i=0; i<34; i++)
		{
			
			for(int j=0; j <= i; j++)
			{
				if (j==0 || i==0)
					coef = 1;
				else
					coef = coef*(i-j+1)/j;
				if(i == key)
					System.out.print(coef+" ");
			}
		}
	}
}