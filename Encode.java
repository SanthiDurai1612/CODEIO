package exercisepgm_1;

import java.util.HashMap;

//find two string's character is mapped correctly ex) add,egg here a -> e,d-> g mapped
public class Encode {
	
	public static boolean mapchar(String a,String b)
	{
		HashMap<Character,Character> map=new HashMap<>();
		for(int i=0;i<a.length();i++)
		{
			if(!map.containsKey(a.charAt(i)))
			{
				map.put(a.charAt(i), b.charAt(i));
			}
			else
			{
				char chk=map.get(a.charAt(i));
				if(chk==b.charAt(i))
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="abb";
		String b="fcc";
		boolean res=mapchar(a,b);
		boolean res1=mapchar(b,a);
		if(res==true && res1==false)
		    System.out.print(false);
		if(res==false && res1==true)
		    System.out.print(false);
		else
			System.out.print(res);
		

	}

}
