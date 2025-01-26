package exercisepgm_1;

import java.util.Arrays;

public class PushZeroToEnd {
	
	public static void pushzero(int[] arr)
	{
		
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]!=0)
			{
				i++;
				
			}
			else if(arr[j]==0)
			{
				j--;
			}
			else
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {1,0,2,0,3,0,6};
		pushzero(arr);
	}

}
