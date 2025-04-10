package exercisepgm_1;

public class ConvertNumIntoWords {
	
	public static String convert(int n)
	{
		int flg=0;
		if(n>999)
		{
			return "It is not Valid";
		}
		String[] unit= {"","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen",
				"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] ten= {"","","twenty","thirty","forty","fifty","sixty","seventy",
				"eighty","ninety"};
		
		String k="";
		if(n==0)
		{
			k +="zero";
		}
		if((n/100)>0)
		{
			k += unit[n/100]+" "+"hundred"+" ";
			n=n%100;
		}
		if(n>=20)
		{
			
			k +="and "+ ten[n/10]+" ";
			flg=1;
			n=n%10;
		}
		if(n>0)
		{
			if(flg==1)
			{
			k += unit[n];
			}
			else
			{
				k += "and "+ unit[n];
			}
		
		}
		return k;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=120;
		String res=convert(n);
		System.out.print(res);

	}

}
