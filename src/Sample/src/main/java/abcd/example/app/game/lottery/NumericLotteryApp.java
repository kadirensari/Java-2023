package abcd.example.app.game.lottery;

import abcd.example.random.lottery.NumericLottery;
import java.util.Random;
import java.util.Scanner;

public class NumericLotteryApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("How many times to play?: ");
        int n = kb.nextInt();

        while(n-- > 0) {
            System.out.println("-----------------------------------------------");
            System.out.println("Game started");
            NumericLottery lot = new NumericLottery(r);
            lot.play();
            System.out.println("-----------------------------------------------");
        }
    }
}
