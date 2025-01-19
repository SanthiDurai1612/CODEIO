package exercisepgm_1;

//during the first jump ball takes n distance to go over and come down ,next jumps it only go to n/2 distance find total distance
public class JumpingBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=20;
		int distance=n*2;
		while(n>0)
		{
			int newdis=n/2;
			//ball only go halfway from the previous jump
			distance += 2*newdis;
			n=newdis;
			
		}
		
		System.out.print("Total Distance Traveled:"+distance);
		
		

	}

}
