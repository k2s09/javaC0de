class Constructor {
	double b;
	double h;
	double l;
	double v;

	Constructor(double breadth, double height, double length) {
		b = breadth;
		h = height;
		l = length;
	}

	public static void main(String args[]) {
		Constructor c1 = new Constructor(2.0, 4.0, 5.0);
		c1.volume();
	}

	void volume() {
		v = b * h * l;
		System.out.println("the volume is " + v);
	}
}
        
        

    