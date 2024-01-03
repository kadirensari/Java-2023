package abcd.example.util.time;

public final class TimeUtil {
    private TimeUtil(){}

    public static String getDuration(long seconds)
    {

        if(seconds < 0)
            return "Invalid Input!";

        StringBuilder sb = new StringBuilder();

        int hrs = (int)(seconds / 3600);
        int mins = (int)(seconds / 60 % 60);
        int secs = (int)(seconds % 60);

        sb.append(String.format("%02d:", hrs));
        sb.append(String.format("%02d:", mins));
        sb.append(String.format("%02d", secs));

        return sb.toString();
    }

}
