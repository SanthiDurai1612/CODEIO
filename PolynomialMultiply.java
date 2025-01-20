package exercisepgm_1;

import java.util.Arrays;

public class PolynomialMultiply {

	public static void polynomial(int[] arr,int[] arr1)
	{
		int n=arr.length;
		int m=arr1.length;
		int[] arr2=new int[n+m-1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr2[i+j] += arr[i]*arr1[j];
			}
		}
		
		System.out.print(Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,3,2};
		int[] arr1= {2,0,4};
		polynomial(arr,arr1);

	}

}
