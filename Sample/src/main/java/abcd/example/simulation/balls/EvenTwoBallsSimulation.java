/*------------------------------------------------------------------------------
Assuming there are balls numbered between 1-99 (inclusive) in a bag and two balls
are picked randomly. Simulate the probability of picking two even numbered balls.
------------------------------------------------------------------------------*/

package abcd.example.simulation.balls;

import java.util.Random;

public class EvenTwoBallsSimulation {
    public void run(int n, Random r)
    {
        int win = 0;
        int ball1, ball2;
        for(int i = 0; i < n; i++) {
            ball1 = getBall1(r);
            ball2 = getBall2(ball1, r);
            if(ball1 % 2 == 0 && ball2 % 2 == 0)
                win++;
        }
        printResults(win, n);
    }

    private int getBall1(Random r)
    {
        return r.nextInt(1,100);
    }

    private int getBall2(int ball1, Random r)
    {
        int ball2;
        while((ball2 = r.nextInt(1,100)) == ball1)
            ;
        return ball2;
    }

    private void printResults(int win, int n)
    {
        System.out.println("-----------------------------------");
        System.out.printf("Win prob --> %f%n", (double)win/n);
        System.out.println("-----------------------------------");
    }

}
