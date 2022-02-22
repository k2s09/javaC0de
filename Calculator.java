// This program presents a menu of mathematical calculations using basic arithmetic operators

import java.util.Scanner;

class Calculator {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your number ");
		double a = Sc.nextDouble();
		System.out.println(" Do you want to enter another number ?  (y/n)");
		String yn = Sc.next();
		double c = (0);
		if (yn.equals("y")) {
			System.out.println(" Enter your second number ");
			double b = Sc.nextDouble();
			System.out.println("a for addition,s for subtraction,m for multiply,d for divide");
			String z = Sc.next();
			if (z.equals("a")) {
				c = a + b;
				System.out.println(c);
			}
			if (z.equals("s")) {
				c = a - b;
				System.out.println(c);
			}
			if (z.equals("m")) {
				c = a * b;
				System.out.println(c);
			}
			if (z.equals("d")) {
				c = a / b;
				System.out.println(c);
			}
		}
		if (yn.equals("n")) {
			System.out.println("l for logarithm,s for sqrt,r for round off,a for absolute value");
			String lm = Sc.next();
			if (lm.equals("l")) {
				c = Math.log(a);
				System.out.println(c);
			}
			if (lm.equals("s")) {
				c = Math.sqrt(a);
				System.out.println(c);
			}
			if (lm.equals("r")) {
				c = Math.round(a);
				System.out.println(c);
			}
			if (lm.equals("a")) {
				c = Math.abs(a);
				System.out.println(c);
			}
		}
	}
}
/**
 * Variable Data Chart
 * Variable Name  Data Type  Function
 * a              int        To store first value for calculation
 * yn             String     To ask if user wants to enter another value
 * z              int        To store user's choice from first menu
 * b              int        To store second value for calculation
 * c              double     To store result from calculations
 * lm             String     To store user's choice from second menu
 */