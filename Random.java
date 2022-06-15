import java.util.Scanner;

class Random {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("How many random numbers do you want?");
		int n = Sc.nextInt();
		double r;
		for (int i = 1; i <= n; i++) {
			r = Math.random();
			if (r <= 0.5) {
				r *= 10;
			}
			if (r > 0.5) {
				r *= 100;
			}
			System.out.println(r);
		}
	}
}