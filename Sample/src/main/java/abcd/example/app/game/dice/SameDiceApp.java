package abcd.example.app.game.dice;

import abcd.example.simulation.dice.SameDiceSimulation;
import java.util.Random;
import java.util.Scanner;

public class SameDiceApp {
    public static void main(String[] args)
    {
        run();
    }

    static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while(true) {
            System.out.print("How many times to play?: ");
            int n = kb.nextInt();

            if (n == 0)
                break;

            SameDiceSimulation s = new SameDiceSimulation();
            s.play(n, r);
        }

        System.out.println("-----------------------------------");
        System.out.println("The End");
        System.out.println("-----------------------------------");
    }
}