package abcd.example.app.game.balls;

import abcd.example.simulation.balls.EvenTwoBallsSimulation;
import java.util.Random;
import java.util.Scanner;

public class EvenTwoBallsApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while(true) {
            System.out.print("How many times to play?: ");
            int n = kb.nextInt();

            if (n == 0)
                break;

            EvenTwoBallsSimulation s = new EvenTwoBallsSimulation();
            s.run(n, r);
        }

        System.out.println("-----------------------------------");
        System.out.println("The End");
        System.out.println("-----------------------------------");

    }
}
