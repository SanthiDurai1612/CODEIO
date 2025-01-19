package exercisepgm_1;

import java.util.Arrays;

public class MissingNumAndRepeatNum {
	
	public static void missrepeat(int[] arr,int[] count,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(count[arr[i]-1]==0)
			{
				count[arr[i]-1]=arr[i];
			}
			else
			{
				System.out.println("Repeating Element:"+" "+ arr[i]);
			}
			
		}
		
		for(int j=0;j<count.length;j++)
		{
			
		
			if(count[j]==0)
			{
				System.out.println("Missing Element:"+" "+ (j+1));
			}
		}
		System.out.print(Arrays.toString(count));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,4,5};
		int n=6;
		int[] count=new int[arr.length];
		missrepeat(arr,count,n);

	}

}
