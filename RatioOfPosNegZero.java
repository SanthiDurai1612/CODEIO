package exercisepgm_1;


//ratio = totcount/totlength of each +,-,0 element with 4 digit decimal
public class RatioOfPosNegZero {

	public static void ratio(int[] arr)
	{
		double pc=0;
		double nc=0;
		double zc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				pc++;
			}
			else if(arr[i]<0)
			{
				nc++;
			}
			else
			{
				zc++;
			}
		}
		
		String ratiopc=String.format("%.4f",pc/arr.length);
		String rationc=String.format("%.4f",nc/arr.length);
		String ratiozc=String.format("%.4f",zc/arr.length);
		System.out.println(ratiopc);
		System.out.println(rationc);
		System.out.println(ratiozc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,3,0,-5,-6,-7};
		ratio(arr);
	}

}
