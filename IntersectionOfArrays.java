package exercisepgm_1;

import java.util.HashMap;

public class IntersectionOfArrays {
	
	public static void intersect(int[] arr1,int[] arr2)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=arr1.length;
		int m=arr2.length;
		int count=1;
		if(n<m)
		{
			System.out.println("Unique Common Elements:");
			for(int i=0;i<n;i++)
			{
				if(!map.containsKey(arr1[i]))
				{
				map.put(arr1[i],count);
				}
				else
				{
					int c=map.get(arr1[i])+1;
					map.put(arr1[i], c);
				}
			}
			
			for(int i=0;i<m;i++)
			{
				if(map.containsKey(arr2[i]) && map.get(arr2[i])>0 )
				{
					System.out.println( arr2[i]);
					map.put(arr2[i], 0);
				}
			}
		}
		
		else
		{
			
			System.out.println("Unique Common Elements:");
			for(int i=0;i<m;i++)
			{
				if(!map.containsKey(arr2[i]))
				{
				map.put(arr2[i],count);
				}
				
				else
				{
					int c=map.get(arr2[i])+1;
					map.put(arr2[i], c);
				}
				
			}
			

			for(int i=0;i<n;i++)
			{
				if(map.containsKey(arr1[i]) && map.get(arr1[i])>0)
				{
					System.out.println( arr1[i]);
					map.put(arr1[i], 0);
				}
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,4,1,1};
		int[] arr2= {1,5,6,1,4};
		intersect(arr1,arr2);

	}

}
