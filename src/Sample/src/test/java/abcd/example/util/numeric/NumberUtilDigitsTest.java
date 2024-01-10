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
public class NumberUtilDigitsTest {

    public DataInfo dataInfo;

    static class DataInfo {
        public long input1;
        public int input2;
        public int expectedLength;

        public DataInfo(long input1, int input2, int expectedLength)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expectedLength = expectedLength;
        }
    }

    public NumberUtilDigitsTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(12345, 1, 5),
                new DataInfo(-12345, 1, 5),
                new DataInfo(12345, 2, 3),
                new DataInfo(12345, 3, 2),
                new DataInfo(12345, 5, 1)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expectedLength, NumberUtil.digits(dataInfo.input1, dataInfo.input2).length);
    }
}
