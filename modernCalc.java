import java.util.Scanner;

public class modernCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sum(a, b);
		System.out.println(c + " is the sum");
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}

