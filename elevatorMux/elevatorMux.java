// Assume a building with M floors and N lifts. You are on floor X, which lift should come to you?
package elevatorMux;
import java.util.Scanner;
public class elevatorMux extends elevator {
    // Declare constants
    static final int floorNo = 16;
    static final int liftNo = 8;
    static elevator lifts[] = new elevator[liftNo];
    // Variables for inputs
    static int X;
    static int dirn;
    // Main method
    public static void main(String[] args) {
        populate();
        userInput();
        printResult();
    }
    // Put example data in objects array
    static void populate() {
        // Initialize the lifts array with instances of elevator
        for (int i = 0; i < liftNo; i++) {
            lifts[i] = new elevator();
        }

        lifts[0].free = 1;
        lifts[1].free = 0; lifts[1].targetFloor = 7;
        lifts[2].free = 0; lifts[2].targetFloor = 2;
        lifts[3].free = 0; lifts[3].targetFloor = 13;
        lifts[4].free = 1;
        lifts[5].free = 0; lifts[5].targetFloor = 14;
        lifts[6].free = 1;
        lifts[7].free = 0; lifts[7].targetFloor = 1;
        lifts[0].dirn = 1;
        lifts[1].dirn = 2;
        lifts[2].dirn = 1;
        lifts[3].dirn = 2;
        lifts[4].dirn = 1;
        lifts[5].dirn = 1;
        lifts[6].dirn = 1;
        lifts[7].dirn = 1;
        lifts[0].currentFloor = 1;
        lifts[1].currentFloor = 2;
        lifts[2].currentFloor = 12;
        lifts[3].currentFloor = 12;
        lifts[4].currentFloor = 10;
        lifts[5].currentFloor = 4;
        lifts[6].currentFloor = 10;
        lifts[7].currentFloor = 7;
    }
    // Take user inputs
    static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floor no: ");
        X = sc.nextInt();
        System.out.println("Enter direction: (1 for Up, 2 for Down)");
        dirn = sc.nextInt();
        sc.close();
        if (dirn == 2)
            dirn = 0;
        // User validation
        if ((X == 1 && dirn == 0) || (X == 16 && dirn == 1)) {
            System.out.println("Invalid choice!");
            System.exit(0);
        }
    }
    // Returns the index of the lift which should serve the user request
    static int priorityEncoder() {
        int index = -1, distance = 17;
        // Linearly traverses through lifts[] array
        for(int i = 0; i < liftNo; i++) {
            // Check for moving lift
            if (lifts[i].free == 0) {
                // Check if lift is in opposite direction to user direction, skip
                if (lifts[i].dirn != dirn) continue;
                // Check if user floor is not in the lift's path
                if ((lifts[i].dirn == 1 && lifts[i].currentFloor > X) || (lifts[i].dirn == 0 && lifts[i].currentFloor < X)) {
                    continue;
                }
            }
            // Else, lift is compatible to drop the user. Check for shortest distance.
            int dist = Math.abs(lifts[i].currentFloor - X);
            if (dist < distance) {
                distance = dist;
                index = i;
            }
        }
        return index;
    }
    static void printResult() {
        System.out.println("Lift " + priorityEncoder() + " will serve you");
    }
}