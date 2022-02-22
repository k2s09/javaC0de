import java.util.Scanner;

class Electricity_Bill {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Units" + "\t" + "Consumed Charges" + "\n" + "Upto 50 units" + "\t" + "Free" + "\n" + "51 - 100" + "\t" + "0.75 p" + "\n" + "101 - 250" + "\t" + "1.25 p" + "\n" + "251 - 500" + "\t" + "2.50 p" + "\n" + "Above 500" + "\t" + "3.00 p");
		System.out.println(" Enter your units consumed");
		double unit = Sc.nextDouble();
		double result = 0;
		if (unit <= 50) {
			result = 0 + 180;
		}
		if ((unit >= 51) && (unit <= 100)) {
			result = (unit * 0.75) + 180;
		}
		if ((unit >= 101) && (unit <= 250)) {
			result = (unit * 1.25) + 180;
		}
		if ((unit >= 251) && (unit <= 500)) {
			result = (((unit * 2.50) + 75) + 180);
		}
		if (unit > 500) {
			result = (((unit * 3.00) + 75) + 180);
		}
		result = (result + ((25 / 2) * result / 100) + (2 * result / 100));
		result = result - (4 * result / 100);
		System.out.println("The amount you have to pay is " + result);
	}
}

