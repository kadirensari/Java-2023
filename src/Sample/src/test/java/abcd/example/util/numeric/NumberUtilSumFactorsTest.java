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
public class NumberUtilSumFactorsTest {
    public LongIntDataInfo dataInfo;

    public NumberUtilSumFactorsTest(LongIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<LongIntDataInfo> createData()
    {
        return List.of(
                new LongIntDataInfo(2, 1),
                new LongIntDataInfo(6, 6),
                new LongIntDataInfo(15, 9),
                new LongIntDataInfo(241, 1),
                new LongIntDataInfo(242, 157),
                new LongIntDataInfo(24252131254L, 2039486618)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.sumFactors(dataInfo.input));
    }

}
