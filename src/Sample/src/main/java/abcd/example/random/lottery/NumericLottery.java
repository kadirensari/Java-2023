package abcd.example.random.lottery;

import java.util.Random;
import abcd.example.util.array.ArrayUtil;

public class NumericLottery {

    private final Random r;

    public NumericLottery(Random r)
    {
        this.r = r;
    }

    public void play()
    {
        int[] numbers = getNumbers();
        printLottery(numbers);
    }

    private int[] getNumbers()
    {
        int[] numbers = new int[6];
        int idx = 0;

        boolean[] flags = getFlags();
        int counter = 0;

        for(int i = 1; i < flags.length; i++) {
            if(flags[i]) {
                counter++;
                numbers[idx++] = i;
            }
            if(counter == numbers.length)
                break;
        }
        return numbers;
    }

    private boolean[] getFlags()
    {
        boolean[] flags = new boolean[50];

        for(int i = 0; i < 6; i++) {
            while(true) {
                int num = r.nextInt(1, 50);
                if(!flags[num]) {
                    flags[num] = true;
                    break;
                }
            }
        }
        return flags;
    }

    private void printLottery(int[] numbers)
    {
        ArrayUtil.print(2, numbers);
    }

}
