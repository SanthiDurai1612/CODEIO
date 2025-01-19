package exercisepgm_1;

import java.util.HashMap;
import java.util.Map.Entry;


//find first non repeating character in string using hashmap
public class FirstNonRepeatingUsingHash {
	
	public static void nonrepeat(String k,HashMap<Character,Integer> m)
	{
		int count=1;
		for(int i=0;i<k.length();i++)
		{
			if(!m.containsKey(k.charAt(i)))
			{
				m.put(k.charAt(i), count);
				
			}
			else
			{
				count=m.get(k.charAt(i));
				count+=1;
				m.put(k.charAt(i), count);
				count=1;
				
			}
			
			
		}
		for(Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String k="kllkpi";
				HashMap<Character,Integer> m=new HashMap();
				nonrepeat(k,m);

	}

}
