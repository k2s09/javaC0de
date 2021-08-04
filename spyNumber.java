import java.util.Scanner;

class spyNumber {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number to check for spy number: ");
        int num = Sc.nextInt();
        // Finding sum and product of digits
        int dig;
        int sum = 0;
        int product = 1;
        while (num > 0) {
            dig = num % 10;
            sum += dig;
            product *= dig;
            num /= 10;
        }
        if (sum == product)
            System.out.println("It is a spy number");
        else
            System.out.println("It is not a spy number");
    }
}
