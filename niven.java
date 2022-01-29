import java.util.Scanner;

public class niven {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = Sc.nextInt();
		int num2 = num;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		if (num2 % sum == 0)
			System.out.println("Number is a niven number");
		else
			System.out.println("Number is not a niven number");
	}
}