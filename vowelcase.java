import java.util.Scanner;

class vowelcase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int count = 0;
		String solution = "";
		System.out.println("Consonants: ");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.print(ch + " ");
				++count;
			}
		}
		System.out.println("\nNumber of consonants: " + count);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				solution += ch;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				solution += ch;
				solution += (char) ((str.charAt(i + 1)) - 32);
				//i += 1;
			}
		}
		System.out.println(solution);
	}
}