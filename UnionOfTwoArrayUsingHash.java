package exercisepgm_1;

import java.util.HashSet;

public class UnionOfTwoArrayUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet<Integer> set=new HashSet<Integer>();
         
         int[] arr1= {1,1};
         int[] arr2= {2,4,5};
         
         for(int i:arr1)
         {
        	 set.add(i);
        	 
         }
         for(int j:arr2)
         {
        	 set.add(j);
         }
         
         System.out.print(set);
	}

}
