package SINGLYLINKEDLIST;

import java.util.Scanner;

public class ReverseSinglyLinkedList {
	
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
			 System.out.print(current.data+" -->");
			 current=current.next;
		 }
		 System.out.println();
	 }
	 
	 public ListNode reverseLinkedList(ListNode head)
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
			head=previous;
			return head;
		}
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSinglyLinkedList list= new ReverseSinglyLinkedList();
		 
//	        list.head = new ListNode(1);
//	        list.head.next = new ListNode(2);
//	        list.head.next.next = new ListNode(3);
//	        list.head.next.next.next = new ListNode(4);
//
//	        System.out.println("Given Linked list:");
//	        list.display(list.head);
//	        list.head = list.reverseLinkedList(list.head);
//	        System.out.println("\nReversed linked list:");
//	        list.display(list.head);
		
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter the number of elements in the linked list:");
	      int n = scan.nextInt();
	      
	      if(n>0)
	      {
	    	  System.out.println("Enter elements");
	    	  list.head=new ListNode(scan.nextInt());
	    	  ListNode current=list.head;
	    	  for(int i=1;i<n;i++)
	    	  {
	    		  current.next= new ListNode(scan.nextInt());
	    		  current=current.next;
	    	  }
	    	    System.out.println("Given Linked list:");
	            list.display(list.head);
	            list.head = list.reverseLinkedList(list.head);
	            System.out.println("\nReversed linked list:");
	            list.display(list.head);
	    	  
	      }
	      else
	      {
	    	  System.out.println("The linked list is empty.");
	      }
	        scan.close();

	}

}
