import java.util.Scanner;
public class Point {

	int x;
	int y;

	public static void main(String[] args) {
		Point A = new Point();
		Point B = new Point();
		A.readpoint();
		B.readpoint();
		Point R = new Point();
		R = R.midpoint(A,B);
		R.displaypoint();
	}

	void readpoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y coordinates: ");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	void displaypoint() {
		System.out.println("Point("+x+","+y+")");
	}

	Point midpoint(Point A, Point B) {
		Point C = new Point();
		C.x = (A.x + B.x)/2;
		C.y = (A.y + B.y)/2;
		return C;
	}
}
