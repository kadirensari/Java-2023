package abcd.example.util.numeric;

import abcd.example.util.numeric.data.LongIntDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilIndexOfPrimeTest {
    public LongIntDataInfo dataInfo;

    public NumberUtilIndexOfPrimeTest(LongIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<LongIntDataInfo> createData()
    {
        return List.of(
                new LongIntDataInfo(2, 1),
                new LongIntDataInfo(3, 2),
                new LongIntDataInfo(5, 3),
                new LongIntDataInfo(7, 4),
                new LongIntDataInfo(11, 5),
                new LongIntDataInfo(13, 6)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.indexOfPrime(dataInfo.input));
    }

}
