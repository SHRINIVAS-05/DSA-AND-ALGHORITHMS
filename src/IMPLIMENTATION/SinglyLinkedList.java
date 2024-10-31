package IMPLIMENTATION;

public class SinglyLinkedList {

	private ListNode head;
	private int length;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public SinglyLinkedList() {
		this.head = null;
		this.length=1;
	}
	public int length()
	{
		return length;
	}

	// Inserting Element at end of Singly LinkedList
	public void InsertEnd(int data) {
		ListNode NewNode = new ListNode(data);
		if (head == null) {
			head = NewNode;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = NewNode;
		length++;
	}

	// Inserting element at first of the SinglyLinkedList
	public void InsertFirst(int data) {
		ListNode NewNode = new ListNode(data);
		NewNode.next = head;
		head = NewNode;
		length++;
	}

	// Inserting Element at Given any position of SinglyLinkedList
	public void InsertatAtPosition(int data, int position) {
		ListNode NewNode = new ListNode(data);
		if (position == 1) {
			NewNode.next = head;
			head = NewNode;
		}
		ListNode previous = head;
		int count=1;
		while(count<position-1)
		{
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		NewNode.next=current;
		previous.next=NewNode;
		length++;
	}
	
	// Delete End element in Singly Linked List
	public ListNode deleteEnd() {
		if(head==null||head.next==null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		length--;
		return current;
		
	}
	
	//Delete First Element in Singly LinkedList
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode current=head;
		head=head.next;
		current.next=null;
		length--;
		return current;
	}
	
	public ListNode deletePosition(int position)      //50 --> 40 --> 60 --> 10 --> 20 --> 30 --> 70 --> null
	{
		ListNode current=head;
		if(position==1) {
			head=head.next;
		}
		else {
		int count=0;
		
		ListNode previous=null;
		while(count<position-1)
		{
			previous=current;
			current=current.next;
			count++;
		}
		previous.next=current.next;
		length--;
		}
		return current;
	}

	
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList list = new SinglyLinkedList();

		/*
		 * Inserting elements by hard code list.head= new ListNode(10); ListNode second=
		 * new ListNode(20); ListNode third= new ListNode(30); list.head.next=second;
		 * second.next=third; list.display();
		 */

		list.InsertEnd(10);
		list.InsertEnd(20);
		list.InsertEnd(30);
		list.InsertFirst(40);
		list.InsertFirst(50);
		list.InsertatAtPosition(60, 3);
		list.InsertatAtPosition(70, 7);
//		System.out.println("before delete");
//		list.display();
//		ListNode deletedElement = list.deleteEnd();
//		System.out.println("after delete");
//		list.display();
//		System.out.println("Deleted Element is --> "+deletedElement.data);
//		
//		ListNode deletedElement2 = list.deleteEnd();
//		System.out.println("after delete");
//		list.display();
//		System.out.println("Deleted Element is --> "+deletedElement2.data);
//		
//		ListNode deleteFirst = list.deleteFirst();
//		System.out.println("after delete");
//		list.display();
//		System.out.println("Deleted Element is --> "+deleteFirst.data);
//		
//		ListNode deleteFirst2 = list.deleteFirst();
//		System.out.println("after delete");
//		list.display();
//		System.out.println("Deleted Element is --> "+deleteFirst2.data);
System.out.println(list.length);

		list.display();
		ListNode deletePosition = list.deletePosition(4);
		System.out.println("Delete element at given position");
		System.out.println("Deleted Element is deletePosition--> "+deletePosition.data);

		list.display();
		System.out.println(list.length);

	}

}
