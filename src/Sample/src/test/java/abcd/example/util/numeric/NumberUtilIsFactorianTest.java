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
public class NumberUtilIsFactorianTest {
    public IntBooleanDataInfo dataInfo;


    public NumberUtilIsFactorianTest(IntBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntBooleanDataInfo> createData()
    {
        return List.of(
                new IntBooleanDataInfo(0, false),
                new IntBooleanDataInfo(1, true),
                new IntBooleanDataInfo(2, true),
                new IntBooleanDataInfo(3, false),
                new IntBooleanDataInfo(10, false),
                new IntBooleanDataInfo(101, false),
                new IntBooleanDataInfo(145, true),
                new IntBooleanDataInfo(40585, true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isFactorian(dataInfo.input));
    }

}
