package exercisepgm_1;

import java.util.Arrays;

public class BurstBalloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= { {10,16},{2,8},{1,6},{7,9}};
		Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
		
        int end=arr[0][1];
        int arrow=1;
        for(int i=1;i<arr.length;i++)
        {
        	int start=arr[i][0];
        	if(start<=end)
        	{
        		continue;
        	}
        	else
        	{
        		end=arr[i][1];
        		arrow++;
        	}
        }
        System.out.print(arrow);
	}

}
