import java.util.Scanner;

class Ten_Base {
	public static void main(String k[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations");
		int n = Sc.nextInt();
		double c = 1.0;
		int a;
		for (int i = 1; i <= n; i++) {
			System.out.println("10 / " + c + " = : " + (10 / c));
			c++;
		}
		String Hello = Sc.nextLine();
		String result = Hello.substring(0, 4);
		Sc.close();
	}
}
