/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class BackTrackMaze_Shortest_and_ALL
{

	static int n = 9;
	static int val = 1 , flag = 0;
	static int min [][] = new int[n][n];
	static int minimum = n*n;
	
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
	  
		if( x== n-1 && y== n-1 )
		{
			solution[x][y]=val++;
			flag = 1;
			
			if( val < minimum ){
				
				minimum = val;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						min[i][j] = solution[i][j];
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(solution[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println();
			
			val--;
			return false;
		}
		if( x>=0 && x<=n-1 && y>=0 && y<=n-1 && prob[x][y]==0 && solution[x][y]==0)
		{
			solution[x][y]=1;
			val++;
			
			if(solvemaze( x+1,y,solution) == true)//down
			{
				return true;
			}
					
			if(solvemaze(x,y+1,solution)==true)//right
			{
					return true;
			}
			
			if(solvemaze(x-1,y,solution)==true)//top
			{
				return true;
			}
			
			if(solvemaze(x,y-1,solution)==true)//left
			{
				return true;
			}
			
			val--;
			solution[x][y]=0;
			return false;
		}
		
		return false;
	}
	public static void main(String[] args)
	{
		
		int solution[][] = new int [n][n];
		
		System.out.println();
		
		boolean bol = solvemaze(0,0,solution);
		
		if( flag == 0 )
		{
			System.out.println("No path");
		}
		else{
			System.out.println("Minimum path");
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(min[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}