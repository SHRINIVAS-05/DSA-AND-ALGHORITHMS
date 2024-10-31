package SINGLYLINKEDLIST;

import java.util.Scanner;


public class RemoveDuplicateFromSortedLinkedList 
{
	  private ListNode head;
	    
	    private static class ListNode {
	        private int data;
	        private ListNode next;
	        
	        public ListNode(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    
	    public void display(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " --> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    
	   //Delete duplicate Element in a sorted LinkedList
	    	
	    public ListNode removeduplicat(ListNode head)
	    {
	    	ListNode current=head;
	    	if(head==null)
	    	{
	    		return null;
	    	}
	    	while(current!=null && current.next!=null) //10 20 30 30 40
	    	{
	    		if(current.data==current.next.data)
	    		{
	    			current.next=current.next.next;
	    		}
	    		else
	    		{
	    			current=current.next;
	    		}
	    		
	    	}
			return head;
	    }
	    
	    public static void main(String[] args) {
	    	RemoveDuplicateFromSortedLinkedList list = new RemoveDuplicateFromSortedLinkedList();
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the linked list:");
	        int n = scan.nextInt();
	        
	        if (n > 0) {
	            System.out.println("Enter elements:");
	            list.head = new ListNode(scan.nextInt());
	            ListNode current = list.head;
	            for (int i = 1; i < n; i++) {
	                current.next = new ListNode(scan.nextInt());
	                current = current.next;
	            }
	            System.out.println("Given Linked list:");
	            list.display(list.head);
	            
	            list.head=list.removeduplicat(list.head);
	            System.out.println("\nSorted linked list:");
	            list.display(list.head);
	        } else {
	            System.out.println("The linked list is empty.");
	        }
	        scan.close();
	    }

}
