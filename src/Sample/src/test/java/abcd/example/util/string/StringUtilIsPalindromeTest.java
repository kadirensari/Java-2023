package abcd.example.util.string;

import abcd.example.util.string.data.StringBooleanDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilIsPalindromeTest {

    public StringBooleanDataInfo dataInfo;

    public StringUtilIsPalindromeTest(StringBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringBooleanDataInfo> createData()
    {
        return List.of(
                new StringBooleanDataInfo("Anastas mum satsana", true),
                new StringBooleanDataInfo("Ey Edip Adana'da pide ye", true),
                new StringBooleanDataInfo("Ali Papila", true),
                new StringBooleanDataInfo("Anastas mum satsanaa", false),
                new StringBooleanDataInfo("example", false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.isPalindrome(dataInfo.input));
    }

}
