package exercisepgm_1;

//FIND GCD BETWEEN TWO INTEGERS USING EUCILEDEAN ALGORITHM
public class GCD {

	public static void find(int n,int m)
	{
		
		int rem=n%m;
		int quotient=n/m;
		
		while(rem>0)
		{
		n=m;
		m=rem;
		rem=n%m;
		}
		System.out.print("Greatest Common Divisor :"+ m);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int m=9;
		find(n,m);

	}

}
