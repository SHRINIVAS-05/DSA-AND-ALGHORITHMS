package QUEUE;

import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Queue() {
		front = null;
		rear = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (front == null) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public ListNode dequeue() {
		ListNode result = front;
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already is empty");
		}
		front = front.next;
		if (front == null) {
			rear = null;
		}
		length--;
		return result;
	}

	public int first() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already is empty");
		}
		return front.data;
	}

	public int last() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already is empty");
		}
		return rear.data;
	}

	public void display() {
		if (isEmpty()) {
			return;
		}
		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Before any dequeue");
		queue.display();
		System.out.println("first -->" + queue.first());
		System.out.println("last -->" + queue.last());

		ListNode result = queue.dequeue();
		System.out.println("Dequeued element is --> " + result.data);
		System.out.println("After dequeue");
		queue.display();

	}

}
