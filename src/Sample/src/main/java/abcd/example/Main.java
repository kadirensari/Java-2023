package abcd.example;

import abcd.example.util.array.ArrayUtil;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        var a = ArrayUtil.generateRandomArray(new Random(), 10, 0, 51);
        ArrayUtil.print(2, a);
        ArrayUtil.selectionSort(a, true);
        ArrayUtil.print(2, a);
    }
}
