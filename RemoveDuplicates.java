package exercisepgm_1;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void duplicateremove(int[] arr)
	{
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				arr[j]=arr[i];
			}
		}
		
		for(int i=0;i<=j;i++)
		{
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,4,3};
		Arrays.sort(arr);
		duplicateremove(arr);

	}

}
