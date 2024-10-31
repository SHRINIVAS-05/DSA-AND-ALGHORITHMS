package CIRCULARLINKEDLIST;

import java.util.NoSuchElementException;

public class CIRCULARLINKEDLIST {
	private ListNode last;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public CIRCULARLINKEDLIST() {
		this.last = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

//	public void createCirlcularLinkedList() {
//		ListNode first = new ListNode(10);
//		ListNode second = new ListNode(20);
//		ListNode third = new ListNode(30);
//		ListNode fourth = new ListNode(40);
//
//		first.next = second;
//		second.next = third;
//		third.next = fourth;
//		fourth.next = first;
//
//		last = fourth;
//	}

	public void insertlast(int data) {
		ListNode temp = new ListNode(data);
		if (last == null) {
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}

	public void insertfirst(int data) {
		ListNode temp = new ListNode(data);
		if (last == null) {
			last = temp;
			last.next = temp;
		} else {
			temp.next = last.next;
			last.next = temp;
		}
		length++;
	}

	public ListNode deletefirst() {
		ListNode temp = last.next;
		if (isEmpty()) {
			throw new NoSuchElementException("CircularSinglyLinked List is already is empty");
		}
		if (last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}
	

	public void display() {
		if (last == null) {
			return;
		}

		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.println(first.data);
	}

	public static void main(String[] args) {
		CIRCULARLINKEDLIST csl = new CIRCULARLINKEDLIST();
		// csl.createCirlcularLinkedList();
		csl.insertlast(10);
		csl.insertlast(20);
		csl.insertlast(30);
		csl.insertlast(40);
		csl.insertfirst(50);
		csl.insertfirst(60);

		System.out.println("Circular Linked List");
		csl.display();
		System.out.println("After deleting first element of the Circular Linked List");
		ListNode d = csl.deletefirst();
		System.out.println(d.data);
		ListNode d2 = csl.deletefirst();
		System.out.println(d2.data);
		ListNode d3 = csl.deletefirst();
		System.out.println(d3.data);
		ListNode d4 = csl.deletefirst();
		System.out.println(d4.data);


		csl.display();

	}

}
