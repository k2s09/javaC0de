import java.util.Scanner;

class NumberPhile {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter how many numbers of non-squares do you want : ");
		double a = Sc.nextDouble();
		System.out.println("Enter k in 4k + 1");
		double b = Sc.nextDouble();
		for (int i = 0; i < a; i++) {
			System.out.println((4 * a) + 1);
			++a;
		}
	}
}
