// The names of the teams participating in a competition should be displayed on a banner vertically, to accommodate as many teams as possible in a single banner.
// Design a program to accept the names of N teams, where 2 < N < 9 and display them in vertical order, side by side with a horizontal tab (i.e. eight spaces).

import java.util.Scanner;

public class Banner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of teams");
		int no = sc.nextInt();
		if (no >= 9 || no <= 2) {
			System.out.println("Invalid number of teams");
			System.exit(0);
		}
		System.out.println("Enter names of " + no + " teams");
		String[] teamNames = new String[no];
		for (int i = 0; i < teamNames.length; i++) {
			teamNames[i] = sc.next();
		}
		// Finding length of longest team name
		int length = teamNames[0].length();
		for (int i = 1; i < no; i++) {
			if (teamNames[i].length() > length)
				length = teamNames[i].length();
		}
		// Use that length as size of final array
		String[] arr = new String[length];
		for (int i = 0; i < length; i++) {
			char c1, c2, c3;
			if ((i + 1) > teamNames[0].length())
				c1 = ' ';
			else
				c1 = teamNames[0].charAt(i);
			arr[i] += c1 + "\t";
			if ((i + 1) > teamNames[1].length())
				c2 = ' ';
			else
				c2 = teamNames[1].charAt(i);
			arr[i] += c2 + "\t";
			if ((i + 1) > teamNames[2].length())
				c3 = ' ';
			else
				c3 = teamNames[2].charAt(i);
			arr[i] += c3;
		}
		// Printing the array
		System.out.println("Banner:\n");
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}
}