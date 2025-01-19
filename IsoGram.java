package exercisepgm_1;

public class IsoGram {
	
	public static boolean isogram(String k,StringBuilder k1)
	{
		boolean dup=false;
		for(int i=0;i<k.length();i++)
		{
			
			if(k1.indexOf(String.valueOf(k.charAt(i))) == -1 )
			{
				k1.append(k.charAt(i));
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k="unique";
		StringBuilder k1=new StringBuilder();
		boolean res=isogram(k,k1);
		System.out.print(res);
		

	}

}
