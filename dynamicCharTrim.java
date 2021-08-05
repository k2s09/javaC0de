// Checks sentence termination and removes all double characters

import java.util.Scanner;

public class dynamicCharTrim {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		sentence = sentence.trim().toLowerCase().replaceAll(" +", " ");
		char lastChar = sentence.charAt(sentence.length() - 1);
		if (lastChar != '?' && lastChar != '!' && lastChar != '.') {
			System.out.println("Invalid Input!");
			System.exit(0);
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				String s1 = ch + "+", s2 = Character.toString(ch);
				sentence = sentence.replaceAll(s1, s2);
			}
			System.out.println(sentence);
		}
	}
}
