package exercisepgm_1;

import java.util.HashMap;

public class removeDupAndSpaceThenReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder k=new StringBuilder("SANTHIII ");
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int i=k.length()-1;
		while(i>=0)
		{
			if(!map.containsKey(k.charAt(i)) && k.charAt(i)!=' ')
			{
				System.out.print(k.charAt(i));
				map.put(k.charAt(i), i);
			}
			i--;
		}
		
		
		

	}

}
