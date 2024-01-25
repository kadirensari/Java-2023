package abcd.example.util.string;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilWrapWithStrChrTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input1;
        public char input2;
        public String expected;

        public DataInfo(String input1, char input2, String expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public StringUtilWrapWithStrChrTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("example", 'a', "aexamplea"),
                new DataInfo("", 'a', "aa"),
                new DataInfo("example", ' ', " example ")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.wrapWith(dataInfo.input1, dataInfo.input2));
    }

}
