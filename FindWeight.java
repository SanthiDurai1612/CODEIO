package exercisepgm_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,36,54,89,12};
		Map<Integer,Integer> map=new HashMap<>();
	 
		
		for(int i=0;i<arr.length;i++)
		{
			int weight=0;
			double sqrt=Math.sqrt(arr[i]);
		
			if(arr[i]%4==0 && arr[i]%6==0)
			{
				weight+=4;
			}
			if(arr[i]%2==0)
			{
				weight+=3;
			}
			if(sqrt*sqrt == (double)arr[i])
			{
				weight+=5;
			}
	     map.put(arr[i],weight);	
	     

		
		}
		
     List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
	  list.sort(Comparator.comparing(Map.Entry::getValue));
		
	  for (Map.Entry<Integer, Integer> entry : list) {
          System.out.println("<" + entry.getKey() + "," + entry.getValue() + ">");
      }

	}
}
	
