import java.util.Scanner;

class Star_Square_Pattern {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter side of the square");
		int side = Sc.nextInt();
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}