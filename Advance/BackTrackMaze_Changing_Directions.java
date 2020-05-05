/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class BackTrackMaze_Changing_Directions
{

	static String arr[] = {"10","01","-10","0-1"};
	
	static int n = 9;
	static int val = 1;
	
	static void append(String [] arr , int i , int j){
		
		//for(String a : arr)
		//		System.out.print(" BA "+a+" ");
			
		//System.out.println();
		String temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		//for(String a : arr)
		//		System.out.print(" AA "+a+" ");
		//System.out.println();
	}
	
	static void swap(String [] arr , int i){
		
		//for(String a : arr)
		//	System.out.print(" BS "+a+" ");
		//System.out.println();
		String temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
		//for(String a : arr)
		//	System.out.print(" AS "+a+" ");
		//System.out.println();
	}
	static int prob[][]={
		{0,0,0,1,0,1,1,1,1},
		{0,1,0,0,0,1,1,1,1},
		{1,0,0,1,0,1,1,1,1},
		{1,0,1,0,0,1,1,1,1},
		{1,0,0,0,1,1,1,1,1},
		{1,1,0,0,0,0,0,1,1},
		{1,0,0,1,0,1,0,1,1},
		{1,0,1,0,0,0,0,0,0},
		{1,0,0,0,0,1,0,0,0}
	};
 
	static boolean solvemaze(int x,int y,int[][] solution)
	{
	  
		if(x== n-1 && y== n-1)
		{
			solution[x][y]=val++;
			return true;
		}
		if( x>=0 && x<=n-1 && y>=0 && y<=n-1 && prob[x][y]==0 && solution[x][y]==0)
		{
			solution[x][y]=1;
			val++;
			
			if( arr[0].length() == 2 ){
				if(solvemaze( x+Integer.parseInt(String.valueOf(arr[0].charAt(0)).toString()) , y+Integer.parseInt(arr[0].substring(1)) ,solution) == true)//down
				{
					return true;
				}
			}
			else{
				
				if( arr[0].charAt(0) == '-' ){
					
					if(solvemaze( x-1 , y ,solution) == true)//down
					{
						return true;
					}
				}
				else{
					
					if(solvemaze( x , y-1 ,solution) == true)//down
					{
						return true;
					}
				}
			}
				
			if( arr[1].length() == 2 ){
				
				if(solvemaze(x+Integer.parseInt(String.valueOf(arr[1].charAt(0)).toString()),y+Integer.parseInt(arr[1].substring(1)),solution)==true)//right
				{
					return true;
				}
			}
			else{
				if( arr[1].charAt(0) == '-' ){
					
					if(solvemaze( x-1 , y ,solution) == true)//down
					{
						return true;
					}
				}
				else{
					
					if(solvemaze( x , y-1 ,solution) == true)//down
					{
						return true;
					}
				}
			}
			
			if(arr[2].length() == 2){
				if(solvemaze(x+Integer.parseInt(String.valueOf(arr[2].charAt(0)).toString()),y+Integer.parseInt(arr[2].substring(1)),solution)==true)//top
				{
					return true;
				}
			}
			else{
				if( arr[1].charAt(0) == '-' ){
					
					if(solvemaze( x-1 , y ,solution) == true)//down
					{
						return true;
					}
				}
				else{
					
					if(solvemaze( x , y-1 ,solution) == true)//down
					{
						return true;
					}
				}
			}
			
			if(arr[3].length() == 2){
				
				if(solvemaze(x+Integer.parseInt(String.valueOf(arr[3].charAt(0)).toString()),y+Integer.parseInt(arr[3].substring(1)),solution)==true)//left
				{
					return true;
				}
			}
			else{
				if( arr[1].charAt(0) == '-' ){
					
					if(solvemaze( x-1 , y ,solution) == true)//down
					{
						return true;
					}
				}
				else{
					
					if(solvemaze( x , y-1 ,solution) == true)//down
					{
						return true;
					}
				}
			}
			val--;
			solution[x][y]=0;
			return false;
		}
		return false;
	}
	public static void main(String[] args)
	{
		int start = 1;
		int solution[][] = new int [n][n];
		
		for(int total = 1 ; total <= 4 ; total++){
			start = 1;
			for(int k = 1 ; k <= 6 ; k++){

				int flag = 0;
				for(int a = 0 ; a < n ; a++){
					for(int b = 0 ; b < n ; b++){
						
						solution[a][b] = 0;
					}
				}

				System.out.println();
				System.out.println();
				
				if(solvemaze(0,0,solution)==false)
				{
					System.out.println("No path");
				}
				
				else
				{
					for(int i=0;i<n;i++)
					{
					  for(int j=0;j<n;j++)
					  {
							System.out.print(prob[i][j]+" ");
					  }
						System.out.println();
					}
					
					System.out.println();
					System.out.println();
					
					for(int i=0;i<n;i++)
					{
					  for(int j=0;j<n;j++)
					  {
						System.out.print(solution[i][j]+" ");
					  }
					  System.out.println();
					}
				}

				
				for(String a: arr)
					System.out.print(a+" ");
				if( total+1 != 4 && k == 6 ){
					
					append(arr,0,3);
					start=1;
					//System.out.println("A "+total);
				//	flag = 1;
				}
				else if( total+1 == 4 && k == 6 ){
					//System.out.println();
					//for(String b : arr)
					//	System.out.print(b+" ");
					append(arr,1,0);
					start=1;
				}
				
				//System.out.println();
				//System.out.println();
				
				if( start == 3 )
					start = 1;
				

				System.out.println();
				System.out.println();
				
				if( k != 6 ){
					swap(arr,start);
					start++;
				}
				
				val = 1;
			}
		}
	}
}