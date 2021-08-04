import java.util.Scanner;

class Discount {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" What is ur name dude ");
        String name = Sc.next();
        System.out.println("Hello " + name + " ,what's the amount you need to pay ? ");
        double amount = Sc.nextDouble();
        System.out.println("S.No" + "\t" + "Name" + "\t" + "Amount" + "\t" + "Discount");
        if (amount >= 70000) {
            System.out.println("1" + "\t" + name + "\t" + amount + "\t" + "18%");
            System.out.println(" The discounted amount is " + ((amount - (18 * amount / 100))));
        } else if ((amount >= 55001) && (amount < 70000)) {
            System.out.println("1" + "\t" + name + "\t" + amount + "\t" + "16%");
            System.out.println(" The discounted amount is " + ((amount - (16 * amount / 100))));
        } else if ((amount >= 35001) && (amount < 55000)) {
            System.out.println("1" + "\t" + name + "\t" + amount + "\t" + "12%");
            System.out.println(" The discounted amount is " + ((amount - (12 * amount / 100))));
        } else if ((amount >= 25001) && (amount < 35000)) {
            System.out.println("1" + "\t" + name + "\t" + amount + "\t" + "10%");
            System.out.println(" The discounted amount is " + ((amount - (10 * amount / 100))));
        } else if (amount < 25001) {
            System.out.println("1" + "\t" + name + "\t" + amount + "\t" + "2%");
            System.out.println(" The discounted amount is " + ((amount - (2 * amount / 100))));
        } else
            System.out.println(" Sorry , there is an error , we will work on your case and revert back soon ");
    }
}