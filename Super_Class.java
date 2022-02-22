import java.util.Scanner;

public class Super_Class {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase().trim().concat(" ");
		char ch = sentence.charAt(sentence.length() - 2);
		if (ch != '!' && ch != '?' && ch != '.') {
			System.out.println("Invalid sentence");
			System.exit(0);
		}
		String words[] = sentence.split(" ");
		String finalSentence = "";
		int length = words.length;
		for (int i = 0; i < length; i++) {
			ch = words[i].charAt(0);
			if (i != length - 1) {
				finalSentence += Character.toUpperCase(ch) + words[i].substring(1) + "_";
			} else
				finalSentence += Character.toUpperCase(ch) + words[i].substring(1);
		}
		System.out.println("Hello");
		System.out.println(finalSentence);
	}
}