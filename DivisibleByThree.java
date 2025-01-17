package exercisepgm_1;

public class DivisibleByThree {
	
	public static void divisible(int[] arr)
	{
		
		int totrem=0;
		for(int i:arr)
		{
			 totrem += i%3;
			
		}
		
		if(totrem%3 == 0)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {40,50,60};
       divisible(arr);
	}

}
