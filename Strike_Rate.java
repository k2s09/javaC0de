// Program to find the strike rate of a batsman

import java.util.Scanner;

class Strike_Rate {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Srike rate is the number of runs scored per 100 balls faced. ");
		System.out.println(" Enter runs scored by the batsman ");
		int runs = Sc.nextInt();
		System.out.println(" Great , now enter the balls faced by the batsman ");
		int balls_faced = Sc.nextInt();
		double SR = (100 * runs) / balls_faced;
		System.out.println(" The strike rate is " + SR);
	}
}
    
   