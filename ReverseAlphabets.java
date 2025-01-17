package exercisepgm_1;

public class ReverseAlphabets {
	public static String reversealpha(String str,int len)
	{
		
		StringBuilder k=new StringBuilder(str);
		int i=0;
		int j=len-1;
		while(i<j)
		{
			int ascii=(int)k.charAt(i);
			int ascij=(int)k.charAt(j);
			char f=k.charAt(i);
			char s=k.charAt(j);
			if(((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)) && 
					((ascij>=65 && ascij<=90) || (ascij>=97 && ascij<=122)) )
			{
				
				 k.setCharAt(i, s);
	                k.setCharAt(j, f);
				i++;
				j--;
			}
			
			else if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
			{
				j--;
			}
			
			else if((ascij>=65 && ascij<=90) || (ascij>=97 && ascij<=122))
			{
				i++;
			}
			
			
		}

		return k.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String k="abe^cd#@";
         int len=k.length();
        String res= reversealpha(k,len);
        System.out.print(res);
	}

}
