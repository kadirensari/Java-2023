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
public class NumberUtilIsPrimeXTest {
    public DataInfo dataInfo;

    static class DataInfo {
        long input;
        boolean expected;

        DataInfo(long input, boolean expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilIsPrimeXTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(2, true),
                new DataInfo(3, true),
                new DataInfo(5, true),
                new DataInfo(7, true),
                new DataInfo(43, true),
                new DataInfo(83, true),
                new DataInfo(0, false),
                new DataInfo(-1, false),
                new DataInfo(13, false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isPrimeX(dataInfo.input));
    }

}
