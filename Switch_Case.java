import java.util.Scanner;

class Switch_Case {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your number ");
		double k2 = Sc.nextDouble();
		System.out.println(" Menu - ");
		System.out.println(" 1 for giving thre natural log of that number ");
		System.out.println(" 2 for returning the square root of the number ");
		System.out.println(" 3 for returning the cube root of that number ");
		System.out.println(" 4 for returning the exponential value of that number ");
		int a = Sc.nextInt();
		double result = 0;
		switch (a) {
			case 1:
				result = Math.log(k2);
				break;

			case 2:
				result = Math.sqrt(k2);
				break;

			case 3:
				result = Math.pow(k2, 1 / 3);

				break;

			case 4:
				result = Math.exp(k2);
				break;

			default:
				System.out.println(" You have entered a wrong number ");
		}
		System.out.println(result);
	}
}
            