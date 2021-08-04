// program to swap the values of two variables without a third variable

import java.util.Scanner;

class Swap_wth {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter two numbers ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}