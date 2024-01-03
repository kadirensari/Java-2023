package abcd.example.util.numeric;

public final class NumberUtil {
    private NumberUtil(){}

    public static int countDigits(long num)
    {
        if(num == Long.MIN_VALUE) // Math.abs won't return the abs value of Long.MIN_VALUE because of constraints.
            return 19;

        return num == 0 ? 1 : (int)Math.log10(Math.abs(num)) + 1;
    }

    public static int fibonacciNumber(int n)
    {
        if(n < 3)
            return n - 1;

        int num1 = 0, num2 = 1, num3 = 1;
        for(int i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }

    public static boolean isPrime(long num)
    {
        if(num < 2)
            return false;
        if(num % 2 == 0)
            return num == 2;
        if(num % 3 == 0)
            return num == 3;
        if(num % 5 == 0)
            return num == 5;
        if(num % 7 == 0)
            return num == 7;
        for(long i = 11; i * i <= num; i += 2)
            if(num % i == 0)
                return false;
        return true;
    }

    public static boolean isPrimeX(long num)
    {
        if(isPrime(num)) {
            while (num > 9) {
                num = sumDigits(num);
                if(!isPrime(num))
                    return false;
            }
            return isPrime(num);
        }
        return false;
    }


    public static int mid(int num1, int num2, int num3)
    {
        if(num1 <= num2 && num1 >= num3 || num1 <= num3 && num1 >= num2)
            return num1;
        if(num2 <= num1 && num2 >= num3 || num2 <= num3 && num2 >= num1)
            return num2;
        return num3;
    }

    public static long reverse(int num)
    {
        long res = 0;
        while(num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }

    public static int sumDigits(long num)
    {
        if(num == Long.MIN_VALUE) // Math.abs won't return the abs value of Long.MIN_VALUE because of constraints.
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
