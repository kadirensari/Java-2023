package abcd.example.util.numeric;

public final class NumberUtil {
    private NumberUtil(){}

    public static int countDigits(long num)
    {
        if(num == Long.MIN_VALUE) // Math.abs won't return the abs value of Long.MIN_VALUE because of the constraints.
            return 19;

        return num == 0 ? 1 : (int)Math.log10(Math.abs(num)) + 1;
    }

    public static int sumDigits(long num)
    {
        if(num == Long.MIN_VALUE) // Math.abs won't return the abs value of Long.MIN_VALUE because of the constraints.
            return 89;

        num = Math.abs(num);
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }



}
