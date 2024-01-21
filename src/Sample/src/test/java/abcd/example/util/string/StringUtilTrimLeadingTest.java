package abcd.example.util.string;

import abcd.example.util.string.data.StringStringDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilTrimLeadingTest {
    public StringStringDataInfo dataInfo;

    public StringUtilTrimLeadingTest(StringStringDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringStringDataInfo> createData()
    {
        return List.of(
                new StringStringDataInfo("", ""),
                new StringStringDataInfo(" ", ""),
                new StringStringDataInfo("  example", "example"),
                new StringStringDataInfo("  example ", "example ")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.trimLeading(dataInfo.input));
    }

}
