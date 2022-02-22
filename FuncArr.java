import java.util.Scanner;

class FuncArr {
	public static void main(String args[]) {
		// Arrays for different parameters
		int eng[] = new int[3];
		int mat[] = new int[3];
		int scs[] = new int[3];
		double sum[] = new double[3];
		double per[] = new double[3];
		String name[] = new String[3];
		FuncArr o = new FuncArr();
		Scanner Sc = new Scanner(System.in);
		Scanner S = new Scanner(System.in);
		int i = 1;
		System.out.println("Welcome first student");
		System.out.print("Enter name : ");
		// Marks to be entered out of 80
		System.out.print("Enter marks of english : ");
		eng[i] = S.nextInt();
		System.out.print("Enter marks of maths : ");
		mat[i] = S.nextInt();
		System.out.print("Enter marks of sciences : ");
		scs[i] = S.nextInt();
		sum[i] = (eng[i] + mat[i] + scs[i]);
		per[i] = ((sum[i] / 240) * 100);
		i++;
		System.out.println("Welcome second student");
		System.out.print("Enter name : ");
		// Marks to be entered out of 80
		System.out.print("Enter marks of english : ");
		eng[i] = S.nextInt();
		System.out.print("Enter marks of maths : ");
		mat[i] = S.nextInt();
		System.out.print("Enter marks of sciences : ");
		scs[i] = S.nextInt();
		sum[i] = (eng[i] + mat[i] + scs[i]);
		per[i] = ((sum[i] / 240) * 100);
		i++;
		System.out.println("Welcome third student");
		System.out.print("Enter name : ");
		// Marks to be entered out of 80
		System.out.print("Enter marks of english : ");


		System.out.print("Enter marks of maths : ");
		mat[i] = S.nextInt();
		System.out.print("Enter marks of sciences : ");
		scs[i] = S.nextInt();
		sum[i] = (eng[i] + mat[i] + scs[i]);
		per[i] = ((sum[i] / 240) * 100);
		i++;
		System.out.println("\n\n");
		System.out.println("Name \t English \t Maths \t Science \t Total \t Percentile");
		System.out.println(name[1] + "\t" + eng[1] + "\t" + mat[1] + "\t" + scs[1] + "\t" + sum[1] + "\t" + per[1]);
		System.out.println(name[2] + "\t" + eng[2] + "\t" + mat[2] + "\t" + scs[2] + "\t" + sum[2] + "\t" + per[2]);
		System.out.println(name[3] + "\t" + eng[3] + "\t" + mat[3] + "\t" + scs[3] + "\t" + sum[3] + "\t" + per[3]);
	}
}

        