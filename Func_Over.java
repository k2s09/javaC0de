class Func_Over {
	public static void main(String args[]) {
		Func_Over a = new Func_Over();
		a.compare(5, 10);
		a.compare('a', 'z');
	}

	void compare(int x, int y) {
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else
			System.out.println(y + " is greater than " + x);
	}

	void compare(char j, char k) {
		if (j > k)
			System.out.println(j + " is greater than " + k);
		else
			System.out.println(k + " is greater than " + j);
	}
}

        