// Program to find simple interest 

import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter principle amount ");
        double a = Sc.nextDouble();
        System.out.println(" Enter rate of compound interest ");
        double b = Sc.nextDouble();
        System.out.println(" Enter time or the transaction period ");
        double c = Sc.nextDouble();
        double d = (a * b * c) / 100;
        double e = a + d;
        System.out.println(" The Simple Interest is " + e);
    }
}