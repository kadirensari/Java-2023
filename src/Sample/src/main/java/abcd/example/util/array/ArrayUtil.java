package abcd.example.util.array;

import java.util.Random;
import abcd.example.util.numeric.NumberUtil;

public final class ArrayUtil {
    private ArrayUtil(){}

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
        print(1, a);
    }

    public static void reverse(int[] a)
    {
        int left = 0;
        int right = a.length -1;

        while(left < right)
            swap(a, left++, right--);
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

}
