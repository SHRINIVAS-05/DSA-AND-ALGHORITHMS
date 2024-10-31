package SINGLYLINKEDLIST;

import java.util.Scanner;

public class InsertNodeInSortedLinkedList 
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
	    
	    //add Node to the Sorted Linked List
	    public void addNodeToSortedLinkedList(int value)
	    {
	    	if(head==null)
	    	{
	    		return;
	    	}
	    	ListNode NewNode=new ListNode(value);
	    	ListNode current=head;
	    	ListNode previous=null;
	    	
	    	while(current!=null && current.data< NewNode.data )  // 10 20 30 40 
	    	{
	    		previous=current;
	    		current=current.next;
	    	}
	    	NewNode.next=current;
	    	previous.next=NewNode;
	    	
	    }
	    
	    
	    public static void main(String[] args) {
	    	InsertNodeInSortedLinkedList list = new InsertNodeInSortedLinkedList();
	        
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
	            System.out.println("Enter a node elements");
	            int m=scan.nextInt();
	            list.addNodeToSortedLinkedList(m);
	            System.out.println("\nAfter adding a Node to linked list:");
	            list.display(list.head);
	        } else {
	            System.out.println("The linked list is empty.");
	        }
	        scan.close();
	    }

	

}
