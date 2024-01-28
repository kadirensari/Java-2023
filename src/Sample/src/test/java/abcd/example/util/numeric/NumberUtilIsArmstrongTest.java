package abcd.example.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilIsArmstrongTest {
    public DataInfo dataInfo;
    static class DataInfo {
        public int input;
        public boolean expected;

        public DataInfo(int input, boolean expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilIsArmstrongTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(1, true),
                new DataInfo(2, true),
                new DataInfo(3, true),
                new DataInfo(4, true),
                new DataInfo(5, true),
                new DataInfo(6, true),
                new DataInfo(7, true),
                new DataInfo(8, true),
                new DataInfo(9, true),
                new DataInfo(10, false),
                new DataInfo(153, true),
                new DataInfo(1634, true),
                new DataInfo(154, false),
                new DataInfo(1632, false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isArmstrong(dataInfo.input));
    }

}
