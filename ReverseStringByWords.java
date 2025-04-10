package exercisepgm_1;

public class ReverseStringByWords {

	public static String findspace(String str,int i,int end)
	{
		if(i==0)
		{
			int start=0;
			return str.substring(start, end+1);
		}
		if(str.charAt(i)==' ')
		{
			int start=i+1;
			return str.substring(start, end+1)+" "+findspace(str,i-1,i-1);
			
		}
		
			return findspace(str,i-1,end);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="hii this is santhi";
      int i=str.length()-1;
      int end=i;
      String res=findspace(str,i,end);
      System.out.print(res);
	}

}
