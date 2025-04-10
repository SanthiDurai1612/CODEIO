package exercisepgm_1;

import java.util.Stack;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=512;
		Stack<Integer> s=new Stack<>();
		while(n>0)
			
		{
			s.add(n%2);
			n=n/2;
		}
		int cur=s.size();
		int ans=0;
		for(int i=0;i<s.size();i++)
		{
		ans+=s.get(i) * Math.pow(2, --cur);
		}
        System.out.print(ans);
	}

}
