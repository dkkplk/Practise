package com.corejava;

import java.util.Stack;

public class ParamValidation {

	public static void main(String[] args) {

		String s = "])}";
		boolean b = isValid(s);
		System.out.println(b);

	}

	private static boolean isValid(String s) {

		Stack<Character> store = new Stack<Character>();
		boolean output = false;

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {

			case '{':
				store.push(s.charAt(i));
				break;
			case '(':
				store.push(s.charAt(i));
				break;
			case '[':
				store.push(s.charAt(i));
				break;
			case '}':
				if (store.pop() != '{')
					return output;
				break;
			case ')':
				if (store.pop() != '(')
					return output;
				break;
			case ']':
				if (store.pop() != '[')
					return output;
				break;
			}
		}

		if (store.isEmpty()) {
			output = true;
		}
		return output;
	}

}
