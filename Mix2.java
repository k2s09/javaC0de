// Mixes two words char by char

import java.util.Scanner;

public class Mix2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words: ");
		String w1 = sc.next().toUpperCase();
		String w2 = sc.next().toUpperCase();
		String ans = "";
		int l1 = w1.length();
		int l2 = w2.length();
		int l3 = l1 + l2;
		for (int i = 0; i < l3; i++) {
			if (i < l1)
				ans += w1.charAt(i);
			if (i < l2)
				ans += w2.charAt(i);
			if (i >= l1) {
				ans += w2.substring(i + 1);
				break;
			}
			if (i >= l2) {
				ans += w1.substring(i + 1);
				break;
			}
		}
		System.out.println(ans);
	}
}