// In this program we will be proving that the ratio of numbers higher up in the fibonacci series are a good approximation of the golden ratio i.e. 1.1618 that is a number fundamental to nature and implication of such patterns are very strikingly apparent in this universe.

import java.util.Scanner;

class Golden_Number {
	public static void main(String args[]) {
		Golden_Number N = new Golden_Number();
		N.input();
		N.insight();
		N.iterations();
	}

	void input() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String n = Sc.next();
		System.out.println("Nice to meet you " + n + " today's agenda is to brief you about the golden ratio. (Press any NUMBER key to continue)");
		int g = Sc.nextInt();
		System.out.println("Ok, so let's begin!");
	}

	void insight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("I see, that's no problem, you see the golden ratio is a mere irrational number in mathematics if you want to see it that way\nAnd it won't help you earn money or pay your taxes, or maybe .... it could.\nSo basically the ratio is 1.618... and so on, and it is found everywhere in this universe.\nIt is found about everywhere, any thing you see is appealing, is a form of the golden ratio, no really\nIt is found in buildings, as ratio of multiple computations, and in nature, from sunflowers, being the most famous example, to the milky way galaxy \nThis number is derived from a mahematical series, and i garuntee, even if you don't like maths, you will love this if you pay attention\nThis series starts with the number 0, and the next number is the sum of the previous two numbers, so the next number is zero too\nAnd this way all numbers are zero, and this goes till infinite! But that ai'nt very fun, so let's add a one\n Who knew this one could change every thing, a single digit change could lead to an infinite number series that is so evindent and striking,\n You would be absolutely shocked.");
		System.out.println("Hey, *snaps*, are you at par with me, click any NUMBER key to proceed, extra credits to you for being soo into this");
		int jj = sc.nextInt();
		System.out.println("Alright, so the series went on, forever, and two adjacent numbers when ratio'ed, gave a number that was a pretty good approximation of 1.618\nSo, other places this ratio is found include your face, nose, eyes, body, a flower, many 5-star hotels, forests, lakes\n God-Like cave systems, continent's placements and the galaxies.\nNow if you don't feel interested, i don't know what will, but i am not the judge of that and you can leave this adventure. (Press any NUMBER key to continue)");
		int kk = sc.nextInt();
		System.out.println("So, now i feel you know a lot about the golden number and kind of feel it's presence,\n but i think we need to step this up one level and show you the practicalities of this beautiful number with a bit of programming\nSince you have adventured across this beautiful journey with me, i think you deserve special treatment ;)");
	}

	void iterations() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of numbers you want in the fibonacci series : ");
		int n = in.nextInt();
		System.out.println("0\n1");
		int i = 0, j = 1, sum = 1;
		for (int a = 1; a <= n; a++) {
			System.out.println(sum);
			i = j;
			j = sum;
			sum = (i + j);
		}
		System.out.println("You can take your time and analyse the whole series, and voluntarily deduce patterns from this on your own, and press any NUMBER key to continue");
		int qq = in.nextInt();
		System.out.println("So, you asked for the first " + n + " numbers of the fibonnaci series, good choice on the number of iterations.");
		double gold = (sum / j);
		System.out.println("You have got the ratio of the last two numbers in the series you generated to be : " + gold);
	}
}

