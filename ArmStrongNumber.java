import java.util.Scanner;

class ArmStrongNumber {
	int n, sum, k;
	double f;

	public static void main(String args[]) {
		ArmStrongNumber A = new ArmStrongNumber();
		A.isArmstrong();
	}

	void isArmstrong() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number to be checked for being an armstrong number");
		n = Sc.nextInt();
		k = n;
		Sc.close();
		while (k > 0) {
			f = (k % 10);
			f = Math.pow(f, 3);
			sum += f;
			k /= 10;
		}
		if (sum == n)
			System.out.println("The number you entered is an armstrong number");
		if (sum != n)
			System.out.println("The number you entered is not an armstrong number");
	}
}
