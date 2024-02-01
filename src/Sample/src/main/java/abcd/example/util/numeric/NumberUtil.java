package abcd.example.util.numeric;

public final class NumberUtil {

    private static final String[] ONES;
    private static final String[] TENS;

    static {
        ONES = new String[]{"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        TENS = new String[]{"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
    }


    private NumberUtil(){}


    public static boolean areFriends(int num1, int num2)
    {
        return sumFactors(num1) == num2 && sumFactors(num2) == num1;
    }

    public static int calculateDigitalRoot(int num)
    {
        int res = sumDigits(num);

        while(res > 9)
            res = sumDigits(res);

        return res;
    }

    public static int countDigits(long num)
    {
        if(num == Long.MIN_VALUE) // Math.abs won't return the abs value of Long.MIN_VALUE because of constraints.
            return 19;

        return num == 0 ? 1 : (int)Math.log10(Math.abs(num)) + 1;
    }

    public static int[] digits(long num, int n)
    {
        num = Math.abs(num);
        int[] res = new int[num == 0 ? 1 : (int)(Math.log10(num) / n) + 1];
        int powOfTen = (int)Math.pow(10, n);

        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = (int)(num % powOfTen);
            num /= powOfTen;
        }
        return res;
    }

    public static int[] digitsInThrees(long num)
    {
        return digits(num, 3);
    }

    public static int[] digitsInTwos(long num)
    {
        return digits(num, 2);
    }

    public static int[] digits(long num)
    {
        return digits(num, 1);
    }

    public static long factorial(int num)
    {
        long res = 1;
        for(long i = num; i > 1; i--)
            res *= i;
        return res;
    }

    public static long factorialRecursive(int num)
    {
        if(num < 2)
            return 1;

        return num * factorial(num - 1);
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

    private static int getDigitsFactorialSum(int num)
    {
        int res = 0;
        while(num != 0) {
            res += factorial(num % 10);
            num /= 10;
        }

        return res;
    }

    public static int getDigitsPowSum(int num)
    {
        int digitCount = countDigits(num);
        int sum = 0;

        while(num != 0) {
            sum += (int)Math.pow(num % 10, digitCount);
            num /= 10;
        }
        return sum;
    }

    public static int getPrime(int n)
    {
        if(n < 1)
            return -1;

        int count = 0;
        int res = 2;
        while(true) {
            if(isPrime(res))
                count++;
            if(count == n)
                return res;
            res++;
        }
    }

    public static int hardyRamanujanCount(int n)
    {
        int count = 0;

        MAIN_LOOP:
        for(int a = 1; a * a * a < n; a++)
            for(int b = a + 1; a * a * a + b * b * b <= n; b++)
                if(a * a * a + b * b * b == n) {
                    count++;

                    if(count == 2)
                        break MAIN_LOOP;
                    a++;
                }
        return count;
    }

    public static int indexOfPrime(long num)
    {
        int idx = 1;
        long numTemp = 2;

        while(true) {
            if (numTemp == num)
                return idx;

            if(isPrime(numTemp))
                idx++;
            numTemp++;
        }
    }

    public static boolean isArmstrong(int num)
    {
        return num >= 0 && getDigitsPowSum(num) == num;
    }

    public static boolean isDecimalHarshad(int num)
    {
        return num >= 0 && num % sumDigits(num) == 0;
    }

    public static boolean isFactorian(int num)
    {
        return  num > 0 && getDigitsFactorialSum(num) == num;
    }

    public static boolean isHardyRamanujan(int num)
    {
        return num > 0 && hardyRamanujanCount(num) == 2;
    }

    public static boolean isPerfect(int num)
    {
        return sumFactors(num) == num;
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

    public static boolean isSuperPrime(long num)
    {
        return isPrime(num) && isPrime(indexOfPrime(num));
    }

    public static int mid(int num1, int num2, int num3)
    {
        if(num1 <= num2 && num1 >= num3 || num1 <= num3 && num1 >= num2)
            return num1;
        if(num2 <= num1 && num2 >= num3 || num2 <= num3 && num2 >= num1)
            return num2;
        return num3;
    }

    public static String numberToText3DigitsTR(long num)
    {
        String str = numberToText3DigitsTR((int)num);
        return str;
    }

    private static String numberToText3DigitsTR(int num)
    {
        return num == 0 ? "sıfır" : (num < 0 ? "eksi " : "") + numberToText3DigitsTR(Math.abs(num / 100), Math.abs(num / 10 % 10), Math.abs(num % 10));
    }

    private static String numberToText3DigitsTR(int a, int b, int c)
    {
        StringBuilder sb = new StringBuilder();

        if(a != 0) {
            if (a != 1)
                sb.append(ONES[a]).append(" ");
            sb.append("yüz ");
        }

        if(b != 0)
            sb.append(TENS[b]).append(" ");

        if(c != 0)
            sb.append(ONES[c]);

        return sb.toString();
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

    public static int sumFactors(long num)
    {
        int res = 1;
        long sqrt = (long)Math.sqrt(num);

        for(long i = 2; i <= sqrt; i++)
            if(num % i == 0)
                res += (int)((i == num / i) ? i : (i + num / i));

        return res;
    }


}
