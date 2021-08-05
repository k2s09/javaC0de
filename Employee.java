import java.util.Scanner;

public class Employee {
	double taxincome, tax;
	String name;
	int pan;

	public static void main(String k[]) {
		Employee b = new Employee();
		b.input();
		b.calculate();
		b.display();
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pan ");
		pan = sc.nextInt();
		System.out.println("Enter the taxincome");
		taxincome = sc.nextDouble();
		System.out.println("Enter the name");
		name = sc.next();
	}

	void calculate() {
		if (taxincome <= 100000)
			tax = 0;
		else if (taxincome > 100000 && taxincome <= 150000)
			tax = 10.0 / 100 * (taxincome - 100000);
		else if (taxincome > 150000 && taxincome <= 250000)
			tax = 20.0 / 100 * (taxincome - 150000) + 5000;
		else
			tax = 30.0 / 100 * (taxincome - 250000) + 25000;
	}

	void display() {
		System.out.println("PAN\tName\tTaxIncome\ttax");
		System.out.println(pan + "\t" + name + "\tRs." + taxincome + "\tRs." + tax);
	}
}
