package STACK;

import java.util.Scanner;

public class StackByArray {

	private int stack[];
	private int top = -1;
	private int size;

	public StackByArray(int n) {
		stack = new int[n];
		size = stack.length;
	}

	public void push() {
		if (top == size) {
			System.out.println("push is not possible, stack is full");
		} else {
			System.out.println("Enter element");
			Scanner scan = new Scanner(System.in);
			int ele = scan.nextInt();
			++top;
			stack[top] = ele;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("pop is not posssible, stack is empty");
		} else {
			--top;
			System.out.println("element is deleted");

		}
	}
	
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enetr Array length");
		int n=scan.nextInt();
		StackByArray s= new StackByArray(n);
		
		while(true)
		{
			System.out.println("1 push");
			System.out.println("2 pop");
			System.out.println("3 display");
			System.out.println("4 exit");
			System.out.println("Enter any of your choice");
			int nd=scan.nextInt();
			switch(nd)
			{
			case 1:s.push();
			break;
			
			case 2:s.pop();
			break;
			
			case 3:s.display();
            break;

			 default:
			 break;
			}

		}
		

	}
}
