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
public class StringUtilSqueezeTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input1;
        public String input2;
        public String expected;

        public DataInfo(String input1, String input2, String expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public StringUtilSqueezeTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("example", "ae", "xmpl"),
                new DataInfo("example", "a", "exmple"),
                new DataInfo("example", "example", ""),
                new DataInfo("example", "bdc", "example")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.squeeze(dataInfo.input1, dataInfo.input2));
    }

}
