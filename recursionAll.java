import java.util.Arrays;
public class recursionAll {
    public static void main(String[] args) {
        System.out.println(sumOfN(10));
        System.out.println(multiplication(4, 5));
        System.out.println(power(2, 3));
        System.out.println(factorial(5));
        System.out.println(reverse1("hello"));
        char[] word = {'h','e','l','l','o'};
        System.out.println(reverse2(word, word.length, 0));
        int[] arr = {2, 4, 1, 5, 3};
        System.out.println(linearSearch(arr, 3, 0));
        bubbleSort(arr, 0, 0);
        System.out.println(binarySearch(arr, 0, 4, 3));

    }
    static int sumOfN(int n) {
        if (n == 0)
            return 0;
        return n + sumOfN(--n);
    }
    static int multiplication(int a, int b) {
        if (b == 0)
            return 0;
        return a + multiplication(a, --b);
    }
    static int power(int a, int b) {
        if (b == 1)
            return a;
        return a * power(a, --b);
    }
    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * (factorial(--n));
    }
    static String reverse1(String s) {
        // Number of iterations = length of string
        if (s.length() == 0)
            return s;
        return reverse1(s.substring(1)) + s.charAt(0);
    }
    static char[] reverse2(char[] str, int length, int i) {
        // Number of iterations is halved
        if (i == str.length/2)
            return str;
        char tmp = str[i];
        str[i] = str[length-i-1];
        str[length-i-1] = tmp;
        return reverse2(str, length, ++i);
    }
    static int linearSearch(int[] arr, int e, int i) {
        if (i == arr.length-1)
            return -1;
        if (arr[i] == e)
            return i;
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
/*
1) Sum of n numbers
2) Multiplication of two numbers
3) Power of a number
4) Factorial of a number
5) Reverse a string
6) Reverse an array
7) Linear Search
8) Binary Search
9) Binary to Decimal
10) Decimal to Binary
11) Bubble sort
12) Selection sort
13) Fibonacci Series
14) HCF and LCM
15) Sum of digits
16) Permutations of a string
 */