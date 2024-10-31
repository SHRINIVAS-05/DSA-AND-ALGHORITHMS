package SINGLYLINKEDLIST;

import java.util.Scanner;

public class RemovegivenNode 
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
	    
	    //Remove a user given Node from LinkedList
	    public ListNode removeNode(int SearchKey)
	    {
	    	if(head==null)
	    	{
	    		return null;
	    	}
	    	ListNode current=head;
	    	ListNode previous=null;
	    	
	    	while(current!=null &&current.data!=SearchKey)  // 10 20 30 40 50  ==> 40
	    	{
	    		previous=current;
	    		current=current.next;
	    	}
	    	previous.next=current.next;
			return head;
	    }
	    
	    public static void main(String[] args) {
	    	RemovegivenNode list = new RemovegivenNode();
	        
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
	            System.out.println("Enter a node to delete");
	            int m=scan.nextInt();
	            list.head=list.removeNode(m);
	            System.out.println("fter removing node from  linked list:");
	            list.display(list.head);
	        } else {
	            System.out.println("The linked list is empty.");
	        }
	        scan.close();
	    }
}
