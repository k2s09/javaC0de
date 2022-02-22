import java.util.Scanner;

public class sentencePalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		sc.close();
		boolean b = false;
		int counter = 0;
		if (sentence.endsWith("!") || sentence.endsWith("?") || sentence.endsWith(".")) {
			sentence = sentence.substring(0, sentence.length() - 1).trim();
			String words[] = sentence.split(" ");
			for (int i = 0; i < words.length; i++) {
				b = isPalindrome(words[i]);
				if (b == true) {
					System.out.println(words[i]);
					counter += 1;
				}
			}
			System.out.println("Total " + counter + " palindromes");
		} else {
			System.out.println("Invalid format! Sentence must end with \"!\", \"?\" or \".\"");
		}
	}

	public static boolean isPalindrome(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String str = sb.toString();
		if (str.equals(word))
			return true;
		else
			return false;
	}
}
