import java.util.Scanner;

class Resistance {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your 3 digit number ");
		int n = Sc.nextInt();
		int one, two, three, sum;
		int c = 1;
		do {
			one = (n % 10);
			two = (((n % 100) - (n % 10)) / 10);
			three = ((n - (n % 100)) / 100);
			sum = one * two * three;
			System.out.println(" Sum is " + sum);
			c++;
			if (sum < 10) {
				System.out.println(" Resistence of number is " + c);
				System.out.println(" Your number is " + (11 - c) + " less than the world record, 11");
				break;
			}
		} while (c <= 11);
	}
}
        
         
            