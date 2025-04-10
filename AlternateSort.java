package exercisepgm_1;

import java.util.ArrayList;
import java.util.List;

public class AlternateSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,2,7,9,1,0};
		List<Integer> increase=new ArrayList<>();
	
		
		for(int i=0;i<arr.length;i++)
		{
			increase.add(arr[i]);
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=increase.get(i);
					increase.set(i, increase.get(j));
					increase.set(j,temp);
				}
			}
		}
		
		int start=0;
		int end=increase.size()-1;
		while(start<end)
		{
			System.out.print(increase.get(start)+" ");
			System.out.print(increase.get(end)+" ");
			start++;
			end--;
			
		}
		if(increase.size()%2 != 0)
		{
		System.out.print(increase.get(start));
		}
		

	}

}
