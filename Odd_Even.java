import java.util.Scanner;

class Odd_Even {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your number");
        int a = Sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(" The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}