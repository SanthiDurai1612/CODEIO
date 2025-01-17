package exercisepgm_1;

import java.util.HashMap;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="abcd";
		int flg=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<k.length();i++)
		{
			if(map.containsKey(k.charAt(i)))
			{
				System.out.print("First Repeating Character:"+ k.charAt(i));
				flg=1;
				break;
			}
			else
			{
				map.put(k.charAt(i),i);
			}
		}
		
		if(flg==0)
		{
			System.out.print("String is Unique");
		}
	
		

	}

}
