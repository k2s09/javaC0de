// Sum of factorial of digits is equal to the number
import java.util.Scanner;
public class Special {
    int n;
    Special() {
        n = 0;
    }
    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    boolean isSpecial() {
        int sum = 0;
        int copy = n;
        while (n > 0) {
            sum += factorial(n%10);
            n /= 10;
        }
        if (sum == copy)
            return true;
        else
            return false;
    }
    void display() {
        if (isSpecial())
            System.out.println("Special");
        else
            System.out.println("Not Special");
    }
    public static void main(String args[]) {
        Special obj = new Special();
        obj.read();
        obj.display();
    }
}