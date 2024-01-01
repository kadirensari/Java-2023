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
public class NumberUtilCountDigitsTest {
    public LongIntDataInfo dataInfo;

    public NumberUtilCountDigitsTest(LongIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<LongIntDataInfo> createData()
    {
        return List.of(new LongIntDataInfo(123, 3),
                new LongIntDataInfo(-123, 3),
                new LongIntDataInfo(0, 1),
                new LongIntDataInfo(Long.MAX_VALUE, 19),
                new LongIntDataInfo(Long.MIN_VALUE, 19));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.countDigits(dataInfo.input));
    }

}
