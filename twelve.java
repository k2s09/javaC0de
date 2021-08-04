// Finding the first triangle number which has more than 500 factors
public class twelve {
    public static void main(String[] args) {
        int flag = 0;
        for (int i = 1; flag == 0; i++) {
            int triangleNo = (i * (i + 1)) / 2;
            if (noOfFactors(triangleNo) > 500) {
                System.out.println(triangleNo);
                flag += 1;
                System.exit(0);
            }
        }
    }

    public static int noOfFactors(int num) {
        int count = 2;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                count += 1;
        }
        return count;
    }
}
