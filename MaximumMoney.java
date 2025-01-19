package exercisepgm_1;

import java.util.Scanner;

//the thief theft in alternative houses if 6 he can theft 3 house,if 7 he can theft 4 house find the max money

public class MaximumMoney {

	public static void maxmoney(int n,int m)
	{
		int maxmoney=0;
		if((n%2)==0)
		{
			maxmoney=(n/2)*m;
			
		}
		else
		{
			maxmoney=((n/2)+1)*m;
		}
		
		System.out.println("Maximum Money:"+maxmoney);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER TOTAL HOUSES:");
		int nofhouse=in.nextInt();
		System.out.println("ENTER MONEY OF EACH HOUSE:");
		int money=in.nextInt();
		
		maxmoney(nofhouse,money);
		

	}

}
