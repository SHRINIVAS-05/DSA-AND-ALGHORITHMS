package STACK;

import java.util.EmptyStackException;

public class Stack {

	private ListNode top;
	private int length;

	private class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Stack() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void push(int data) {
		ListNode temp= new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop(){
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int temp=top.data;
		top=top.next;
		length--;
		return temp;
	}
	
	public int peek()
	{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void display()
	{
		for(int i=length;i>=1;i--)
		{
			System.out.println(top.data);
			top=top.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());

		s.display();


	}

}
