package exercisepgm_1;

//if the element which has lesser element after that is consider as a leader here leader is 1,7,16,17
public class LeaderofArray {
	
	public static void leader(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>max)
			{
				System.out.print(arr[i]+" ");
				max=arr[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,16,5,7,1};
		
		leader(arr);
		

	}

}
