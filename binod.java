/*
   Design a class to overload a function Sum( ) as follows:
   (i) int Sum(int A, int B) – with two integer arguments (A and B) calculate and return 
   sum of all the even numbers in the range of A and B.
   Sample input: A=4 and B=16 
   Sample output: sum = 4 + 6 + 8 + 10 + 12 + 14 + 16
   (ii) double Sum( double N ) – with one double arguments(N) calculate and return  
   the product of the following series:
   sum = 1.0 x 1.2 x 1.4 x …………. x N
   (iii) int Sum(int N) - with one integer argument (N) calculate and return sum of only 
   odd digits of the number N.
   Sample input : N=43961 
   Sample output : sum = 3 + 9 + 1 = 13
   Write the main method to create an object and invoke the above methods. 
   */
public class binod {
	public static void main(String args[]) {
		binod tharu = new binod();
		int r1 = tharu.Sum(4, 16);
		double r2 = tharu.Sum(2.0);
		int r3 = tharu.Sum(43961);
		System.out.println(r1 + "\n" + r2 + "\n" + r3);
	}

	int Sum(int A, int B) {
		int evenSum = 0;
		for (int i = A; i <= B; i++) {
			if (i % 2 == 0)
				evenSum += i;
		}
		return evenSum;
	}

	double Sum(double N) {
		double answer = 1.0;
		for (double i = 1.0; i <= N; i += 0.2)
			answer *= i;
		return answer;
	}

	int Sum(int N) {
		int sum = 0;
		int dig;
		while (N > 0) {
			dig = N % 10;
			if (dig % 2 != 0)
				sum += dig;
			N /= 10;
		}
		return sum;
	}
}
