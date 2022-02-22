// Making a program using function overload

class FuncOver {
	double aa;

	public static void main(String args[]) {
		FuncOver B = new FuncOver();
		double r1 = B.area(2.0, 3.0, 4.0);
		double r2 = B.area(2, 5, 10);
		double r3 = B.area(5.0, 7.0);
		System.out.println("The area of the scalene triangle is " + r1);
		System.out.println("The area of the trapezium is " + r2);
		System.out.println("The area of the rhombus is " + r3);
	}

	double area(double a, double b, double c) {
		double s = (a + b + c) / 2;
		aa = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return aa;
	}

	double area(int a, int b, int c) {
		aa = c / 2 * (a + b);
		return aa;
	}

	double area(double d1, double d2) {
		aa = (d1 * d2) / 2;
		return aa;
	}
}
/**
 * Variable Data Table
 * Variable  Data type  Function
 * aa        double     To store area as return value
 * a,b,c     double     To store dimensions of traingle
 * a,b,c     int        To store dimensions of trapezium
 * d1,d2     double     To store dimensions of rhombus
 * r1,r2,r3  double     To store result in main method
 */

