package DOUBLYLINKEDLIST;

import java.util.NoSuchElementException;

public class IMPLIMENTATIONOFDOUBLYLINKEDLIST {
	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public IMPLIMENTATIONOFDOUBLYLINKEDLIST() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	// Inserting Elements to last of list
	public void insertLast(int value) {
		ListNode newnode = new ListNode(value);
		if (isEmpty()) {
			head = newnode;
		} else {
			tail.next = newnode;
		}
		newnode.previous = tail;
		tail = newnode;
		length++;
	}

	public void insertfirst(int value) {
		ListNode newnode = new ListNode(value);
		if (isEmpty()) {
			tail = newnode;
		} else {
			head.previous = newnode;
		}
		newnode.next = head;
		head = newnode;
		length++;
	}

	//delete first element
	public ListNode deletefirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	
	//delete last element
	public ListNode deletelast()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		ListNode temp=tail;
		if(tail==head)
		{
			head=null;
		}
		else
		{
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp;
	}

	// forword display
	public void forworddisplay() {
		ListNode temp = head;
		if (head == null) {
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Backword print
	public void backworddisplay() {
		ListNode temp = tail;
		if (tail == null) {
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		IMPLIMENTATIONOFDOUBLYLINKEDLIST ddl = new IMPLIMENTATIONOFDOUBLYLINKEDLIST();
		ddl.insertLast(10);
		ddl.insertLast(20);
		ddl.insertfirst(30);
		ddl.insertfirst(40);
		ddl.insertLast(90);
		ddl.forworddisplay();
		//ddl.backworddisplay();
		ddl.deletefirst();
		ddl.deletelast();
		ddl.forworddisplay();
	}

}
