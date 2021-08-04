// Program to convert Fahrenheit into Celsius by simple mathematics

import java.util.Scanner;

class Conversion {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your temperature in Fahrenheit ");
        double f = Sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(" The temperature in Celsius is " + c);
        if (c > 30) {
            System.out.println(" Its pretty hot ! Get yourself a cool refreshment ");
        } else {
            System.out.println(" Its moderate , not too hot and not to cold ! ");
        }
    }
}
       
       
