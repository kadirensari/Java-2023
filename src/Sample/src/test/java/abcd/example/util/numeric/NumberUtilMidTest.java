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
public class NumberUtilMidTest {
    public DataInfo dataInfo;

    static class DataInfo {
        int input1, input2, input3;
        int expected;

        public DataInfo(int input1, int input2, int input3, int expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
            this.expected = expected;
        }
    }

    public NumberUtilMidTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(-1, 0, 1, 0),
                new DataInfo(0, 1, 2, 1),
                new DataInfo(-1, -3, -2, -2),
                new DataInfo(19, 1, 18, 18),
                new DataInfo(7, 8, 6, 7),
                new DataInfo(2,2,3, 2),
                new DataInfo(5,5,5,5)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.mid(dataInfo.input1, dataInfo.input2, dataInfo.input3));
    }

}
