package exercisepgm_1;

import java.util.ArrayList;

public class MaxSumOfSubArray {
	
	public static long maxsumsubarr(ArrayList<Integer> arr,int n,int k)
	{
		long max=Integer.MIN_VALUE;
		long cursum=0;
		for(int i=0;i<k;i++)
		{
			cursum +=arr.get(i);
		}
		max=cursum;
		for(int i=1;i<n-k+1;i++)
		{
			cursum=cursum-arr.get(i-1)+arr.get(i+k-1);
			if(cursum>max)
			{
				max=cursum;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int n=arr.size();
		int subarraysize=3;
		long max=maxsumsubarr(arr,n,subarraysize);
		System.out.println("MaxSumOfSubarray:"+max);
		

	}

}
