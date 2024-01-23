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
public class StringUtilIsPangramENTest {
    public StringBooleanDataInfo dataInfo;

    public StringUtilIsPangramENTest(StringBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringBooleanDataInfo> createData()
    {
        return List.of(
                new StringBooleanDataInfo("The quick brown fox jumps over the lazy dog", true),
                new StringBooleanDataInfo("The quick brown fox jumps over he lazy dog", true),
                new StringBooleanDataInfo("The quick rown fox jumps over the lazy dog", false),
                new StringBooleanDataInfo("", false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.isPangramEN(dataInfo.input));
    }

}
