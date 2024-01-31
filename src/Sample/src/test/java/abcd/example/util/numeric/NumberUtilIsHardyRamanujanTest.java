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
public class NumberUtilIsHardyRamanujanTest {
    public IntBooleanDataInfo dataInfo;


    public NumberUtilIsHardyRamanujanTest(IntBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntBooleanDataInfo> createData()
    {
        return List.of(
                new IntBooleanDataInfo(0, false),
                new IntBooleanDataInfo(12, false),
                new IntBooleanDataInfo(1000, false),
                new IntBooleanDataInfo(1729, true),
                new IntBooleanDataInfo(4104, true),
                new IntBooleanDataInfo(13832, true),
                new IntBooleanDataInfo(20683, true),
                new IntBooleanDataInfo(32832, true),
                new IntBooleanDataInfo(39312, true),
                new IntBooleanDataInfo(40033, true),
                new IntBooleanDataInfo(46683, true),
                new IntBooleanDataInfo(64232, true),
                new IntBooleanDataInfo(65728, true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.isHardyRamanujan(dataInfo.input));
    }

}
