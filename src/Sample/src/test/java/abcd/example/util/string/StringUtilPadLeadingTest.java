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
public class StringUtilPadLeadingTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input1;
        public int input2;
        public char input3;
        public String expected;

        public DataInfo(String input1, int input2, char input3, String expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
            this.expected = expected;
        }
    }

    public StringUtilPadLeadingTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("example", 6, '*', "example"),
                new DataInfo("example", 8, '*', "*example"),
                new DataInfo("", 6, '*', "******")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.padLeading(dataInfo.input1, dataInfo.input2, dataInfo.input3));
    }

}
