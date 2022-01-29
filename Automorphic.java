import java.util.Scanner;

class Automorphic {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your number ");
		int n = Sc.nextInt();
		double b = Math.pow(n, 2);
		int c = 0;
		int n2 = n;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		double m = (b % (Math.pow(10, c)));
		if (m == n2) {
			System.out.println(" The number is Automorphic number ");
		} else if (m != n2) {
			System.out.println(" The number is not an Automorphic number ");
		}
	}
}
     