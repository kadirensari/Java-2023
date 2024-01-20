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
public class StringUtilReverseTest {
    public StringStringDataInfo dataInfo;

    public StringUtilReverseTest(StringStringDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringStringDataInfo> createData()
    {
        return List.of(
                new StringStringDataInfo("example", "elpmaxe"),
                new StringStringDataInfo("", ""),
                new StringStringDataInfo(" ", " "),
                new StringStringDataInfo("Example", "elpmaxE")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.reverse(dataInfo.input));
    }

}
