import java.util.Scanner;

class Infinite {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int c = 1;
		System.out.println(" Press any key to start ");
		for (int i = 1; i >= 1; i++) {
			System.out.println(c);
			c += 1;
		}
	}
}