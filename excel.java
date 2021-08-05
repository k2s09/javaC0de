import java.util.Scanner;

class excel {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Only enter subjects and their marks , other things will be calculated :) ");
		System.out.println(" Enter name ");
		String name = Sc.next();
		System.out.println(" Enter next heading ");
		String h1 = Sc.next();
		System.out.println(" Value of the heading ");
		double v1 = Sc.nextDouble();
		System.out.println(" Enter next heading ");
		String h2 = Sc.next();
		System.out.println(" Value of this heading ");
		double v2 = Sc.nextDouble();
		System.out.println(" Enter next heading ");
		String h3 = Sc.next();
		System.out.println(" Value of this heading ");
		double v3 = Sc.nextDouble();
		System.out.println(" Enter next heading ");
		String h4 = Sc.next();
		System.out.println(" Value of this heading ");
		double v4 = Sc.nextDouble();
		System.out.println(" Enter next heading ");
		String h5 = Sc.next();
		System.out.println(" Enter value of this heading ");
		double v5 = Sc.nextDouble();
		double total = (v1 + v2 + v3 + v4 + v5);
		double percentage = (total / 500 * 100);
		if (total > 500 || percentage > 100.0) {
			System.out.println(" Your marks are abnormally high , give your marks honestly ");
		} else {
			System.out.println("S.No" + "\t" + "Name" + "\t" + h1 + "\t" + h2 + "\t" + h3 + "\t" + h4 + "\t" + h5 + "\t" + "Total" + "\t" + "Percentage");
			System.out.println("1" + "\t" + name + "\t" + v1 + "\t" + v2 + "\t" + v3 + "\t" + v4 + "\t" + v5 + "\t" + total + "\t" + percentage);
		}
	}
}