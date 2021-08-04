// program to calculate sums with pre and post increment 

import java.util.Scanner;

class Pre {
    public static void main(String args[]) {
        Scanner Po = new Scanner(System.in);
        int a = 5, b = 10;
        int z = a + a++ + ++a;
        int x = b + b++ + ++b;
        System.out.println(z + x);
    }
}
