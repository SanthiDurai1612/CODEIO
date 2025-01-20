package exercisepgm_1;

import java.util.HashMap;

//ex) cat,tac it is anagram 

public class Anagram {
	
	public static int anagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return -1;
		}
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			if(!map.containsKey(s1.charAt(i)))
			{
				map.put(s1.charAt(i), count);
			}
			else
			{
				int c=map.get(s1.charAt(i))+1;
				map.put(s1.charAt(i), c);
			}
		}
		
		for(int j=0;j<s2.length();j++)
		{
			if(map.containsKey(s2.charAt(j)) && map.get(s2.charAt(j))>0)
			{
				int c=map.get(s2.charAt(j))-1;
				map.put(s2.charAt(j), c);
			}
			else
			{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="cat";
		String s2="taa";
		int res=anagram(s1,s2);
		if(res==1)
		{
			System.out.print("It is Anagram");
		}
		else
		{
			System.out.print("It is not Anagram");
		}

	}

}
