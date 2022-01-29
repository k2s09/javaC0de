// Taking choice from user and calculating their bill. Topics used - Switch, If Else

import java.util.Scanner;

class Car_Rent {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Hi, welcome to Java Travel Agency, please enter your name");
		String name = Sc.next();
		System.out.println("Hi " + name + ", please enter distance to be travelled in km");
		int dist = Sc.nextInt();
		System.out.println("Now please choose car size (Respond with 1/2/3) : \n1.Small (1-4 people) \n2.Medium (5-9 people) \n3.Large (10-15 people)");
		int size = Sc.nextInt();
		double price = 0;
		switch (size) {
			case 1:
				price += 4000;
				break;
			case 2:
				price += 6000;
				break;
			case 3:
				price += 9000;
		}
		System.out.println("Would you like an A.C. vehicle, additional charge of 10 rupees per km (Yes/No)");
		String a = Sc.next();
		// Cost of one km without a.c. is 20 rupees and with a.c. is 30 rupees
		if (a.equals("Yes"))
			price += (dist * 20);
		else
			price += (dist * 30);
		System.out.println("_______________________________________________________________________");
		System.out.println("\t" + "\t" + "INVOICE");
		System.out.println("Name" + "\t" + "Distance" + "\t" + "Size" + "\t" + "A.C. included" + "\t" + "Total Cost");
		System.out.println(name + "\t" + dist + " km" + "\t" + "\t" + +size + "\t" + a + "\t" + "\t" + price);
	}
}
/**
 * Variable Data Table
 * Variable Name         Data Type          Function
 * name                  String             To store name of customer
 * dist                  int                To store distance to be travelled
 * size                  int                To store size of car requested
 * price                 double             To store amount to be paid
 * a                     String             To store if a.c. vehicle is needed
 */ 