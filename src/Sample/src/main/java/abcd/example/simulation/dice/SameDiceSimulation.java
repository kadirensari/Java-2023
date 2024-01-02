package abcd.example.simulation.dice;

import java.util.Random;

public class SameDiceSimulation {

    public void run(int n, Random r)
    {
        int win = 0;
        for(int i = 0; i < n; i++)
            if(r.nextInt(1,7) == r.nextInt(1,7))
                win++;
        printResults(win, n);
    }

    private void printResults(int win, int n)
    {
        System.out.println("-----------------------------------");
        System.out.printf("Win prob --> %f%n", (double)win/n);
        System.out.println("-----------------------------------");
    }

}
