import java.util.Scanner;

class Commision {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter basic salary ");
		double sal = Sc.nextDouble();
		System.out.println("Sales" + "\t" + "\t" + "Commision rate" + "\n" + "30001 onwards" + "\t" + "15 %" + "\n" + "22001 - 30001" + "\t" + "10 %" + "\n" + "12001 - 22000" + "\t" + "7 %" + "\n" + "5001 - 12000" + "\t" + "3 %" + "\n" + "0 - 5000" + "\t" + "0%");
		System.out.print(" Your commision rate is ");
		// formula is commision / total sales = rate of commision / 100
		double total = 0;
		if (sal >= 30001) {
			System.out.println("15 %");
			double result = (15 * sal / 100);
			total = sal + result;
		}
		if ((sal >= 22001) && (sal < 30000)) {
			System.out.println("10 %");
			double result = (10 * sal / 100);
			total = sal + result;
		}
		if ((sal >= 12000) && (sal < 22000)) {
			System.out.println("7 %");
			double result = (7 * sal / 100);
			total = sal + result;
		}
		if ((sal >= 5001) && (sal < 12000)) {
			System.out.println("3 %");
			double result = (3 * sal / 100);
			total = sal + result;
		}
		if (sal <= 5000) {
			System.out.println("0 %");
			double result = 0;
			total = sal + result;
		}
		System.out.println("Your total income is " + total);
	}
}