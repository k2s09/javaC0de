// Making a program using constructor overload

class ConsOver {
	double l, b, h, v;

	ConsOver(double breadth, double height, double length) {
		b = breadth;
		h = height;
		l = length;
	}

	ConsOver(double a) {
		l = b = h = a;
	}

	public static void main(String args[]) {
		ConsOver c1 = new ConsOver(2.0, 4.0, 5.0);
		double r = c1.volume();
		System.out.println(r);
		ConsOver c2 = new ConsOver(5.0);
		r = c2.volume();
		System.out.println(r);
	}

	double volume() {
		v = l * b * h;
		return v;
	}
}
/**
 * Variable Data Table
 * Variable  Data type  Function
 * l,b,h     double     To store dimensions of box
 * v         double     To store area of box
 */
        
        


        
        

    