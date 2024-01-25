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
public class StringUtilIsAnagramTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input1;
        public String input2;
        public boolean expected;

        public DataInfo(String input1, String input2, boolean expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public StringUtilIsAnagramTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("bart", "brat", true),
                new DataInfo("bart", "bret", false),
                new DataInfo("", "", true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.isAnagram(dataInfo.input1, dataInfo.input2));
    }


}
