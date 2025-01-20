package exercisepgm_1;

//if a=1,b=2,c=3 the sum of last three will be the next number , in that way find out the nth number
public class GeekOnaciNumber {
	
	public static void findnum(int a,int b,int c,int n)
	
	{
		int count=3; //already given 3 numbers
		int sum=0;
		while(count<n)
		{
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
			count++;
		}
		System.out.print("N the Number:"+ sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c=3;
		int n=4;
		findnum(a,b,c,n);
		

	}

}
