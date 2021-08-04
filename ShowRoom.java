// 2019

import java.util.Scanner;

class ShowRoom {
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    public static void main(String args[]) {
        ShowRoom r = new ShowRoom();
        r.input();
        r.calculate();
        r.display();
    }

    void input() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = Sc.next();
        System.out.print("Enter mobile number : ");
        mobno = Sc.nextLong();
        System.out.print("Enter cost : ");
        cost = Sc.nextInt();
    }

    void calculate() {
        if (cost <= 10000)
            dis = ((5.0 / 100) * cost);
        if (cost > 10000 && cost <= 20000)
            dis = ((10.0 / 100) * cost);
        if (cost > 20000 && cost <= 35000)
            dis = ((15.0 / 100) * cost);
        if (cost > 35000)
            dis = ((20.0 / 100) * cost);

        amount = (cost - dis);
    }

    void display() {
        System.out.println("Name\tPhoneNumber\tAmount");
        System.out.println(name + "\t" + mobno + "\t" + amount);
    }
}

        
        
        