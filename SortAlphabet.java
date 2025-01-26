package exercisepgm_1;

public class SortAlphabet {

	public static void countsort(String s)
	{
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++)
		{
			int index=(int)(s.charAt(i)) - 97;
			arr[index]++;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				for(int j=0;j<arr[i];j++)
				{
					System.out.print((char)(i+97));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="edsabbce";
		countsort(s);

	}

}
