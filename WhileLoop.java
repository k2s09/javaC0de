import java.util.Scanner;

class WhileLoop {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int a = Sc.nextInt();
		int sum = 0;
		int n = 0;
		while (a > 1) {
			n = (a % 10);
			sum = sum + n;
			a = (a / 10);
			System.out.println(sum);
		}
	}
}
        
    
