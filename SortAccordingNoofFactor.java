package exercisepgm_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortAccordingNoofFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,16,3,2,8};
		int[] factor=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=1;j<=arr[i];j++)
			{
				
				if((arr[i] % j)==0)
				{
					count++;
					
				}
			}
			 
			factor[i]=count;
		}
		for(int i=0;i<arr.length;i++)
		{
			int m=i;
			for(int j=i+1;j<arr.length;j++)
			{
				int n=j;
				if(factor[i]<factor[j])
				{
					int temp=factor[i];
					factor[i]=factor[j];
					factor[j]=temp;
					
					int temp1=arr[m];
					arr[m]=arr[n];
					arr[n]=temp1;
					
				}
				
			}
		}
	System.out.print(Arrays.toString(arr));
	
	
      
	}

}
