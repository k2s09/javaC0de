import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You have to guess the number ");
		System.out.println("Enter difficulty(1,2 or 3)");
		int dif = sc.nextInt();
		int m = 0;
		if (dif == 1)
			m = 30;
		else if (dif == 2)
			m = 40;
		else if (dif == 3)
			m = 50;
		else
			System.out.println("Please enter either 1 ,2 or 3");
		int h = m + 1;
		Random rand = new Random();
		int rand_int1 = rand.nextInt(h);
		System.out.println("Guess an number between 0 and " + m);
		int count = 0;
		for (count = 5; count > 0; count--) {
			System.out.println("Tries remaining : " + count);
			System.out.println("Enter your guess");
			int guess = sc.nextInt();
			if (guess < rand_int1) {
				System.out.println("Your guess is smaller than the number.");

			} else if (guess > rand_int1) {
				System.out.println("Your guess is greater than the number.");

			} else {
				System.out.println("Your guess is correct!");
				break;
			}
		}
		if (count <= 0)
			System.out.println("Sorry you lose , The correct number was " + rand_int1);
		else
			System.out.println("Congratulations");
	}

}