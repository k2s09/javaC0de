// Taking a number from the user and seperating the digits and multiplying it till answer is in a single digit

import java.util.Scanner;

class laa {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your number ");
		long n = Sc.nextInt();
		long f, v, l;
		long sum = 1;
		long mus = 1;
		long sus = 1;
		int c = 1;
		do {
			for (int g = 1; g <= sum; g++) {
				v = (sum % 10);
				mus = mus * v;
				sum /= 10;
				c++;
			}
			System.out.println(mus);
		} while (mus < 0);
		for (int s = 1; s <= mus; s++) {
			l = (mus % 10);
			sus *= l;
			mus /= 10;
		}
		System.out.println(mus + "\n" + " The resistence of the number is " + c);
	}
}
   