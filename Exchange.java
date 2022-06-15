import java.util.Scanner;

public class Exchange {
	String sent;
	String red;
	int size;

	Exchange() {
		sent = "";
		red = "";
		size = 0;
	}

	public static void main(String[] args) {
		Exchange obj = new Exchange();
		obj.readSentence();
		obj.exFirstLast();
		obj.display();
	}

	void readSentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		sent = sc.nextLine();
		sent = sent.substring(0, sent.length() - 1);
		sc.close();
	}

	void exFirstLast() {
		// Exchange first and last char
		sent = sent.trim().concat(" ");
		String word = "";
		Scanner in = new Scanner(sent);
		while (in.hasNext()) {
			word = in.next();
			if (word.length() > 1) {
				size = word.length();
				word = word.charAt(size - 1) + word.substring(1, size - 1) + word.charAt(0);
			}
			red += word + " ";
			word = "";
		}
		in.close();
	}

	void display() {
		System.out.println("Original sentence: " + sent.trim() + ".");
		System.out.println("Changed sentence: " + red.trim() + ".");
	}
}
