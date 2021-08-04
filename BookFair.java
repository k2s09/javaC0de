import java.util.Scanner;

public class BookFair {
    double price;
    String Bname;

    public static void main(String k[]) {
        BookFair b = new BookFair();
        b.input();
        b.calculate();
        b.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the book");
        Bname = sc.next();
        System.out.println("Enter price");
        price = sc.nextDouble();
    }

    void calculate() {
        if (price <= 1000)
            price -= 2.0 / 100 * price;
        else if (price >= 1001 && price <= 3000)
            price -= 10.0 / 100 * price;
        else
            price -= 15.0 / 100 * price;
    }

    void display() {
        System.out.println("The price(after discount) for " + Bname + " is Rs." + price);
    }
}
