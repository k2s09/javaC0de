// Find what combination of weights can be configured on one dumbbell. Maximum weight is between 20 and 36 with two kg increments. Weight of a ring is between 2 and 6 kg.
// Maximum number of rings on one dumbbell is 4
public class dumbbell {
    public static void main(String[] args) {
        int two = 2, three = 3, four = 4, five = 5, six = 6;
        int count1 = 0, count2 = 0;
        int sumLeft = 0, sumRight = 0;
        for (int i = 22; i <= 36; i += 2) {
            System.out.println("Possible combinations for " + i + " kg is: ");
            for (int j = 2; j <= 6; j++) {
                System.out.println(j * 4 + "kg by having " + j + " as each ring");
            }
        }

    }
}
