import java.util.Scanner;

class PerfectNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int no = sc.nextInt(), k = 0, sum = 0;
		;
		System.out.println("The factors are: ");
		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(" ");
		if (sum == no) {
			System.out.println("It's a perfect number ");
		} else {
			System.out.println("It's not a perfect number ");
		}
	}
}
