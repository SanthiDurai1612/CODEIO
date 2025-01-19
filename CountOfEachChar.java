package exercisepgm_1;

//print each char with their continous count 
public class CountOfEachChar {

	public static void count(String s)
	{
		int cnt=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(i-1))
			{
				System.out.print(s.charAt(i-1)+""+cnt);
				cnt=1;
			}
			else if(s.charAt(i)==s.charAt(i-1))
			{
				cnt=cnt+1;
			}
			
		}
		System.out.print(s.charAt(s.length()-1)+""+cnt);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbbccb";
		count(s);

	}

}
