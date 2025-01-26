package exercisepgm_1;

public class SumOfInteger {

	public static void sum(String s)
	{
		int num=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)
			{
				num = (num*10) + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
			else
			{
				sum+=num;
				num=0;
			}
		}
		//for last number
		sum +=num;
		System.out.print(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1ab40b3c";
		sum(s);

	}

}
