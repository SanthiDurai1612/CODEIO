package exercisepgm_1;

public class RemovedupReverWithoutUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="geeks for geeks";
		String k1=k.replace(" ", "");
		StringBuilder res=new StringBuilder();
		for(int i=0;i<k1.length();i++)
		{
			char current=k1.charAt(i);
			if(res.indexOf(String.valueOf(current)) == -1)
			{
				res.append(current);
			}
		}
		
		String result=res.reverse().toString();
		System.out.println(result);
	}

}
