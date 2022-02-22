import java.util.Scanner;

public class compositeNumber {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = Sc.nextInt();
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Factor found: " + i);
				flag += 1;
			}
		}
		if (flag != 0)
			System.out.println("Number is a composite number");
		else
			System.out.println("Number is not a composite number");
	}
}