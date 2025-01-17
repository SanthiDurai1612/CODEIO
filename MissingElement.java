package exercisepgm_1;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int N=5;
		
		//sum of continuous natural numbers
		int sum=(N*(N+1))/2;
		int cur=0;
		int missing=-1;
		for(int i:arr)
		{
			cur+=i;
		}
		
        missing=sum-cur;
        System.out.println("Missing Element:"+missing);
	}

}
