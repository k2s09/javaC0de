import java.util.Scanner;

class Digit_Finder {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your number ");
        int num = Sc.nextInt();
        int three = (num % 10);
        int two = (((num % 100) - (num % 10) / 10) - (num % 10)) / 10;
        int one = ((num % 1000) - (num % 100)) / 100;
        System.out.println("First digit is " + one);
        System.out.println("Second digit is " + two);
        System.out.println("Third digit is " + three);
        Sc.close();
    }
}

