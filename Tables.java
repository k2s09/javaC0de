import java.util.Scanner;

class Tables {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter number ");
		int n = Sc.nextInt();
		int c = 1;
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + c + " = " + (n * c));
			c++;
		}
	}
}
