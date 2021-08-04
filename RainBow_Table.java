import java.util.Scanner;

class RainBow_Table {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number which is less than 100000000 or 1 followed by 8 zeros");
        long a = Sc.nextInt();
        for (long i = 1; i <= 100000000; i += 1000) {
            System.out.println(i);
        }
        String b = Sc.next();
        System.out.println("Your number was " + a);
    }
}
        