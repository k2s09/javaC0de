import java.util.Scanner;

class blinmaker {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Starting Blinmaker...");
		System.out.println("So you live away from Babushka and now miss her blins, huh?");
		System.out.println("No worry comrade, I will tell you what all you need to make true Russian blins");
		System.out.print("\nFirst tell me your name: ");
		String comrade = Sc.next();
		System.out.println("Ok, " + comrade + " here are the ingredients you need to get: ");
		System.out.println("\n1. Milk \n2.Eggs \n3.Sugar \n4.Flour \n5.Salt \n6.Baking Soda \n7.Oil");
		System.out.println("\nOk comrade, now we will calculate how much of these ingredients you will need.");
		System.out.print("Enter how many blins you want to make: ");
		int blinNo = Sc.nextInt();

		int flourNo = 1;
		int bakingPowderNo = 1;
		double sugarNo = 0.5;
		int eggs = 1;
		double milk = 0.75;
		double saltNo = 0.25;

		if (blinNo > 4)
			System.out.println("Blin! That's a lot of blins!");
		System.out.println("\nYou need: ");
		System.out.println((flourNo * blinNo) + " cups of flour");
		System.out.println((bakingPowderNo * blinNo) + " teaspoon of baking powder");
		System.out.println((sugarNo * blinNo) + " tablespoon of sugar");
		System.out.println((saltNo * blinNo) + " teaspoons of salt");
		System.out.println((eggs * blinNo) + " eggs");
		System.out.println((milk * blinNo) + " cup of milk");
		System.out.println("\nAnd that was it blyat! Good luck comrade!");
		System.out.println("Terminating Blinmaker...");
	}
}
