import java.util.Scanner;
public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start indexes");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter end indexes");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int flag = 0;
        double distance = Math.sqrt( Math.pow((y2-y1),2) + Math.pow((x2-x1),2) );
        if (distance == 1 || distance == Math.sqrt(2)) {
            System.out.println("King");
            flag = 1;
        }
        if (distance % Math.sqrt(2) == 0) {
            System.out.println("Bishop");
            flag = 1;
        }
        if (x1 == x2 || y1 == y2) {
            System.out.println("Rook");
            flag = 1;
        }
        if (distance == Math.sqrt(5)) {
            System.out.println("Horsey!");
        }
        if (y1 == y2 && (x2+1 == x1)) {
            System.out.println("Pawn");
            flag = 1;
        }
        if (flag == 1) {
            System.out.println("Queen");
        }
    }
}