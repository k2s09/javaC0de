// Remove all extra spaces from the sentence

import java.util.Scanner;

public class dynamicTrim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();
		System.out.println(sentence.trim().replaceAll(" +", " "));
	}
}
