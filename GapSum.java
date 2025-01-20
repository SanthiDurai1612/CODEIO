package exercisepgm_1;

import java.util.Vector;

//find the sum with gap if gap=3 we have to traverse the array 3 times and find the sum skip 3 element
public class GapSum {

	public static void gap(int[] arr,int gap)
	{
		int j=0;
		Vector<Integer> v=new Vector<Integer>();
		while(j<gap)
		{
			int sum=0;
			for(int i=j;i<arr.length;i=i+3)
			{
			  	sum += arr[i];
			}
			v.add(sum);
			j++;
		}
		System.out.print("Final Res:"+" "+ v);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int gap=3;
		gap(arr,gap);

	}

}
