import java.util.Scanner;

class Resistence {
    public static void main(String RGAA[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter your two/three digit number ");
        int a = Sc.nextInt();
        int b = ((((a % 100) - (a % 10)) / 10) * (a % 10));
        if ((b - 10) < 0) {
            System.out.println(" The resistence is 1 ");
        }
        if ((b - 10) > 0) {
            int c = ((((b % 100) - (b % 10)) / 10) * (b % 10));
            if ((c - 10) < 0) {
                System.out.println(" The resistence is 2");
            } else {
                System.out.println(" The resistence is 3 ");
            }
        }
        if (('c' - 10) > 0) {
            int d = (((('c' % 100) - ('c' % 10)) / 10) * ('c' % 10));
            if ((d - 10) < 0) {
                System.out.println(" The resistence is 4 ");
            } else if ((d - 10) < 0) {
                System.out.println(" The resistence is 5 ");
            }
        }
    }
}