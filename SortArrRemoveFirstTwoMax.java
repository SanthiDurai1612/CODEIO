package exercisepgm_1;

import java.util.Arrays;

public class SortArrRemoveFirstTwoMax {
	
	public static void sortarr(int[] arr)
	{
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(fmax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i])
			{
				smax=arr[i];
			}
		}
	
		Arrays.sort(arr);
		
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]!=fmax && arr[k]!=smax)
			{
				System.out.print(arr[k]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,0,7,8,2};
		sortarr(arr);

	}

}
