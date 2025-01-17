package exercisepgm_1;

import java.util.Arrays;

public class SortElementToRank {
	
	public static void swap(int[] arr,char[] arr1)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					char tempChar = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tempChar;
				}
				
			}
		}
		
		System.out.print(Arrays.toString(arr)+" "+Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,3,4,6,1};
		char[] arr1= {'p','a','e','d','i'};
		swap(arr,arr1);
		}

	}


