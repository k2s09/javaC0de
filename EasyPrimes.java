import java.util.Scanner;

class EasyPrimes {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        EasyPrimes s = new EasyPrimes();
        System.out.print("This program tells whether the number entered is prime or composite with its factors \nEnter number : ");
        int n = Sc.nextInt();
        int flag = 1;
        int div;
        for (int i = 2; i < n; i++) {
            div = (n % i);
            if (div == 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("The number is a prime number");
        }
        if (flag == 0) {
            System.out.println("It is a composite number");
            System.out.print("It's factors are : ");
            for (int j = 2; j < n; j++) {
                if ((n % j) == 0)
                    System.out.print(j + "  ");
            }
        }
    }
}
            