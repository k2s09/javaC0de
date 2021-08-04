import java.util.Scanner;

class Library_Rent {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of days taken");
        int n = Sc.nextInt();
        // First 7 days free, next 4 days - 2 dollars, next 3 days - 3 dollars, above 2 weeks- 5 dollars
        int c = 0, sum = 0, dues = 0;
        for (int i = 1; i <= n; i++) {
            if (c <= 7) {
                dues = 0;
                sum = sum + dues;
                c++;
            } else if ((c > 7) && (c <= 11)) {
                dues = 2;
                sum = sum + dues;
                c++;
            } else if ((c > 11) && (c <= 14)) {
                dues = 3;
                sum = sum + dues;
                c++;
            } else if (c > 14) {
                dues = 5;
                sum = sum + dues;
                c++;
            }
        }
        System.out.println("You owe us " + sum + " dollars");
    }
}
