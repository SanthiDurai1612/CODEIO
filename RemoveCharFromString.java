package exercisepgm_1;

import java.util.Arrays;

//remove the characters from string1 which is not present in string2

public class RemoveCharFromString {
	
	public static void remove(String str1,String str2)
	{
		int n=str1.length();
		int m=str2.length();
		StringBuilder s=new StringBuilder();
		int[] arr=new int[26];
		for(int i=0;i<m;i++)
		{
		    int index=((int)(str2.charAt(i)))-97;
		    arr[index]=1;
		    
		}
		
		for(int j=0;j<n;j++)
		{
			int index=((int)(str1.charAt(j)))-97;
			if(arr[index] == 0)
			{
				s.append(str1.charAt(j));
				
			}
		}
		
		System.out.print(s.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="computer";
		String str2="cat";
		remove(str1,str2);
		

	}

}
