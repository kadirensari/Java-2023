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
public class NumberUtilIsArmstrongTest {
    public IntBooleanDataInfo dataInfo;

    public NumberUtilIsArmstrongTest(IntBooleanDataInfo dataInfo)
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
                new IntBooleanDataInfo(10, false),
                new IntBooleanDataInfo(153, true),
                new IntBooleanDataInfo(1634, true),
                new IntBooleanDataInfo(154, false),
                new IntBooleanDataInfo(1632, false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isArmstrong(dataInfo.input));
    }

}
