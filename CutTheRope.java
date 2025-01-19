package exercisepgm_1;

import java.util.Arrays;
import java.util.Vector;

// Cut every rope by their minimum length of rope; after cutting, store the count of remaining ropes whose lengths are not zero
public class CutTheRope {

    public static Vector<Integer> cutrope(int[] arr, int i) {
        Vector<Integer> v = new Vector<>();
        int min = arr[i];

        int count = 0;

        // Reduce the length of ropes by the current minimum
        for (int j = 1; j < arr.length; j++) {
 

                 if((arr[j]-min)>0)
                {
                	count=arr.length-j;
                	v.add(count);
                	min=arr[j];
                
                }
         
        }
        return v;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 3, 5};
        Arrays.sort(arr);
        int i = 0;

        Vector<Integer> res = cutrope(arr, i); 
        System.out.print(res); 
    }
}
