import java.util.Scanner;

public class BuzzNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		long n = sc.nextInt();
		int count = 0;
		if (n % 7 == 0)
			System.out.println(n + " is a Buzz number");
		else if (n % 10 == 7)
			System.out.println(n + " is a Buzz number");
		else
			System.out.println(n + " is not a Buzz number");
	}
}

