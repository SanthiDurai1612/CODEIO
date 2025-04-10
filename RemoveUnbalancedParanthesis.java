package exercisepgm_1;

import java.util.Stack;

public class RemoveUnbalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="((abc)((de))";
		StringBuilder str=new StringBuilder(s);
		Stack<Integer> stk=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				stk.push(i);
			}
			else if(s.charAt(i)==')')
			{
				stk.pop();
			}
		}
		for(int i=0;i<stk.size();i++)
		{
			str.deleteCharAt(stk.get(i));
		}
		System.out.print(str.toString());

	}

}
