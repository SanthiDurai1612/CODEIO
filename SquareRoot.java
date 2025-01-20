package exercisepgm_1;

//have to find squareroot of n ex)n=25 squareroot=5
public class SquareRoot {
	
	public static double squareroot(double start,double end,double n)
	{
		double mid;
		double ans=0;
		while(start<end)
		{
			mid=(start+end) / 2;
			
			if((mid*mid) == n)
			{
				return mid;
			}
			else if((mid*mid)<n)
			{
				start=mid+1;
				ans=start;
			}
			else
			{
				end=mid-1;
		
			}
			
		
		}
		return ans;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=89;
		double start=1;
		double end=n;
		double res=squareroot(start,end,n);
		System.out.print(res);

	}

}
