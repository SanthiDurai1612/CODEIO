package exercisepgm_1;

public class UnionOfTwoArray {
	
	public static void union(int[] arr1,int[] arr2,int n,int m)
	{
		int i=0;
		int j=0;
		while(i<n && j<m)
		{
			
			//skip duplicates in arr1
			if(i>0 && i<n && arr1[i]==arr1[i-1])
			{
				i++;
				
				
			}
			
			//skip duplicates in arr2
			if(j>0 && j<m && arr2[j]==arr2[j-1])
			{
				j++;
			}
			
			if(i>=n || j>=m)
			{
				break;
			}
			if(arr1[i]>arr2[j])
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
				
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		
	
		//remaining element in arr1
		while(i<n)
		{
			if(i==0||arr1[i]!=arr1[i-1])
			{
				System.out.print(arr1[i]+" ");
				
			}
			i++;
		}
		
		//remaining element in arr2
		while(j<m)
		{
			if(j==0||arr2[j]!=arr2[j-1])
			{
				System.out.print(arr2[j]+" ");
				
			}
			j++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,1};
		int[] arr2= {2,2,3};
		int n=arr1.length;
		int m=arr2.length;
		union(arr1,arr2,n,m);
		

	}

}
