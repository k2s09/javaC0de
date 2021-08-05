import java.util.Scanner;

class Range_Primes {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter higher number of range");
		int up = Sc.nextInt();
		System.out.println("Enter lower number of range");
		int low = Sc.nextInt();
		int c = 0;
		System.out.println(" ");
		for (int i = (low + 1); i < up; i++) {
			System.out.println(i);
			i += 2;
			c++;
		}
		System.out.println(" ");
		System.out.println(c + " numbers were printed ");
	}
}
