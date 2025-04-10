package exercisepgm_1;

public class CrossPattern {

	public static void printpattern(String str)
	{
		if(str.length()%2==0)
		{
			System.out.println("String is even");
			return;
		}
		int first=0;
		int last=str.length()-1;
		int temp=str.length()-1;
		char[][] arr=new char[str.length()][str.length()];
		arr[0][0]='a';
		int flg=1;
		for(int i=0;i<arr.length;i++)
		{
			flg=1;
			for(int j=0;j<arr.length;j++)
			{
				   if(i==j)
				   {
					   arr[i][j]=str.charAt(first);
					   first++;
				   }
				   if( temp>=0 && flg==1)
				   {
					  if(i==(str.length()-1)/2)
					  {
						  last--;
					  }
					  else
					  {
					   arr[i][temp]=str.charAt(last);
					   last--;
					   temp--;
					   
					  }
					  flg=0;
				   }
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				   System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="krithikaa";
		printpattern(str);

	}

}
