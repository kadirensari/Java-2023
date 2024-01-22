package abcd.example.util.string;

import java.util.Random;

public final class StringUtil {

    private static final String LETTERS_LOWER_CASE_EN;
    private static final String LETTERS_LOWER_CASE_TR;
    private static final String LETTERS_UPPER_CASE_EN;
    private static final String LETTERS_UPPER_CASE_TR;
    private static final String LETTERS_EN;
    private static final String LETTERS_TR;

    static {
        LETTERS_LOWER_CASE_EN = "abcdefghijklmnopqrstuvwxyz";
        LETTERS_LOWER_CASE_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
        LETTERS_UPPER_CASE_EN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        LETTERS_UPPER_CASE_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
        LETTERS_EN = LETTERS_LOWER_CASE_EN + LETTERS_UPPER_CASE_EN;
        LETTERS_TR = LETTERS_LOWER_CASE_TR + LETTERS_UPPER_CASE_TR;
    }

    private StringUtil(){}

    public static String capitalize(String str)
    {
        return str.isEmpty() ? "" : Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    public static int countString(String str1, String str2)
    {
        int count = 0;
        int idx = 0;

        while((idx = str1.indexOf(str2, idx)) != -1) {
            count++;
            idx++;
        }
        return count;
    }

    public static int countStringIgnoreCase(String str1, String str2)
    {
        return countString(str1.toLowerCase(), str2.toLowerCase());
    }

    public static char firstNotRepeatingCharacter(String str)
    {
        int[] counts = new int[26];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            counts[ch - 'a']++;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(counts[ch - 'a'] == 1)
                return ch;
        }

        return '_';
    }

    public static String generateRandomText(Random r, int len, String letters)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++)
            sb.append(letters.charAt(r.nextInt(letters.length())));
        return sb.toString();
    }

    public static String generateRandomTextEN(Random r, int len)
    {
        return generateRandomText(r, len, LETTERS_EN);
    }

    public static String generateRandomTextTR(Random r, int len)
    {
        return generateRandomText(r, len, LETTERS_TR);
    }

    public static String join(String[] strArr, String sep)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strArr.length; i++)
            sb.append(strArr[i]).append(sep);

        return sb.substring(0, sb.length() - sep.length());
    }

    public static String padLeading(String str, int len, char ch)
    {
        return len < str.length() ? str : (ch + "").repeat(len - str.length()) + str;
    }

    public static String padLeading(String str, int len)
    {
        return padLeading(str, len, ' ');
    }

    public static String padTrailing(String str, int len, char ch)
    {
        return len < str.length() ? str : str + (ch + "").repeat(len - str.length());
    }

    public static String padTrailing(String str, int len)
    {
        return padTrailing(str, len, ' ');
    }

    public static String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    public static String trimLeading(String str)
    {
        int idx = 0;
        while (idx < str.length() && Character.isWhitespace(str.charAt(idx)))
            idx++;

        return str.substring(idx);
    }

    public static String trimTrailing(String str)
    {
        int idx = str.length() - 1;
        while (idx >= 0 && Character.isWhitespace(str.charAt(idx)))
            idx--;
        return str.substring(0, idx + 1);
    }


}
