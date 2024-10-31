package SINGLYLINKEDLIST;

public class SinglyLinkedList1 
{ 
	//private static final String Current = null;
	private ListNode head;
	

	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	//Displaying Elements in LinkedList
	public void display()
	{
		ListNode Current=head;
		while(Current!=null)
		{
			System.out.print(Current.data+"--> ");
			Current=Current.next;
		}
		
		System.out.println("null");
	}
	
	//Displaying Length of LinkedList
	public int Lenght()
	{
		ListNode Current=head;
		if(head==null)
		{
			return 0;
		}
		
		int count=0;
		while(Current!=null)
		{
			count++;
			Current=Current.next;
		}
		return count;
		
	}
	
	//Inserting Elements FrontSide
	public void frontInsert(int value)
	{
		ListNode newNode= new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	
	//Inserting Elements RareSide
	public void RareInsert(int value)
	{
		ListNode newNode= new ListNode(value);
		if(head==null)
		{
			head=newNode;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
		
	}
	
	
	//Inserting Elements at any given position
	public void position(int data, int position)
	{
		ListNode newNode= new ListNode(data);
		if(position==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			ListNode Previous=head;
			int count=1;
			while(count<position-1)
			{
				Previous=Previous.next;
				count++;
			}
			
			ListNode current=Previous.next;
			newNode.next=current;
			Previous.next=newNode;
		}
	}
	
	
	// Deleting nodes at front
	public ListNode deletefront()
	{
		if(head==null)
		{
			return null;
		}
		
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
		
	}
	
	
	//Delete nodes at Rere end 
	
	public ListNode deleterare()
	{
		if(head==null|| head.next==null)
		{
			return head;
		}
		ListNode current=head;
		ListNode privious=null;
		while(current.next!=null)
		{
			privious=current;
			current=current.next;
		}
		privious.next=null;
		return current;
	}
	
	//Delete Element at Given any point
	
	public void deletePosition(int position)
	{
		if(position==1)
		{
			head=head.next;
		}
		else
		{
			ListNode privious=head;
			int count=1;
			while(count<position-1)
			{
				privious=privious.next;
				count++;
			}
			ListNode current=privious.next;
			privious.next=current.next;
		}
	}
	
	//Find a given element in SinglyLinked List
	
	public boolean SearchKey(int SearchKey)
	{
		if(head==null)
		{
			return false;
		}
		ListNode current=head;
		while(current!=null)
		{
			if(current.data==SearchKey)
			{
				return true;
			}
			current=current.next;
		}
		
		return false;
		
	}
	
	public ListNode reverseLinkedList()
	{
		ListNode current =head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	
	public static void main(String[] args) 
	{
		SinglyLinkedList1 sil= new SinglyLinkedList1();
//		sil.head= new ListNode(10);
//		ListNode second= new ListNode(1);
//		ListNode third= new ListNode(14);
//		ListNode fourth= new ListNode(05);
//		
//		// Now we will connect them together to form a chain.
//		sil.head.next=second;
//		second.next=third;
//		third.next=fourth;
		
		sil.frontInsert(10);
		sil.frontInsert(20);
		sil.frontInsert(05);
		sil.frontInsert(100);
		sil.RareInsert(54);
		sil.position(95, 3);
		System.out.println(sil.Lenght());
//		sil.deletefront();
//		sil.deleterare();
//		sil.display();
//		sil.deletePosition(3);
//		System.out.println(sil.SearchKey(05));
//
//
		sil.reverseLinkedList();
		sil.display();
		System.out.println(sil.Lenght());
		
	}

}
