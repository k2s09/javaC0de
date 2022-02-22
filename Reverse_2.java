import java.util.Scanner;

class Reverse_2 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your two digit number ");
		int a = Sc.nextInt();
		int rev = (((a % 10) * 10) + ((a - (a % 10)) / 10));
		System.out.println(" The reversed number is " + rev);


	}
}