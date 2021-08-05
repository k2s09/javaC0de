import java.time.LocalTime;
import java.util.Scanner;

class wpmtest {
	static String sentence = ("A quick brown Fox jumps over the lazy Dog Apples, Grapes and Bananas are my favourites ");

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Get ready to start in: ");
		wait(1000);
		System.out.println("3...");
		wait(1000);
		System.out.println("2...");
		wait(1000);
		System.out.println("1...");
		wait(1000);

		System.out.println(sentence);
		double start = LocalTime.now().toNanoOfDay();
		String input = sc.nextLine();
		double end = LocalTime.now().toNanoOfDay();
		sc.close();
		input += " ";
		double timeTaken = end - start;
		double seconds = timeTaken / 1000000000;


		int length1 = sentence.length();
		int length2 = input.length();

		int difference;
		if (length1 > length2) {
			difference = length1 - length2;
			for (int i = 0; i < difference; i++)
				input = input.concat(" ");
		}

		if (length2 > length1)
			input = input.substring(0, length1 + 1);

		String word1 = "", word2 = "";
		int wordCounter = 0, charCounter = 0;
		for (int i = 0; i < length1; i++) {
			char ch = sentence.charAt(i);
			char wh = input.charAt(i);

			if (ch != ' ')
				word1 += ch;
			if (wh != ' ')
				word2 += wh;

			if (ch == ' ' && wh == ' ') {
				if (word1.equals(word2)) {
					wordCounter += 1;
					charCounter += word2.length();
				}
				word1 = "";
				word2 = "";
			}
		}

		String sentence2 = sentence.replace(" ", "");
		int charCounterExcludingSpace = sentence2.length();

		double minutes = seconds / 60.0;
		minutes = Math.round(minutes * 100.0) / 100.0;
		double wordsPerMinute = wordCounter / minutes;
		double charPerMinute = charCounter / minutes;
		double accuracy = (charCounter * 100.0) / charCounterExcludingSpace;

		wordsPerMinute = Math.round(wordsPerMinute * 100.0) / 100.0;
		charPerMinute = Math.round(charPerMinute * 100.0) / 100.0;
		accuracy = Math.round(accuracy * 100.0) / 100.0;

		System.out.println("\nWords per minute speed: " + wordsPerMinute);
		System.out.println("Characters per minute speed: " + charPerMinute);
		System.out.println("Accuracy: " + accuracy + "%");

	}


	private static void wait(int inv) {
		try {
			Thread.sleep(inv);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}





