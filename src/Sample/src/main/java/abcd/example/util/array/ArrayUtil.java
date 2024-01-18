package abcd.example.util.array;

import java.util.Random;
import abcd.example.util.numeric.NumberUtil;

public final class ArrayUtil {
    private ArrayUtil(){}

    public static void addBy(int[] a, int num)
    {
        for(int i = 0; i < a.length; i++)
            a[i] += num;
    }

    public static void addBy(int[][] a, int num)
    {
        for(int[] arr: a)
            addBy(arr, num);
    }

    public static int binarySearch(int[] a, int num)
    {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (num == a[mid])
                return mid;
            if (num < a[mid])
                right = mid - 1;
            if(num > a[mid])
                left = mid + 1;
        }
        return -1;
    }

    public static void bubbleSort(int[] a, boolean descending)
    {
        if(descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    private static void bubbleSortDescending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
            for(int k = 0; k < a.length - 1 - i; k++)
                if(a[k + 1] > a[k])
                    swap(a, k + 1, k);
    }

    private static void bubbleSortAscending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
            for(int k = 0; k < a.length - 1 - i; k++)
                if(a[k + 1] < a[k])
                    swap(a, k + 1, k);
    }

    public static int[] digits(long num)
    {
        num = Math.abs(num);
        int[] res = new int[NumberUtil.countDigits(num)];

        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = (int)(num % 10);
            num /= 10;
        }
        return res;
    }

    public static void drawHistogram(int[] data, int n, char ch)
    {
        int max = max(data);

        for(int num : data) {
            int count = (int)Math.floor(num * n / (double)max);

            while(count-- > 0)
                System.out.print(ch);

            System.out.println();
        }
    }

    public static void fillRandomArray(Random r, int[] a, int min, int bound)
    {
        for(int i = 0; i < a.length; i++)
            a[i] = r.nextInt(min, bound);
    }

    public static void fillRandomArray(Random r, int[][] a, int min, int bound)
    {
        for(int i = 0; i < a.length; i++)
            for(int k = 0; k < a[i].length; k++)
                a[i][k] = r.nextInt(min, bound);
    }

    public static int[] generateRandomArray(Random r, int size, int min, int bound)
    {
        int[] res = new int[size];
        for(int i = 0; i < res.length; i++)
            res[i] = r.nextInt(min, bound);
        return res;
    }

    public static int[] histogramData(int[] a, int n)
    {
        int[] res = new int[n + 1];
        for(int num : a)
            res[num]++;
        return res;
    }

    public static int linearSearch(int[] a, int num)
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] == num)
                return i;
        return -1;
    }

    public static int max(int[] a)
    {
        int max = a[0];
        for(int num : a)
            max = Math.max(max, num);
        return max;
    }

    public static int min(int[] a)
    {
        int min = a[0];
        for(int num : a)
            min = Math.min(min, num);
        return min;
    }

    public static void multiplyBy(int[] a, int num)
    {
        for(int i = 0; i < a.length; i++)
            a[i] *= num;
    }

    public static void multiplyBy(int[][] a, int num)
    {
        for(int[] arr : a)
            multiplyBy(arr, num);
    }

    public static int partitionByThresholdGreater(int[] a, int threshold)
    {
        int idx = 0;

        while(idx < a.length && a[idx] > threshold)
            idx++;

        for(int i = idx + 1; i < a.length; i++)
            if(a[i] > threshold) {
                swap(a, i, idx);
                idx++;
            }
        return idx;
    }

    public static int partitionByThresholdLess(int[] a, int threshold)
    {
        int idx = 0;

        while(idx < a.length && a[idx] < threshold)
            idx++;

        for(int i = idx + 1; i < a.length; i++)
            if(a[i] < threshold) {
                swap(a, i, idx);
                idx++;
            }
        return idx;
    }

    public static void print(int n, int[] a)
    {
        String fmt = String.format("%%0%dd ", n);
        for(int num : a)
            System.out.printf(fmt, num);
        System.out.println();
    }

    public static void print(int[] a)
    {
        print(a, " ", "\n");
    }

    public static void print(int[][] a)
    {
        print(1, a);
    }

    public static void print(long[] a)
    {
        for(long num: a)
            System.out.printf("%d%n", num);
    }

    public static void print(double[] a)
    {
        for(double num : a)
            System.out.printf("%f%n", num);
    }

    public static void print(int[] a, String sep, String end)
    {
        for(int num: a)
            System.out.printf("%d%s", num, sep);
        System.out.print(end);
    }

    public static void print(String[] str)
    {
        print(str, "\n", "");
    }

    public static void print(String[] str, String sep, String end)
    {
        for(String s : str)
            System.out.printf("%s%s", s, sep);

        System.out.print(end);
    }

    public static void print(int n, int[][] a)
    {
        for(int[] arr : a)
            print(n, arr);
    }

    public static void reverse(int[] a)
    {
        int left = 0;
        int right = a.length - 1;

        while(left < right)
            swap(a, left++, right--);
    }

    public static void reverse(char[] a)
    {
        int left = 0;
        int right = a.length - 1;

        while(left < right)
            swap(a, left++, right--);
    }

    public static void selectionSort(int[] a, boolean descending)
    {
        if(descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    private static void selectionSortDescending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++) {
            int max = a[i];
            int p = i;

            for (int k = i + 1; k < a.length; k++)
                if(a[k] > max) {
                    max = a[k];
                    p = k;
                }
            a[p] = a[i];
            a[i] = max;
        }
    }

    private static void selectionSortAscending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int p = i;

            for (int k = i + 1; k < a.length; k++)
                if(a[k] < min) {
                    min = a[k];
                    p = k;
                }
            a[p] = a[i];
            a[i] = min;
        }
    }

    public static void subtractBy(int[] a, int num)
    {
        addBy(a, -num);
    }

    public static void subtractBy(int[][] a, int num)
    {
        addBy(a, -num);
    }

    public static int sum(int[] a)
    {
        int sum = 0;
        for(int num : a)
            sum += num;
        return sum;
    }

    private static void swap(int[] a, int idx1, int idx2)
    {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    private static void swap(char[] a, int idx1, int idx2)
    {
        char temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}
