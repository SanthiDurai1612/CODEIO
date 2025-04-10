package exercisepgm_1;

public class BinaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		n=n-1;
		StringBuilder k=new StringBuilder();
		while(n>0)
		{
			k.append(n%2);
			n=n/2;
		}
	
		for(int i=0;i<k.length();i++)
		{
			if(k.charAt(i)=='0')
			{
				k.setCharAt(i, '3');
			}
			else
			{
				k.setCharAt(i, '4');
			}
			
		}
		System.out.print(k.reverse());
	}

}
