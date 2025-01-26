package exercisepgm_1;

public class SnakePattern {
	
	public static void snake(int[][] arr,int row,int col)
	{
		for(int i=0;i<row;i++)
			
		{
			if(i%2==0)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j=col-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= { {1,2,3},
				{4,5,6},
				{7,8,9},
				{11,12,13},
		};
		int row=arr.length;
		int col=arr[0].length;
		snake(arr,row,col);

	}

}
