package exercisepgm_1;

public class PatternLookAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1";
		System.out.print(str);
		System.out.println();
		String temp="";
		int count=1;
		int flg=0;
		int n=0;
		for(int i=0;i<str.length();i++)
		{
			if(n==5)
			{
				break;
			}
			if(i==str.length()-1)
			{
				
				temp+=count + " ";
				temp+=str.charAt(i)+ " ";
				System.out.print(temp+" ");
				System.out.println();
				n++;
				temp=temp.replaceAll("\\s", "");
				str=temp;
				temp="";
				count=1;
				flg=0;
				i=0;
				
	         }
			if(i<str.length()-1 )
			{
				if((str.charAt(i)==str.charAt(i+1)))
				{
				
				count++;
				flg=1;
				}
				else
				{
				
					if(flg==1)
					{
					temp += count + " ";
					temp += str.charAt(i-1) + " ";
					count=1;
					
					}
					else
					{
					temp+=count+" ";
			
					temp+=str.charAt(i)+" ";
					count=1;
					}
					
				}
				
			}
			
		}
		

	}

}
