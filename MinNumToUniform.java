package exercisepgm_1;

public class MinNumToUniform {
	
	public static int minsteptosimilar(String k)
	{
		int Rcount=0;
		int Gcount=0;
		for(int i=0;i<k.length();i++)
		{
			if(k.charAt(i)=='R')
			{
				Rcount++;
			}
			if(k.charAt(i)=='G')
			{
				Gcount++;
				
			}
		}
		
		int result=(Rcount>Gcount)?Gcount:Rcount;
		return result;
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="RRRGG";
		int res=minsteptosimilar(k);
		System.out.print(res);

	}

}
