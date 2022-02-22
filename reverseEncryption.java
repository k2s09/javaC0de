// Program which takes a string of five sentences from user
// The characters of odd sentences are added with +2
// The words of the even sentences are reversed in order

import java.util.Scanner;

public class reverseEncryption {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String sentence = sc.nextLine();
		sentence = sentence.trim().toLowerCase().concat(" ");

		// Seperating the sentences into an array
		String str[] = new String[5];
		String words = "";
		int strCounter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch != '.')
				words += ch;
			else {
				str[strCounter] = words.trim();
				strCounter += 1;
				words = "";
			}
		}

		// Doing the loop which does the things asked in the question
		for (int i = 0; i < 5; i++) {
			// If statement for the odd sentences
			if ((i + 1) % 2 != 0) {
				String temp = "";
				for (int j = 0; j < str[i].length(); j++) {
					char ch = str[i].charAt(j);
					if (ch <= 'x')
						temp += (char) (ch + 2);
					if (ch == 'y')
						temp += 'a';
					if (ch == 'z')
						temp += 'b';
				}
			}

			// If statement for the even sentences
			if ((i + 1) % 2 == 0) {
				str[i] = str[i].concat(" ");

				// Checking number of words in the sentence
				int wordCounter = 0;
				for (int j = 0; j < str[i].length(); j++) {
					char wh = str[i].charAt(j);

					if (wh == ' ')
						wordCounter += 1;
				}

				// Putting the words into an array
				String wordArray[] = new String[wordCounter];
				words = "";
				strCounter = 0;
				for (int j = 0; j < str[i].length(); j++) {
					char wh = str[i].charAt(j);
					if (wh != ' ')
						words += wh;
					else {
						wordArray[strCounter] = words;
						strCounter += 1;
						words = "";
					}
				}

				// Reversing the order of words
				String reverse = "";
				for (int j = wordCounter - 1; j >= 0; j--) {
					reverse += wordArray[j] + " ";
				}
				str[i] = reverse;
			}
		}

		// Printing the final answer
		System.out.println();
		for (int x = 0; x < 5; x++) {
			System.out.println(str[x]);
		}
	}
}
