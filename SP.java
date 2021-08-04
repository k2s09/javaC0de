// program to find sp

import java.util.Scanner;

class SP {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter Selling price of 1 article ");
        double SP_1 = Sc.nextDouble();
        double SP_15 = SP_1 * 15;
        System.out.println(" The selling price of 15 articles is " + SP_15);
        System.out.println(" Enter Cost Price of 1 article ");
        double CP_1 = Sc.nextDouble();
        double CP_15 = CP_1 * 15;
        System.out.println("The cost price of 15 articles is " + CP_15);
        double profit = SP_15 - CP_15;
        double loss = CP_15 - SP_15;
        double profit_p = profit / CP_15 * 100;
        double loss_p = loss / CP_15 * 100;
        if (SP_15 > CP_15) {
            System.out.println("Profit is " + profit);
            System.out.println("Profit Percent is " + profit_p);
        } else if (SP_15 < CP_15) {
            System.out.println(" Loss is " + loss);
            System.out.println("Loss Percentage is " + loss_p);
        }
    }
}