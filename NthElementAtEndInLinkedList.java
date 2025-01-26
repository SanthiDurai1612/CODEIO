package exercisepgm_1;
//find nth element from last in an linkedlist
//the node class is already exists in this package so i give the name cNode
class cNode
{
	int data;
	cNode next;
	cNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class NthElementAtEndInLinkedList {

	public static int nthelement(cNode head,int n)
	{
		int len=0;
		cNode temp=head;
		while(temp !=null)
		{
			len++;
			temp=temp.next;
		}
		 if(n>len)
		 {
			return -1;
		 }
		 cNode temp1=head;
		 for(int i=1;i<len-n+1;i++)
		 {
			 temp1=temp1.next;
			 
		 }
		 return temp1.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				cNode head=new cNode(10);
				head.next=new cNode(10);
				head.next.next=new cNode(10);
				head.next.next.next=new cNode(10);
				head.next.next.next.next=new cNode(20);
		int n=4;
		int data=nthelement(head,n);
		System.out.print(data);

	}

}
