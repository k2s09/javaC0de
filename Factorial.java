import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your number ");
		int n = Sc.nextInt();
		// A factorial is multiplying the natural numbers before it
		int sum = 1;
		;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}
}

            