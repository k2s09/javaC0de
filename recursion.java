import java.util.Arrays;
public class recursion {
    public static void main(String[] args) {
        System.out.println(multiply(4, 5));
        System.out.println(exponent(2, 3));
        System.out.println(factorial(5));
        System.out.println(sumOfNaturalNumbers(10));
        System.out.println(reverse("Hello!"));
        System.out.println(reverse2(new char[]{'h', 'e', 'l', 'l', 'o'}, 0));
        System.out.println(linearSearch(new int[]{1, 2, 3, 4, 5}, 3, 0));
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 0, 4, 3));
        bubbleSort(new int[]{3, 2, 5, 4, 1}, 0, 0);
    }

    static int multiply(int a, int b) {
        if (b == 0)
            return 0;
        return a + multiply(a, --b);
    }

    static int exponent(int a, int b) {
        if (b == 0)
            return 1;
        return a * exponent(a, --b);
    }

    static int factorial(int a) {
        if (a == 1)
            return a;
        return a * factorial(--a);
    }

    static int sumOfNaturalNumbers(int n) {
        // n + n-1 + n-2 + n-3 + ... + 1
        if (n == 0)
            return 0;
        return n + sumOfNaturalNumbers(--n);
    }

    static String reverse(String s) {
        if (s.length() == 0)
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    static String reverse2(char[] str, int i) {
        if (i == str.length/2) {
            return String.valueOf(str);
        }
        char tmp = str[i];
        str[i] = str[str.length-i-1];
        str[str.length-i-1] = tmp;
        return reverse2(str, ++i);
    }

    static int linearSearch(int[] arr, int e, int i) {
        if (arr[i] == e)
            return i;
        if (i == arr.length-1)
            return -1;
        return linearSearch(arr, e, ++i);
    }

    static int binarySearch(int[] arr, int l, int u, int e) {
        if (l > u)
            return -1;
        int m = (l+u)/2;
        while (l <= u) {
            if (arr[m] == e)
                return m;
            if (arr[m] < e)
                u = m - 1;
            else
                l = m + 1;
        }
        return binarySearch(arr, l, u, e);
    }

    static void bubbleSort(int[] arr, int i, int j) {
        if (j == arr.length - i - 1) {
            if (i != arr.length - 2) {
                bubbleSort(arr, ++i, 0);
            }
            else {
                System.out.println(Arrays.toString(arr));
            }
        }
        else {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubbleSort(arr, i, ++j);
        }
    }
}