import java.util.Scanner;

class PrimeNumber {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("This prigram checks whether number entered is a prime or not ");
        System.out.println(" Enter your number ");
        int a = Sc.nextInt();
        int div = 2;
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % div == 0) {
                System.out.println(" The number is a composite number. It's factors are -  ");
                for (int h = 1; h <= a; h++) {
                    if (a % h == 0) {
                        System.out.println(h);
                    }
                }
                break;
            }
            if (a % 2 != 0) {
                for (int z = 3; z < a; z++) {
                    sum = a % z;
                    {
                        if (sum == 0) {
                            System.out.println(" The number is prime ");
                        } else {
                            a++;
                        }
                    }
                }
            }
        }
    }
}