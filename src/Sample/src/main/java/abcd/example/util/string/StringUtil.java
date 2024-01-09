package abcd.example.util.string;

public final class StringUtil {
    private StringUtil(){}

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

}
