// Largest palindrome of the product of two three digit numbers
public class four {
	public static void main(String args[]) {
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				if (palindrome(i * j) == true) {
					System.out.println(i * j);
					System.exit(0);
				}
			}
		}
	}

	public static boolean palindrome(int num) {
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String reversed = sb.toString();
		if (str.equals(reversed))
			return true;
		else
			return false;
	}
}
