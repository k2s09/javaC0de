import java.util.Scanner;

class Elevens {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		double n = 1;
		int pow = 1;
		double sum = 0;
		double base;
		System.out.println("Enter number of elevens you want");
		int c = Sc.nextInt();
		if (c == 69)
			System.out.println("Nice");
		for (int i = 1; i <= c; i++) {
			System.out.println(n);
			base = (Math.pow(10, pow));
			sum = base + n;
			System.out.println(sum);
			pow++;
			n = n + base;
		}
	}
}

            