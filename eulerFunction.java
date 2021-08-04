// The Euler Number e is used as the base of natural logarithm.
// It can be approximated using the formula:
// e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + � 1 / n!
// Write a program in Java that approximates e using a loop that terminates when the difference between two successive values of e
// differ by less than 0.0000001.
public class eulerFunction {
    public static void main(String args[]) {
        double e = 1.0d;
        int count = 1;
        boolean flag = false;
        while (flag == false) {
            // finding value of factorial of count
            int factorial = 1;
            for (int i = 1; i <= count; i++) {
                factorial *= i;
            }
            count += 1;
            // Storing previous value of e
            double temp = e;
            e += 1.0 / factorial;
            if ((e - temp) < 0.0000001) {
                flag = true;
            }
        }
        System.out.println("required value of e: " + e);
        System.out.println("count: " + count);
    }
}