import java.util.Scanner;

class Even_Numbers {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int sum = 0, num = 0;
        do {
            System.out.println("You can enter as many even numbers as you like, when you enter an odd one, all even will get added up");
            num = Sc.nextInt();
            sum = sum + num;
        } while (num % 2 == 0);
        System.out.println(" The sum is " + sum);
    }
}
           