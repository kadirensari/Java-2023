package abcd.example.util.string;

import abcd.example.util.string.data.StringStringIntDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilCountStringTest {
    public StringStringIntDataInfo dataInfo;

    public StringUtilCountStringTest(StringStringIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringStringIntDataInfo> createData()
    {
        return List.of(
                new StringStringIntDataInfo("xxx", "xx", 2),
                new StringStringIntDataInfo("abcd", "e", 0)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.countString(dataInfo.input1, dataInfo.input2));
    }

}
