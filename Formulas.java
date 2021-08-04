import java.util.Scanner;

class Formulas {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Menu /n 1. Area of a circle \n 2. Area of rectangle /n 3. Area of a triangle ");
        int a = Sc.nextInt();
        double result = 0;
        switch (a) {
            case 1:
                System.out.println("Enter radius of circle");
                double r = Sc.nextDouble();
                result = (3.14 * r * r);
                break;

            case 2:
                System.out.println("Enter length");
                double l = Sc.nextDouble();
                System.out.println(" Enter breadth ");
                double b = Sc.nextDouble();
                result = l * b;
                break;
            case 3:
                System.out.println("Enter base length");
                double base = Sc.nextDouble();
                System.out.println("Enter height");
                double height = Sc.nextDouble();
                break;
        }
        System.out.println("The result is " + result);
    }
}