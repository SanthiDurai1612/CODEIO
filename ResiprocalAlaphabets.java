package exercisepgm_1;

public class ResiprocalAlaphabets {
	
	public static void resiprocal(String k,StringBuilder k1)
	{
	
		
		for(int i=0;i<k.length();i++)
		{
			int ascii=(int)(k.charAt(i));
			if(ascii >=65 && ascii <=90)
			{
				int n1=90-ascii;
				int n2=65+n1;
				k1.append((char)n2);
				
			}
			
			else if(ascii >=97 && ascii <=122)
			{
				int n3=122-ascii;
				int n4=97+n3;
				k1.append((char)n4);
				
			}
			else
			{
				k1.append(k.charAt(i));
			}
		}
		
		System.out.print(k1.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String k="xy Z";
         StringBuilder k1=new StringBuilder();
         resiprocal(k,k1);
	}

}
