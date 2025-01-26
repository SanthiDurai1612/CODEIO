package exercisepgm_1;

class midnode
{
	int data;
	midnode next;
	midnode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class MidInLinkedList {

	public static void mid(midnode head)
	{
		midnode fast=head;
		midnode slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			
		}
		System.out.print("Mid Element:"+" "+slow.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		midnode head=new midnode(20);
		head.next=new midnode(30);
		head.next.next=new midnode(40);
		head.next.next.next=new midnode(50);
		head.next.next.next=new midnode(60);
		head.next.next.next.next=new midnode(70);
		mid(head);

	}

}
