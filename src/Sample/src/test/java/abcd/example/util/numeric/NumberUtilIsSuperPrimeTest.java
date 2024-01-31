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
public class NumberUtilIsSuperPrimeTest {
    public DataInfo dataInfo;
    static class DataInfo {
        public long input;
        public boolean expected;

        public DataInfo(long input, boolean expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public NumberUtilIsSuperPrimeTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(1, false),
                new DataInfo(2, false),
                new DataInfo(3, true),
                new DataInfo(5, true),
                new DataInfo(7, false),
                new DataInfo(11, true),
                new DataInfo(17, true),
                new DataInfo(31, true),
                new DataInfo(41, true),
                new DataInfo(59, true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isSuperPrime(dataInfo.input));
    }

}
