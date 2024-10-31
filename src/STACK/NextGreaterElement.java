package STACK;

import java.util.Stack;

public class NextGreaterElement {

	public static int[] NextGreaterElement(int[] arr) {
		int result[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!stack.isEmpty()) {
				while (!stack.isEmpty() && stack.peek() <= arr[i]) {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 7, 3, 4, 8, 1 };
		for (int data : arr) {
			System.out.print(data + "  ");
		}
		System.out.println("       ");
		int[] str = NextGreaterElement(arr);
		for (int data : str) {
			System.out.print(data + " ");
		}
	}

}
