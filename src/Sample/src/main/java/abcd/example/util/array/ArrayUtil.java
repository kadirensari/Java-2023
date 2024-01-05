package abcd.example.util.array;

import java.util.Random;

public final class ArrayUtil {
    private ArrayUtil(){}



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

    public static int[] generateRandomArray(Random r, int size, int min, int bound)
    {
        int[] res = new int[size];
        for(int i = 0; i < res.length; i++)
            res[i] = r.nextInt(min, bound);
        return res;
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


}
