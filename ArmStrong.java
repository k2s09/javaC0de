import java.util.Scanner;

class ArmStrong {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number which will be checked whether it is an armstrong number or not");
        int n = Sc.nextInt();
        int temp, rem, c = 0;
        double sum = 0;
        // Counting number of digits
        temp = n;
        while (temp != 0) {
            temp /= 10;
            c++;
        }
        temp = n;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + Math.pow(rem, c);
            temp /= 10;
        }
        if (n == sum)
            System.out.println(n + " is an armstrong number ");
        else
            System.out.println(n + " is not an armstrong number");
        Sc.close();
    }
}
