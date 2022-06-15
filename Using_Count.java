import java.util.Scanner;

class Using_Count {
	public static void main(String str[]) {
		Scanner Sc = new Scanner(System.in);
		int c = 0, sum = 0, num = 0;
		System.out.println(" Enter first number ");
		int a = Sc.nextInt();
		sum = sum + a;
		do {
			System.out.println(" Enter next number. When you enter 0, sum and count will be displayed ");
			num = Sc.nextInt();
			sum = sum + num;
			++c;
		} while (num != 0);
		System.out.println(" Sum is " + sum + "\n" + " Count is " + c);
	}
}

    