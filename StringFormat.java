package exercisepgm_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFormat {

	
	public static boolean searchright(char[][] arr,int i,int j,int k,String find,Map<Integer, Integer> end)
	{
		if(j==5)
		{
			if(k==find.length())
			{
			return true;
			}
			else
			{
				return false;
			}
		}
		if(k==find.length())
		{
			end.put(i,j-1);
			return true;
		}
			if(find.charAt(k)==arr[i][j])
			{
				if(searchright(arr,i,j+1,k+1,find,end))
				{
					
					return true;
				}
				else
				{
					return false;
				}
			}
			return false;
		
	}
	
	public static boolean searchdown(char[][] arr,int i,int j,int k,String find,Map<Integer, Integer> end)
	{
		if(i==5 )
		{
			if(k==find.length())
			{
			return true;
			}
			else
			{
				return false;
			}
		}
		if(k==find.length())
		{
			end.put(i-1,j);
			return true;
		}
			if(find.charAt(k)==arr[i][j])
			{
				if(searchdown(arr,i+1,j,k+1,find,end))
				{
					
					
					return true;
				}
				else
				{
					return false;
				}
			}
			
				
			return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="welcometozohocorporation";
	Map<Integer,Integer> start=new HashMap<>();
	Map<Integer,Integer> end=new HashMap<>();
	
	char[][] arr=new char[5][5];
	int k=0;
	String find="too";
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(k<s.length())
			{
			arr[i][j]=s.charAt(k);
			k++;
			}
		}
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(arr[i][j]==find.charAt(0))
			{
				boolean res=searchright(arr,i,j+1,1,find,end);
				if(res==true)
				{
					start.put(i,j);
				}
				boolean res1=searchdown(arr,i+1,j,1,find,end);
			  if(res1==true)
			  {
				  start.put(i,j);
			  }
				
			}
		}
	
	}
	
	System.out.print(start);
	System.out.print(end);

	}

}
