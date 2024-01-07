package abcd.example.util.array;

import abcd.example.util.numeric.NumberUtil;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ArrayUtilDigitsTest {

    public DataInfo dataInfo;

    static class DataInfo {
        long input;
        int[] expected;

        public DataInfo(long input, int[] expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public ArrayUtilDigitsTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(123, new int[]{1, 2, 3}),
                new DataInfo(-123, new int[]{1, 2, 3}),
                new DataInfo(123123, new int[]{1, 2, 3, 1, 2, 3}),
                new DataInfo(0, new int[]{0})
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(NumberUtil.countDigits(dataInfo.input), dataInfo.expected.length);
        dataInfo.input = Math.abs(dataInfo.input);
        for(int i = dataInfo.expected.length - 1; i >= 0; i--) {
            Assert.assertEquals(dataInfo.expected[i], dataInfo.input % 10);
            dataInfo.input /= 10;
        }

    }

}
