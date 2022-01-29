import java.util.Scanner;

class Odd_Loop {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations ");
		int n = Sc.nextInt();
		int o = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(o);
			o += 2;
		}
	}
}