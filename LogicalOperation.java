package exercisepgm_1;

//each alphabets indicates one logical operations like &,^,|| do the operation between each integers and print final output
public class LogicalOperation {
	
	public static void logical(String k)
	{
		int ans=Integer.parseInt(String.valueOf(k.charAt(0)));
		for(int i=1;i<k.length();i++)
		{
			if(k.charAt(i)=='A')
			{
				ans = ans &  Integer.parseInt(String.valueOf(k.charAt(i+1)));
			}
			else if(k.charAt(i)=='B')
			{
				ans = ans |  Integer.parseInt(String.valueOf(k.charAt(i+1)));
			}
			else if(k.charAt(i)=='C')
			{
				ans = ans ^  Integer.parseInt(String.valueOf(k.charAt(i+1)));
			}
			
		}
	      System.out.print("Answer:"+ ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String k="1C0C1C1A0B1";
      logical(k);
      
	}

}
