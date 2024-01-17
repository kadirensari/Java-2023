package abcd.example.util.thread;

public final class ThreadUtil {

    private ThreadUtil(){}

    public static void sleep(long ms)
    {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ignore) {

        }
    }

}
