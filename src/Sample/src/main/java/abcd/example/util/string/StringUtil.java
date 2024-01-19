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


}
