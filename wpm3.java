// Typing test made by ya boi

import java.time.LocalTime;
import java.util.Scanner;

public class wpm3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Source of words asked in test
		String arr[] = {"about", "above", "add", "after", "again", "air", "all", "almost", "along", "also", "always", "America", "an", "and", "animal", "another", "answer", "any", "are", "around", "as", "ask", "at", "away", "back", "be", "because", "been", "before", "began", "begin", "being", "below", "between", "big", "book", "both", "boy", "but", "by", "call", "came", "can", "car", "carry", "change", "children", "city", "close", "come", "could", "country", "cut", "day", "did", "different"};
		System.out.println("about above add after again air all almost along also always America an and animal another answer any are around as ask at away back be because been before began begin being below between big book both boy but by call came can car carry change children city close come could country cut day did different");
		try {
			Thread.sleep(5000); // 5 second delay for user to warm up
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Start!");
		double start = LocalTime.now().toNanoOfDay();
		String input = sc.nextLine();
		double end = LocalTime.now().toNanoOfDay();
		sc.close();
		input += " ";
		// Converting user's input to an array
		String inputArr[] = new String[56];
		String word = "";
		int counter = 0;
		int wordsCorrect = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != ' ')
				word += ch;
			else {
				inputArr[counter] = word;
				counter += 1;
				word = "";
				if (inputArr[i].equalsIgnoreCase(arr[i]))
					wordsCorrect += 1;
			}
		}

		// Calculating result
		double accuracy = (wordsCorrect * 100) / 56;
		double time = (end - start) / 1000000000;
		double wpm = wordsCorrect / (time / 60.0);
		int wpm2 = (int) (Math.round(wpm));
		System.out.println("Accuracy: " + accuracy);
		System.out.println("WPM Speed: " + wpm2);

	}
}