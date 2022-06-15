import java.util.Scanner;

class Sqrt {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" If you want numbers between squares , then press 1 , If you want numbers between cubes then press 0 ");
		int a = Sc.nextInt();
		System.out.println(" Enter the numbers (Bigger number first)");
		int z = Sc.nextInt();
		int x = Sc.nextInt();
		if (a == 1) {
			System.out.println((z * z) - (x * x));
		} else {
			System.out.println((z * z * z) - (x * x * x));
		}
	}
}
