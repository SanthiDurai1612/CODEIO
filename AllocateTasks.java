package exercisepgm_1;

import java.util.Arrays;
import java.util.Vector;

//n total tasks c completed tasks , find incompleted tasks allocate to teena reena alternatively
public class AllocateTasks {
	
    public static void allocatetask(int n,int[] c,int[] arr)
    {
    	for(int i=0;i<c.length;i++)
    	{
    		
    		arr[c[i]-1]=1;
    	
    	}
    	
    	Vector<Integer> reena=new Vector<Integer>();
    	Vector<Integer> teena=new Vector<Integer>();
    	
    	int rf=1;
    	int tf=0;
    	
    	for(int j=0;j<arr.length;j++)
    		
    	{
    		if(arr[j]==0 && rf==1)
    		{
    			reena.add(j+1);
    			rf=0;
    			tf=1;
    		}
    		else if(arr[j]==0 && tf==1)
    		{
    			teena.add(j+1);
    			tf=0;
    			rf=1;
    		}
    	}
    	
    	
    	System.out.println("Task For Reena:"+ reena);
    	System.out.println("Task For Teena:"+ teena);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int[] c= {6,3,4,2};
		int[] arr=new int[n];
		allocatetask(n,c,arr);
		

	}

}
