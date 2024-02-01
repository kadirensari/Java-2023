package abcd.example.util.numeric;

import abcd.example.util.numeric.data.IntIntDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilCalculateDigitalRootTest {
    public IntIntDataInfo dataInfo;

    public NumberUtilCalculateDigitalRootTest(IntIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntIntDataInfo> createData()
    {
        return List.of(
                new IntIntDataInfo(0, 0),
                new IntIntDataInfo(-1, 1),
                new IntIntDataInfo(1, 1),
                new IntIntDataInfo(2, 2),
                new IntIntDataInfo(9, 9),
                new IntIntDataInfo(10, 1),
                new IntIntDataInfo(11, 2),
                new IntIntDataInfo(36987, 6)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.calculateDigitalRoot(dataInfo.input));
    }

}
