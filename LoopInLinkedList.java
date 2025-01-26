package exercisepgm_1;


//check the loop is exists in a linkedlist
class loopnode
{
	int data;
	loopnode next;
	loopnode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class LoopInLinkedList {
	
	public static int findloop(loopnode head)
	{
		loopnode fast=head;
		loopnode slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
			{
				return 1;
		
			}
			
		}
		return 0;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopnode head=new loopnode(20);
		head.next=new loopnode(30);
		head.next.next=new loopnode(40);
		head.next.next.next=new loopnode(50);
		head.next.next.next.next=head.next.next.next;
		int res=findloop(head);
		if(res==1)
			System.out.print("loop");
		else
			System.out.print("no loop");

	}

}
