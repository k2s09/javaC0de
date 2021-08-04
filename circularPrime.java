import java.util.Scanner;

public class circularPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();
        sc.close();
        int temp = no;
        int length = ("" + no).length();
        int flag = 0;
        for (int i = 0; i < length; i++) {
            if (isPrime(no)) {
                flag += 1;
            }
            no = rotation(no);
        }
        if (flag == length)
            System.out.println("It is a circular prime");
        else
            System.out.println("It is not a circular prime");
    }

    static int rotation(int no) {
        String str = "" + no;
        str = str.substring(1) + str.charAt(0);
        return Integer.valueOf(str);
    }

    static boolean isPrime(int no) {
        int flag = 0;
        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return true;
        else
            return false;
    }
}