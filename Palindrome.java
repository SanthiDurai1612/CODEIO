package exercisepgm_1;

//121 = 121 it is palindrome
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121;
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev ==temp)
		{
			System.out.print("It is Palindrome");
		}
		else
		{
			System.out.print("It is not Palindome");
		}

	}

}
