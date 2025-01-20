package exercisepgm_1;

import java.util.Arrays;

//if arr[0][0] =1 then change all 0th column to 1 and all 0th row to 1
public class ChangeToOne {
	
	public static void change(int[][] arr,int r, int c)
	{
		//use row and cols array flag it to 1 when the row and col occurs 1 
		int[] row=new int[r];
		int[] cols=new int[c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==1)
				{
					row[i]=1;
					cols[j]=1;
				}
			}
		}
		
		
		for(int i=0;i<r;i++)
		{
			if(row[i]==1)
			{
				for(int j=0;j<c;j++)
				{
					arr[i][j]=1;
				}
			}
		}
		
		

		for(int j=0;j<c;j++)
		{
			if(cols[j]==1)
			{
				for(int i=0;i<r;i++)
				{
					arr[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,1},
				{0,0}
		};
		
		int r=arr.length;
		int c=arr[0].length;
		change(arr,r,c);
		
		}

	}

