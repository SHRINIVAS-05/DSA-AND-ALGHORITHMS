package SINGLYLINKEDLIST;

import java.util.Scanner;

public class NthNodeFromEndofLinkedList {
	
	private ListNode head;
	private static class ListNode
	{
		int data;
		ListNode next;
		
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
			System.out.println("null");
		}
		
	   public ListNode NthNodeFromEndOfSinglyLinkedList(int n)
	   {
		   
		   if(head==null)
		   {
			   return null;
		   }
		   if(n<=0)
		   {
			   throw new IllegalArgumentException("Invalid value: n"+n);
		   }
		   
		   ListNode current=head;
		   ListNode mainPtr=head;
		   ListNode refPtr=head;
		   int count=1;
		   while(count<=n)
		   {
			   refPtr=refPtr.next;
			   count++;
		   }
		   while(refPtr!=null)
		   {
			   refPtr=refPtr.next;
			   mainPtr=mainPtr.next;
			   
		   }
		   
		return mainPtr; 
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthNodeFromEndofLinkedList sl= new NthNodeFromEndofLinkedList();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Length of SinglyLinkedList");
		int n=scan.nextInt();
		
		if(n>0)
		{
			System.out.println("Enter Elements");
			sl.head=new ListNode(scan.nextInt());
			ListNode current=sl.head;
			for(int i=1;i<n;i++)
			{
				current.next=new ListNode(scan.nextInt());
				current=current.next;
			}	
			 System.out.println("Given Linked list:");
			 sl.display(sl.head);
			 ListNode nth= sl.NthNodeFromEndOfSinglyLinkedList(2);
			 System.out.println(nth.data);
			 System.out.println("Enter the position from the end:");
	            int position = scan.nextInt();
	            ListNode nthNode = sl.NthNodeFromEndOfSinglyLinkedList(position);
	            if (nthNode != null) {
	                System.out.println("The " + position + "th node from the end is: " + nthNode.data);
	            } 
			 
	        
		}
		else
		{
			System.out.println("null");
		}

	}

}
