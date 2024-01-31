package abcd.example.util.numeric;

import abcd.example.util.numeric.data.IntBooleanDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilIsDecimalHarshadTest {
    public IntBooleanDataInfo dataInfo;

    public NumberUtilIsDecimalHarshadTest(IntBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntBooleanDataInfo> createData()
    {
        return List.of(
                new IntBooleanDataInfo(1, true),
                new IntBooleanDataInfo(2, true),
                new IntBooleanDataInfo(3, true),
                new IntBooleanDataInfo(4, true),
                new IntBooleanDataInfo(5, true),
                new IntBooleanDataInfo(6, true),
                new IntBooleanDataInfo(7, true),
                new IntBooleanDataInfo(8, true),
                new IntBooleanDataInfo(9, true),
                new IntBooleanDataInfo(10, true),
                new IntBooleanDataInfo(11, false),
                new IntBooleanDataInfo(12, true),
                new IntBooleanDataInfo(13, false),
                new IntBooleanDataInfo(14, false),
                new IntBooleanDataInfo(15, false),
                new IntBooleanDataInfo(16, false),
                new IntBooleanDataInfo(17, false),
                new IntBooleanDataInfo(18, true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isDecimalHarshad(dataInfo.input));
    }

}
