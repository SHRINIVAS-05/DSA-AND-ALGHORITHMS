package STACK;

import java.util.Stack;

public class ReverseString {

	public static String ReverseStrinG(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			stack.push(c);
		}

		for (int i = 0; i <= str.length() - 1; i++) {
			chars[i] = stack.pop();
		}

		String str2= new String(chars);
		return str2;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		String rev = ReverseString.ReverseStrinG(str);
	    System.out.println(rev);

	}

}
