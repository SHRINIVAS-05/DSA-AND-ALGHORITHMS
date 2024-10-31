package STACK;

import java.util.Stack;

public class ValidParenthese {

	public static boolean isValidParentheses(String str) {
		char[] chars = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : chars) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek();
					if (c == '}' && top == '{' || c == ']' && top == '[' || c == ')' && top == '(') {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		System.out.println(ValidParenthese.isValidParentheses(str));

	}

}
