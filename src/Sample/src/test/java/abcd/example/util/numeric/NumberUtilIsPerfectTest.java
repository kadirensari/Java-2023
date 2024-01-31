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
public class NumberUtilIsPerfectTest {
    public IntBooleanDataInfo dataInfo;

    public NumberUtilIsPerfectTest(IntBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntBooleanDataInfo> createData()
    {
        return List.of(
                new IntBooleanDataInfo(1, true),
                new IntBooleanDataInfo(6, true),
                new IntBooleanDataInfo(28, true),
                new IntBooleanDataInfo(496, true),
                new IntBooleanDataInfo(8128, true),
                new IntBooleanDataInfo(2, false),
                new IntBooleanDataInfo(3, false),
                new IntBooleanDataInfo(66, false),
                new IntBooleanDataInfo(1234, false),
                new IntBooleanDataInfo(-1234, false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isPerfect(dataInfo.input));
    }

}
