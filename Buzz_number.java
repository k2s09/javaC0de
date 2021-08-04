import java.util.Scanner;

class Buzz_number {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = Sc.nextInt();
        int mod = (n % 10);
        int div = (n % 7);
        if (mod == 7 || div == 0) {
            System.out.println("The number is a buzz number ");
        } else {
            System.out.println("Its not a buzz number ");
        }
    }
}