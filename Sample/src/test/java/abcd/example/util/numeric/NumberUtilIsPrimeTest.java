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
public class NumberUtilIsPrimeTest {
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

    public NumberUtilIsPrimeTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(new DataInfo(0, false),
                new DataInfo(1, false),
                new DataInfo(-1, false),
                new DataInfo(2, true),
                new DataInfo(3, true),
                new DataInfo(6750161072220585911L, true),
                new DataInfo(710584055392819667L, true),
                new DataInfo(4331452335614730577L, true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isPrime(dataInfo.input));
    }
}
