package exercisepgm_1;

import java.util.Stack;
import java.util.Vector;

public class NumbertoParanthesis {
	
	public static Vector givenumber(String k,Stack<Integer> stk,Vector<Integer> vtor,int count)
	{
		for(int i=0;i<k.length();i++)
		{
		if(k.charAt(i)=='(')
		{
			stk.push(count);
			vtor.add(count);
			count++;
		}
		else if(k.charAt(i)==')')
		{
			int pop=stk.pop();
			vtor.add(pop);
		}
		}
		return vtor;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String k="((123))(789)";
       Stack<Integer> stk=new Stack<Integer>();
       Vector<Integer> vtor=new Vector<Integer>();
       int count=1;
       Vector res=givenumber(k,stk,vtor,count);
       System.out.print(res);
	}

}
