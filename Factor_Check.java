import java.util.Scanner;

class Factor_Check {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter number ");
		int n = Sc.nextInt();
		int div;
		int c = 1, ch = 0;
		System.out.println(" It's factors are : ");
		for (int i = 1; i <= n; i++) {
			div = (n % c);
			if (div == 0) {
				System.out.println(c);
				ch++;
			}
			c++;
		}
		System.out.println(" Total number of factors are " + ch);
	}
}

            