import java.util.Scanner;

class Factors {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int no = Sc.nextInt();
		int k = 0;
		System.out.println("The factors are: ");
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				System.out.println(i);
			}
		}
	}
}
