import java.util.*;

class Rotten_orange{
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		int arr[][] = {{2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1}};
		int repeat = 1 , ct = 0;
		
		while( repeat != 0 ){
			
			repeat = 0;
			for(int i = 0 ; i < 3 ; i++){
				for(int j = 0 ; j < 5 ; j++){
					
					if( arr[i][j] == 2 && i != 0 && j != 0 && i != 2 && j != 4 ){//mid
						
						if(arr[i][j+1] == 1){//right
							
							arr[i][j+1] = 2;
							if( j != 3 && arr[i][j+2] == 1 )//next_right
								repeat = 1;
							if( arr[i+1][j+1] == 1 )//right_up
								repeat = 1;
							if( arr[i-1][j+1] == 1 )//right_down
								repeat = 1;
						}
						if(arr[i][j-1] == 1){//left
							
							arr[i][j-1] = 2;
							if( j != 1 && arr[i][j-2] == 1 )//next_left
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//left_up
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//left_down
								repeat = 1;
						}
						if(arr[i+1][j] == 1){//up
							
							arr[i+1][j] = 2;
							if( arr[i+1][j+1] == 1 )//up_right
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//up_left
								repeat = 1;
						}
						if(arr[i-1][j] == 1){//down
							
							arr[i-1][j] = 2;
							if( arr[i-1][j+1] == 1 )//down_right
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//down_left
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && i == 0 && j != 0 && j != 4 ){//top_mid
						
						if(arr[i][j+1] == 1){//right
							
							arr[i][j+1] = 2;
							if( j != 3 && arr[i][j+2] == 1 )//next_right
								repeat = 1;
							if( arr[i+1][j+1] == 1 )//right_up
								repeat = 1;
						}
						if(arr[i][j-1] == 1){//left
							
							arr[i][j-1] = 2;
							if( j != 1 && arr[i][j-2] == 1 )//next_left
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//left_up
								repeat = 1;
						}
						if(arr[i+1][j] == 1){//up
							
							arr[i+1][j] = 2;
							if( arr[i+2][j] == 1 )//next_up
								repeat = 1;
							if( arr[i+1][j+1] == 1 )//up_right
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//up_left
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && j != 0 && j != 4 && i == 2 ){//bottom_mid
						
						if(arr[i][j+1] == 1){//right
							
							arr[i][j+1] = 2;
							if( j != 3 && arr[i][j+2] == 1 )//next_right
								repeat = 1;
							if( arr[i-1][j+1] == 1 )//right_down
								repeat = 1;
						}
						if(arr[i][j-1] == 1){//left
							
							arr[i][j-1] = 2;
							if( j != 1 && arr[i][j-2] == 1 )//next_left
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//left_down
								repeat = 1;
						}
						if(arr[i-1][j] == 1){//down
							
							arr[i-1][j] = 2;
							if( i != 1 && arr[i-2][j] == 1 )//next_down
								repeat = 1;
							if( arr[i-1][j+1] == 1 )//down_right
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//down_left
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && i == 0 && j == 0 ){//top_first
						
						if(arr[i][j+1] == 1){//right
							
							arr[i][j+1] = 2;
							if( arr[i][j+2] == 1 )//next_right
								repeat = 1;
							if( arr[i+1][j+1] == 1 )//right_up
								repeat = 1;
						}
						if(arr[i+1][j] == 1){//up
							
							arr[i+1][j] = 2;
							if( arr[i+2][j] == 1 )//next_up
								repeat = 1;
							if( arr[i+1][j+1] == 1 )//up_right
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && i == 0 && j == 4 ){//top_last
						
						if(arr[i][j-1] == 1){//left
							
							arr[i][j-1] = 2;
							if( arr[i][j-2] == 1 )//next_left
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//left_up
								repeat = 1;
						}
						if(arr[i+1][j] == 1){//up
							
							arr[i+1][j] = 2;
							if( arr[i+2][j] == 1 )//next_up
								repeat = 1;
							if( arr[i+1][j-1] == 1 )//up_left
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && j == 0 && i == 2 ){//bottom_first
						
						if(arr[i][j+1] == 1){//right
							
							arr[i][j+1] = 2;
							if( arr[i][j+2] == 1 )//next_right
								repeat = 1;
							if( arr[i-1][j+1] == 1 )//right_down
								repeat = 1;
						}
						if(arr[i-1][j] == 1){//down
							
							arr[i-1][j] = 2;
							if( arr[i-2][j] == 1 )//next_down
								repeat = 1;
							if( arr[i-1][j+1] == 1 )//down_right
								repeat = 1;
						}
					}
					else if( arr[i][j] == 2 && j == 0 && i == 2 ){//bottom_last
						
						if(arr[i][j-1] == 1){//left
							
							arr[i][j+1] = 2;
							if( arr[i][j-2] == 1 )//next_left
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//right_down
								repeat = 1;
						}
						if(arr[i-1][j] == 1){//down
							
							arr[i-1][j] = 2;
							if( arr[i-2][j] == 1 )//next_down
								repeat = 1;
							if( arr[i-1][j-1] == 1 )//down_left
								repeat = 1;
						}
					}
				}
			}
			ct++;
		}
		
		if( ct > 0 )
			System.out.println(ct);
		else
			System.out.println("-1");
	}
}