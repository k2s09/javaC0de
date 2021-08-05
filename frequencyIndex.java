import java.util.Scanner;

class frequencyIndex {
	public static void main(String args[]) {
		// Taking inputs
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String S = Sc.nextLine();
		System.out.print("Enter element: ");
		String element = Sc.next();
		char e = element.charAt(0);
		//Finding indexes and frequency of element
		S = S.trim();
		S = S.toLowerCase();
		int counter = 0;
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == e) {
				System.out.println("Index found at " + (i + 1));
				counter += 1;
			}
		}
		System.out.println("Frequency of " + e + " is " + counter);
	}
}
/**
 * Variable Data Table
 * Variable    Data type   Function
 * S           String      Used to store string entered
 * e           char        Used to store search element
 * counter     int         Used as a counter
 * ch          char        Used in calculation
 */