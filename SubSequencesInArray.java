package exercisepgm_1;

import java.math.BigInteger;

public class SubSequencesInArray {
	
	public static void subseq(int[] arr)
	{
		int total=(int) Math.pow(2, arr.length);
		//we are not conside empty set so we have to use total-1
		for(int counter=1;counter<total;counter++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(BigInteger.valueOf(counter).testBit(j))
			{
				System.out.print(arr[j]+" ");
			}
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		subseq(arr);

	}

}
