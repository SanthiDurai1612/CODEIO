package exercisepgm_1;

//67452-/+- do the arithmetic operation between the integers

public class ArithmeticOperation {
	
	public static void arithmetic(String k)
	{
		int opindex=0;
		
		for(int i=0;i<k.length();i++)
		{
			
			if((int)k.charAt(i) <= 48)
			{
			
				opindex=i;
				break;
			}
			
		}
		int m=opindex;
		int ans=Integer.parseInt(String.valueOf(k.charAt(0)));
		for(int j=1;j<m;j++)
		{
			if(k.charAt(m)=='-')
			{
				ans -= Integer.parseInt(String.valueOf(k.charAt(j)));
			}
			
			else if(k.charAt(m)=='+')
			{
				ans += Integer.parseInt(String.valueOf(k.charAt(j)));
			}
			
			else if(k.charAt(m)=='/')
			{
				ans /= Integer.parseInt(String.valueOf(k.charAt(j)));
			}
			
			else if(k.charAt(m)=='*')
			{
				ans *= Integer.parseInt(String.valueOf(k.charAt(j)));
			}
			m++;
	     	if(m==k.length())
			{
				break;
			}
			
			
		}
		System.out.print("Final Answer:"+ ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String k="67452-/+*";
		arithmetic(k);

	}

}
