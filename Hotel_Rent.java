import java.util.Scanner;

class Hotel_Rent {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of days taken");
        int n = Sc.nextInt();
        // First 5 days - 1000 rupees, next 5 days - 1500 rupees, following days - 800 rupees
        int c = 0, sum = 0, dues = 0;
        for (int i = 1; i <= n; i++) {
            if (c <= 5) {
                dues = 1000;
                sum = sum + dues;
                c++;
            } else if ((c > 5) && (c <= 10)) {
                dues = 1500;
                sum = sum + dues;
                c++;
            } else if ((c > 10) && (c <= 15)) {
                dues = 2000;
                sum = sum + dues;
                c++;
            } else if (c > 15) {
                dues = 800;
                sum = sum + dues;
                c++;
            }
        }
        System.out.println("\t" + " Thank you for staying with us " + "\n" + "\t" + " Roadside Cheap Third Class Hotels Inc" + "\n" + "\t" + " Your phinal bill is " + sum + " what ever your currency :)");
    }
}
