package exercisepgm_1;

public class ZigZagPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="hairoil";
		int trow=2;
		int row=1;
		char[][] arr= new char[50][50];
		int col=1;
        int down=0;
        int up=1;
        for(int i=0;i<k.length();i++)
        {
        	if(row>trow)
        	{
        		up=0;
        		down=1;
        		row=trow;
        	}
        	if(down==0 && row<=trow)
        	{
        		arr[row][col]=k.charAt(i);
        		row++;
        		
        	}
        	if(up==0 && row>=1)
        	{
        		row-=1;
        		col+=1;
        		if(row==1)
        		{
        			down=0;
            		up=1;
            		--i;
        		
        		}
        		else
        		{
        		arr[row][col]=k.charAt(i);
        	
        		}
        	}
        	
        }
        
        for(int i=1;i<=trow;i++)
        {
        	for(int j=1;j<arr[0].length;j++)
        	{
        		System.out.print(arr[i][j]);
        	}
        	System.out.println();
        }
	}

}
