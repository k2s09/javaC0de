import java.util.Scanner;

class Division {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter first number");
		double a = Sc.nextInt();
		System.out.println(" Enter second number ");
		double b = Sc.nextInt();
		double c = a / b;
		System.out.println(" The answer is " + c);
	}
}