class Cons {
	double b;
	double h;
	double l;
	double v;

	Cons(double breadth, double height, double length) {
		b = breadth;
		h = height;
		l = length;
	}

	Cons(double a) {
		l = b = h = a;
	}

	public static void main(String args[]) {
		Cons c1 = new Cons(2.0, 4.0, 5.0);
		double r = c1.volume();
		System.out.println(r);
		Cons c2 = new Cons(5.0);
		r = c2.volume();
		System.out.println(r);
	}

	double volume() {
		v = l * b * h;
		return v;
	}
}
        
        


        
        

    