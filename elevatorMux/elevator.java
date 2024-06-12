package elevatorMux;

public class elevator {
    int free; // 0 for moving, 1 for stopped
    int dirn; // 0 for down, 1 for up
    int currentFloor; // Values between 0 and 7
    int targetFloor; // Values between 0 and 7
}
