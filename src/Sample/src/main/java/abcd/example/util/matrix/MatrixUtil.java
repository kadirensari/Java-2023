package abcd.example.util.matrix;

import abcd.example.util.array.ArrayUtil;

import java.util.Random;

public final class MatrixUtil {
    private MatrixUtil() {}

    public static int[][] generateRandomMatrix(Random r, int row, int col, int min, int bound)
    {
        int[][] res = new int[row][col];
        ArrayUtil.fillRandomArray(r, res, min, bound);
        return res;
    }

    public static int[][] generateRandomSquareMatrix(Random r, int n, int min, int bound)
    {
        return generateRandomMatrix(r, n, n, min, bound);
    }

    public static boolean isMatrix(int[][] a)
    {
        int size = a[0].length;
        for(int i = 1; i < a.length; i++)
            if(a[i].length != size)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int[][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

}
