import java.util.Scanner;

class Linear {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter integers");
        for (int i = 0; i < 10; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter element : ");
        int element = Sc.nextInt();
        int flag = 0;
        for (int j = 0; j < 10; j++) {
            if (element == arr[j])
                System.out.println("Element Found, element number : " + j);
            ++flag;
            break;
        }
        if (flag == 0)
            System.out.println("Element was not found");
    }
}