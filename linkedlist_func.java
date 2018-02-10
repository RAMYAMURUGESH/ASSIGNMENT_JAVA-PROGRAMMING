package student;
class node
{
	int data;
	node next;
	node(int a)
	{
		data=a;
		next=null;
	}
	void display(node temp)
	{
		while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
		
	}
}
public class linked_list {
	 
	public static void main(String args[])
	{
		node head,first,sec,temp;
		head=new node(10);
		first=new node(20);
		sec=new node(30);
		head.next=first;
		first.next=sec;
		sec.next=null;
		temp=head;
		first.display(temp);
	}

}
