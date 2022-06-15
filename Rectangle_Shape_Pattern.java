import java.util.Scanner;

class Rectangle_Shape_Pattern {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
		int length = Sc.nextInt();
		System.out.println("Enter breadth of the rectangle");
		int breadth = Sc.nextInt();
		for (int i = 1; i <= breadth; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}