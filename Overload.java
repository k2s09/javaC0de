// 2019
class Overload {
	public static void main(String args[]) {
		Overload o = new Overload();
		o.series(2, 5);
		o.series(5);
		o.series();
	}

	void series(int x, int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (Math.pow(x, n));
		}
		System.out.println(sum);
	}

	void series(int p) {
		int n;
		for (int i = 1; i <= p; i++) {
			n = ((i * i * i) - 1);
			System.out.print(n);
		}
	}

	void series() {
		double sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum += (1.0 / i);
		}
		System.out.println(sum);
	}
}
        
            