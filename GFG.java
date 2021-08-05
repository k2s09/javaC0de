// Java program to find index of closing
// bracket for given opening bracket.

import java.util.Stack;

class GFG {
	static int test(String expression, int index) {
		int i;
		Stack<Integer> st = new Stack<>();
		for (i = index; i < expression.length(); i++) {
			if (expression.charAt(i) == '[') {
				st.push((int) expression.charAt(i));
			} else if (expression.charAt(i) == ']') {
				st.pop();
				if (st.empty()) {
					return i;
				}
			}
		}
		return 1;
	}

	// Driver Code
	public static void main(String[] args) {
		test("[ABC[23]][89]", 0); // should be 8
		test("[ABC[23]][89]", 4); // should be 7
		test("[ABC[23]][89]", 9); // should be 12
		test("[ABC[23]][89]", 1); // No matching bracket
	}
// this code is contributed by Rajput-Ji
}