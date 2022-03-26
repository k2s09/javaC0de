public class recursion {

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
        if (s.length() == 0)
            return s;
        return reverse1(s.substring(1)) + s.charAt(0);
    }

    static char[] reverse2(char[] str, int length, int i) {
        if (i == str.length / 2)
            return str;
        char tmp = str[i];
        str[i] = str[length - i - 1];
        str[length - i - 1] = tmp;
        return reverse2(str, length, ++i);
    }

    static int linearSearch(int[] arr, int e, int i) {
        if (i == arr.length - 1)
            return -1;
        if (arr[i] == e)
            return i;
        return linearSearch(arr, e, ++i);
    }

    static int binarySearch(int[] arr, int l, int u, int e) {
        if (l > u)
            return -1;
        int m = (l + u) / 2;
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
            } else {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(i + " ");
                }
            }
        } else {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, ++j);
        }
    }

    static void selectionSort(int[] arr, int n, int i) {
        if (i == n)
            return;
        int k = minIndex(arr, i, n - 1);
        if (k != i) {
            int tmp = arr[k];
            arr[k] = arr[i];
            arr[i] = tmp;
        }
        selectionSort(arr, n, ++i);
    }

    static int minIndex(int[] arr, int c, int index) {
        if (c == arr.length - 2)
            return index;
        index = arr[c];
        if (index < arr[c + 1])
            return minIndex(arr, ++c, c + 1);
        return minIndex(arr, ++c, index);
    }

    static int fibo(int n, int i, int j, int tmp) {
        i = j;
        j = tmp;
        tmp = i + j;
        if (n == 0)
            return j + tmp;
        return fibo(--n, i, j, tmp);
    }

    static int hcf(int a, int b) {
        if (a == 0)
            return b;
        return hcf(b & a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    static int sumOfDigits(int n) {
        if (n < 10)
            return n;
        return sumOfDigits((n - (n % 10)) / 10) + n % 10;
    }

    static void allPermutations(String str, String tmp) {
        if (str.length() == 0) {
            System.out.print(tmp + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++)
            allPermutations(str.substring(0, i) + str.substring(i + 1), tmp + str.charAt(i));
    }

    static void circularPermutations(String str) {
        if (str.length() > 0) {
            String s = str.substring(1) + str.charAt(0);
            System.out.println(s);
            circularPermutations(s);
        }
    }

    static int decimalToBinary(int n) {
        if (n == 0)
            return 0;
        return n % 2 + 10 * decimalToBinary(n / 2);
    }

    static int binaryToDecimal(int n) {
        if (n == 0)
            return 0;
        return n % 10 + 2 * binaryToDecimal(n / 10);
    }

    static String removeAdjacentDuplicates(String str, int i) {
        if (i == str.length() - 2)
            return str;
        if (str.charAt(i) == str.charAt(i + 1)) {
            str = str.substring(0, i + 1) + str.substring(i + 2);
            return removeAdjacentDuplicates(str, ++i);
        }
        return removeAdjacentDuplicates(str, ++i);
    }

}