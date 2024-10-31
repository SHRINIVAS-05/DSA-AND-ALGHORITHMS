package SINGLYLINKEDLIST;


public class RemoveLoopInSinglyLinkedList {

	
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
		    
		    public void removeloop(ListNode slowPtr)
		    {
		    	ListNode temp=head;
		    	while(slowPtr.next!=temp.next)
		    	{
		    		temp=temp.next;
		    		slowPtr=slowPtr.next;
		    	}
		    	slowPtr.next=null;
		    	
		    }
		    
		   public void findloopinLinkedList()
		   {
			   ListNode slowPtr=head;
			   ListNode fastPtr=head;
			   while(fastPtr!=null && fastPtr.next!=null)
			   {
				   fastPtr=fastPtr.next.next;
				   slowPtr=slowPtr.next;
				   if(slowPtr==fastPtr)
				   {
					   removeloop(slowPtr);
					   return;
				   }
						   
			   }
			
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
		    	RemoveLoopInSinglyLinkedList list = new RemoveLoopInSinglyLinkedList();
		    	list.createLoop();
		        list.findloopinLinkedList();
		    	list.display(list.head);
		    	
		    	

		        
		      
		    }

}
