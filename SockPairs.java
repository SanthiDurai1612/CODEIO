package exercisepgm_1;

import java.util.HashMap;
import java.util.Map.Entry;

//find the totalcount of pairs in each design of socks (1,2,3)

public class SockPairs {
	
	public static void socks(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=1;
		int sockcnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],count );
			}
			else
			{
				int cnt=map.get(arr[i]);
				map.put(arr[i], cnt+1);
			}
		}
		for(Entry<Integer,Integer> m:map.entrySet())
		{
			sockcnt+=m.getValue()/2;
		}
		System.out.println("Total Pairs:"+" "+ sockcnt);
		
	}

	public static void main(String[] args) {
		int[] arr= {2,1,1,2,3,3,1,1};
		socks(arr);

	}

}
