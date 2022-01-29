// Input a sentence and check if the sentence terminates with either '.','?','!' Check and print the palindrome words from sentence and count of it

import java.util.Scanner;

public class sentenceCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		char ch = sentence.charAt(sentence.length() - 1);
		int flag = 0;
		if (ch != '!' && ch != '.' && ch != '?') {
			System.out.println("Invalid output!");
			System.exit(flag);
		} else {
			sentence = sentence.substring(0, sentence.length() - 1);
			int count = 0;
			String word = "";
			sentence += " ";
			for (int i = 0; i < sentence.length(); i++) {
				ch = sentence.charAt(i);
				if (ch != ' ')
					word += ch;
				else {
					boolean b = isPalindrome(word);
					if (b) {
						count += 1;
						System.out.println(word);
					}
					word = "";
				}
			}
			System.out.println(count + " palindrome words found");
		}
	}

	public static boolean isPalindrome(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String str2 = sb.toString();
		if (str2.equals(word))
			return true;
		else
			return false;
	}
}
