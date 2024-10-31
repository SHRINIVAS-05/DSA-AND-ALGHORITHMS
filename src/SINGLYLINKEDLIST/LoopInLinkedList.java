package SINGLYLINKEDLIST;


public class LoopInLinkedList 
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
	    
	   public boolean findloopinLinkedList()
	   {
		   ListNode slowPtr=head;
		   ListNode fastPtr=head;
		   while(fastPtr!=null && fastPtr.next!=null)
		   {
			   fastPtr=fastPtr.next.next;
			   slowPtr=slowPtr.next;
			   if(slowPtr==fastPtr)
			   {
				   return true;
			   }
					   
		   }
		return false;
	   }
	   
	   public void createLoop()
	   {
		   ListNode first= new ListNode(1);
	    	ListNode second= new ListNode(2);
	    	ListNode third= new ListNode(3);
	    	ListNode fourth= new ListNode(4);
	    	ListNode fith= new ListNode(5);
	    	ListNode sith= new ListNode(6);
	    	
	    	head=first;
	    	first.next=second;
	    	second.next=third;
	    	third.next=fourth;
	    	fourth.next=fith;
	    	fith.next=sith;
	    	sith.next=third;
	    	
	   }
	    
	    public static void main(String[] args) {
	    	LoopInLinkedList list = new LoopInLinkedList();
	    	list.createLoop();
	    	boolean b = list.findloopinLinkedList();
	    	System.out.println(b);
	    	
	    	

	        
	      
	    }

}
