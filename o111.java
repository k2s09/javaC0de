import java.util.Scanner;

class o111 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations");
		int n = Sc.nextInt();
		double c = 0, a = 1, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c++;
			b = (Math.pow(10, c)) + a;
			a = b;
		}
	}
}