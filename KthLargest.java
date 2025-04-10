package exercisepgm_1;

import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,2,19,27,80};
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int element=arr[(arr.length)-k];
		System.out.print(element);

	}

}
