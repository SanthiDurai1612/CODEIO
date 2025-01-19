package exercisepgm_1;

//we are going to find johns forgotten password the password contain x no of digit and y sum of digit , we have to write maximum num as a pwd
public class FindPassword {
	
	public static String pwd(int x,int y,StringBuilder s)
	{
		//if sum is greater than max possible digits sum (ex y=44,x=1) 
		if(x*9 < y)
		{
			return "-1";
		}
		
		while(y>0)
		{
			if(y>=9)
			{
				s.append("9");
				y=y-9;
			}
			else if(y<9)
			{
				s.append(String.valueOf(y));
				break;
			}
		}
		
	
		for(int i=s.length();i<x;i++)
		{
			s.append("0");
		}
	
		
		return s.toString();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=18;
		StringBuilder s=new StringBuilder();
		String res=pwd(x,y,s);
		System.out.print(res);

	}

}
