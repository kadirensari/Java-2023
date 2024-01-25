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
public class StringUtilWrapWithStrStrStrTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input1;
        public String input2;
        public String input3;
        public String expected;

        public DataInfo(String input1, String input2, String input3, String expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
            this.expected = expected;
        }
    }

    public StringUtilWrapWithStrStrStrTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("example", "aa", "bb", "aaexamplebb"),
                new DataInfo("", "example", "a", "examplea"),
                new DataInfo("example", "", "", "example"),
                new DataInfo("example", "aa", "", "aaexample"),
                new DataInfo("example", "", "aa", "exampleaa")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.wrapWith(dataInfo.input1, dataInfo.input2, dataInfo.input3));
    }

}
