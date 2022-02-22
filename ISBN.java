import java.util.Scanner;

public class ISBN {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 10 digit ISBN number");
		String isbn = Sc.next();
		if (isbn.length() != 10)
			System.out.println("Invalid ISBN I.D.");
		else {
			int sum = 0;
			int counter = 1;
			char ch;
			for (int i = 0; i < isbn.length(); i++) {
				ch = isbn.charAt(i);
				sum += (((int) ch) * counter);
				counter += 1;
			}
			if (sum % 11 != 0)
				System.out.println("Invalid ISBN number");
			else
				System.out.println("Valid ISBN number");
		}
	}
}
