package exercisepgm_1;

class node
{
	int data;
	node next;
	node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class RemoveDupFromLinkedList {
	
	public static void removedup(node head)
	{
		node cur=head;
		while(cur!=null && cur.next!=null)
		{
			if(cur.data==cur.next.data)
			{
				cur.next=cur.next.next;
			}
			else
			{
				cur=cur.next;
			}
		}
		
		node curr=head;
		while(head!=null)
		{
			System.out.print(head.data+" "+ "->"+" ");
			head=head.next;
		}
		System.out.print("null");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head=new node(10);
		head.next=new node(10);
		head.next.next=new node(10);
		head.next.next.next=new node(10);
		head.next.next.next.next=new node(20);
		removedup(head);
		

	}

}
