package exercisepgm_1;

public class FirstNonRepeatingChar {
	
	public static void nonrepeat(String k)
	{
	
		
		
		for(int i=0;i<k.length();i++)
		{
			boolean flg=false;
			for(int j=0;j<k.length();j++)
			{
				if(k.charAt(i)==k.charAt(j) && i!=j)
				{
				      flg=true; 
				      break;
				}
				
			}
			if(flg==false)
			{
				System.out.print(k.charAt(i));
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="klmkiop";
		nonrepeat(k);

	}

}
