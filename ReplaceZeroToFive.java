package exercisepgm_1;


//replace all the zero in an integer by five

public class ReplaceZeroToFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		int factor=1;
		int res=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==0)
			{
				res += 5*factor;
			}
			else
			{
				res += rem*factor;
			}
			factor=factor*10;
			n=n/10;
		}
		System.out.print(res);

	}

}
