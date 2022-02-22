import java.util.Scanner;

class big_calculator {
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
			System.out.println(" a for addition , s for subtraction , m for multiply , d for divide ");
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
			System.out.println(" l for logarithm , s for sqrt , r for round off , a for absolute value ");
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
