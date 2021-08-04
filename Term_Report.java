// Program to analyse marks of a student and display full term report

import java.util.Scanner;

class Term_Report {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter term 1 marks ");
        int a = Sc.nextInt();
        System.out.println(" Enter term 2 marks ");
        int b = Sc.nextInt();
        System.out.println(" Enter term 3 marks ");
        int c = Sc.nextInt();
        double d = (a + b + c);
        System.out.println(" The total marks for the session is " + d);
        double e = (a * 30 / 100 + b * 30 / 100 + c * 40 / 100);
        System.out.println(" THe weighted percentage is " + e);
        double f = d * 100 / 300;
        System.out.println(" The total percentage is " + f);
        if (f < 85) {
            System.out.println(" Good job , but you could have done better , keep it up! ");
        } else {
            System.out.println(" Fabulous performance ! Maintain those grades and you are set ! ");
        }
    }
}
