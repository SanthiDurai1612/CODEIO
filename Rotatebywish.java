package exercisepgm_1;

import java.util.Arrays;

public class Rotatebywish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int[] res=new int[arr.length];
		int k=2;
		int p=0;
		if(k>arr.length)
		{
			k=k%arr.length;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if((i+k)>arr.length-1)
			{
				p=i+k-(arr.length);
				res[p]=arr[i];
			}
			else
			{
				res[(i+k)] = arr[i];
			}
		}
		System.out.print(Arrays.toString(res));

	}

}
