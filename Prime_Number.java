import java.util.Scanner;

class Prime_Number {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your number ");
        int x = Sc.nextInt();
        int a = 1;
        int sum = 0;
        int div = 0;
        for (int i = 1; i < x; i++) {
            ++a;
            div = x % a;
            if (div == 0) {
                System.out.println(" The number is not a prime number ");
                break;
            }
            if (div != 0) {
                System.out.println(" The number is a prime number ");
                break;
            }
        }
    }
}

            