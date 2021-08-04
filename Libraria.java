import java.util.Scanner;

class Libraria {
    String name;
    double price;

    Libraria() {
        name = "";
        price = 0.0;
    }

    public static void main(String args[]) {
        Libraria book = new Libraria();
        book.input();
        book.cal();
        book.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter price");
        price = sc.nextDouble();
    }

    void cal() {
        if (price <= 1000) {
            price -= (price * 2 / 100);
        }
        if (price > 1000 && price <= 3000) {
            price -= (price * 1 / 10);
        }
        if (price > 3000) {
            price -= (price * 15 / 100);
        }
    }

    void display() {
        System.out.println(name);
        System.out.println(price);
    }
}
        
        
        
   
    
     
  