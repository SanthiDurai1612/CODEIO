package exercisepgm_1;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void  spiral(int[][] arr,ArrayList<Integer> list)
	{
		int left=0;
		int right=arr[0].length-1;
		int top=0;
		int bottom=arr.length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
			{
				list.add(arr[top][i]);
			}
			top++;
			for(int j=top;j<=bottom;j++)
			{
				list.add(arr[j][right]);
			}
			right--;
			
			if(left<=right)
			{
				for(int k=right;k>=left;k--)
				{
					list.add(arr[bottom][k]);
				}
				bottom--;
			}
			if(top<=bottom)
			{
				for(int m=bottom;m>=top;m--)
				{
					list.add(arr[m][left]);
				}
				left++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= { {1,2,3,4},
        		{5,6,7,8},
        		{9,10,11,12},
        		{13,14,15,16},
        	 };
        
  	  ArrayList<Integer> list=new ArrayList<>();
  	  spiral(arr,list);
  	  
  	  System.out.print(list);
        
        };

	}


