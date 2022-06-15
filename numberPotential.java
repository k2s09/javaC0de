// Potential of a word is the sum of the positions of all characters in the word.
// apple -> 1+16+16+12+5 = 50

import java.util.Scanner;

public class numberPotential {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words you want to enter: ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " words");
		String words[] = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			words[i] = words[i].toLowerCase();
		}
		// Storing potential of each word in a new array
		int potential[] = new int[n];
		int sum = 0;
		char ch;
		for (int i = 0; i < potential.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				ch = words[i].charAt(j);
				sum += (int) (ch - 96);
			}
			potential[i] = sum;
			sum = 0;
		}
		// Sorting words based on their potential using selection sort
		int min, temp;
		String temp2;
		for (int i = 0; i < potential.length; i++) {
			min = i;
			for (int j = (i + 1); j < potential.length; j++) {
				if (potential[j] < potential[min])
					min = j;
			}
			temp2 = words[i];
			words[i] = words[min];
			words[min] = temp2;

			temp = potential[i];
			potential[i] = potential[min];
			potential[min] = temp;
		}
		// Printing the words and their potential
		System.out.println("\nWord\tPotential");
		for (int i = 0; i < n; i++) {
			System.out.println(words[i] + "\t" + potential[i]);
		}
	}
}
