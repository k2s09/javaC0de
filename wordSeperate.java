public class wordSeperate {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        int element = 4;

        int l = 0;
        int u = arr.length-1;
        int m;
        int flag = 0;
        while (l <= u) {
            m = (l+u)/2;
            if (arr[m] > element) {
                l = m + 1;
            }
            if (arr[m] < element) {
                u = m - 1;
            }
            else {
                System.out.println("Element found at " + (m+1) + "th index");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found");
        }
    }
}