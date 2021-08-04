// Program to find gross salary of Ramesh

import java.util.Scanner;

class Ramesh {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter basic salary of Ramesh ");
        int Basic = Sc.nextInt();
        System.out.println(" Enter dearness allowance ");
        int DA = Sc.nextInt();
        System.out.println(" Enter house rent allowance ");
        int HRA = Sc.nextInt();
        int Gross_Salary = Basic + DA + HRA;
        System.out.println(" The gross salary is " + Gross_Salary);
    }
}