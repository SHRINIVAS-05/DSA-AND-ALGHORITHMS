package SINGLYLINKEDLIST;

public class MergeTwoSortedLinkedList {
	
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
	
	public void display(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
	}
	
	public  ListNode mergeTwoSortedLinkedList(ListNode a,ListNode b)
	{
		ListNode dummy=new ListNode(0);
		ListNode current=dummy;
		while(a!=null && b!=null)
		{
			if(a.data<=b.data)
			{
				current.next=a;
				a=a.next;
			}
			else
			{
				current.next=b;
				b=b.next;
			}
			current=current.next;
			
			if(a==null)
			{
				current.next=b;
			}
			else
			{
				current.next=a;
			}
			
		}
		return dummy.next;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MergeTwoSortedLinkedList list = new MergeTwoSortedLinkedList();
		 list.head= new ListNode(10);
		 ListNode second = new ListNode(30);
		 ListNode third = new ListNode(90);
		 
		 list.head.next=second;
		 second.next=third;
		 
		 MergeTwoSortedLinkedList list2 = new MergeTwoSortedLinkedList();
		 list2.head= new ListNode(05);
		 ListNode second2 = new ListNode(20);
		 ListNode third2 = new ListNode(70);
		 ListNode fourth2 = new ListNode(110);
		 
		 list2.head.next=second2;
		 second2.next=third2;
		 third2.next=fourth2;
		
		 System.out.println("lkejrl");
		 MergeTwoSortedLinkedList result= new MergeTwoSortedLinkedList();
		 result.head=result.mergeTwoSortedLinkedList(list.head, list2.head);
		 result.display(result.head);


		 


	}

}
