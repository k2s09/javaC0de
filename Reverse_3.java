import java.util.Scanner;

class Reverse_3 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your three digit number ");
		int a = Sc.nextInt();
		int f = ((a - (a % 100)) / 100);
		int s = (((a % 100) - (a % 10)) / 10);
		int t = (a % 10);
		int rev = ((t * 100) + (s * 10) + f);
		System.out.println("The reversed number is " + rev);
	}
}