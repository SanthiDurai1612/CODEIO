package exercisepgm_1;

public class SecondLargestInArray {
	
	public static void secondlarge(int[] arr)
	{
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fmax)
			{
				smax=fmax;
				fmax=arr[i];
				
			}
			else if(arr[i]>smax )
			{
				smax=arr[i];
			}
		}
		
		System.out.print("Second Largest Element:"+ " "+smax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {19,9,18};
  secondlarge(arr);
	}

}
