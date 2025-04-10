package exercisepgm_1;

public class FindOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=2;
		int end=15;
		for(int i=start+1;i<end;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
