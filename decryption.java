import java.util.Scanner;

public class decryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter encrypted sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Enter key");
		int key = sc.nextInt();
		sentence = sentence.trim().toLowerCase();
		String newSentence = "";
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			char replace = (char) (ch - key);
			if (replace >= 97 && replace <= 122)
				newSentence += replace;
			else if (replace > 122)
				newSentence += (char) (replace - 26);
			else
				newSentence += ch;
		}
		System.out.println("Final sentence: \n" + newSentence);

	}
}
