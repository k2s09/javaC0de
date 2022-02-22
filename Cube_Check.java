import java.util.Scanner;

class Cube_Check {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your number ");
		int n = Sc.nextInt();
		double f = (Math.pow(n, 1 / 3));
		double g = Math.pow(f, 3);
		if (g == n)

			System.out.println(" The number is a perfect cube ");
		if (g != n)
			System.out.println(" The number is not a perfect cube ");
	}
}