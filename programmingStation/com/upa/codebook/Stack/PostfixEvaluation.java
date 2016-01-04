
package com.upa.codebook.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		String postfix = sc.nextLine();
		int answer = evaluatePostfix(postfix);
		System.out.println("answer = " + answer);
	}

	static int evaluatePostfix(String postfix) {
		// Create a stack
		Stack<Integer> stack = new Stack<>();
		String s;

		// Scan all characters one by one
		for (int i = 0; i < postfix.length(); i++) {
			s = postfix.substring(i, i + 1);
			char c = s.charAt(0);
			// If the scanned character is an operand or number,
			// push it to the stack.
			if (Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));
			} else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				switch (c) {
				case '+':
					stack.push(val2 + val1);
					break;
				case '-':
					stack.push(val2 - val1);
					break;
				case '*':
					stack.push(val2 * val1);
					break;
				case '/':
					stack.push(val2 / val1);
					break;
				}
			}
		}
		// Pop the stack to get final result
		return stack.pop();
	}

}
