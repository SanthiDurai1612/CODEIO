package exercisepgm_1;

import java.util.Stack;

public class MathematicalExpression {

    public static boolean checkexpression(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='(')
        	{
        		s.push('(');
        	}
        	else if(str.charAt(i)==')' )
        	{
        		if(!s.empty())
        		{
        		s.pop();
        		}
        		else
        		{
        			s.push(')');
        		}
        	}
        	
        	else if("+-*%/".indexOf(str.charAt(i))!=-1)
        	{
        		if(i==0 || !Character.isLetterOrDigit(str.charAt(i-1)) &&
        				str.charAt(i-1)!=')' && str.charAt(i-1)!='(')
        		{
        			return false;
        		}
        		if(i==str.length()-1 || !Character.isLetterOrDigit(str.charAt(i+1))  &&
        				str.charAt(i+1)!=')' && str.charAt(i+1)!='(')
        		{
        			return false;
        		}
        	}
        	
        }
        if(!s.empty())
        {
        	return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = "ab)*";  // Test cases here
        boolean res = checkexpression(str);
        System.out.println(res ? "It is valid" : "It is invalid");
    }
}
