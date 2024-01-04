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
public class NumberUtilGetPrimeTest {
    public IntIntDataInfo dataInfo;

    public NumberUtilGetPrimeTest(IntIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntIntDataInfo> createData()
    {
        return List.of(
                new IntIntDataInfo(-1, -1),
                new IntIntDataInfo(0, -1),
                new IntIntDataInfo(1, 2),
                new IntIntDataInfo(2, 3),
                new IntIntDataInfo(3, 5),
                new IntIntDataInfo(4, 7),
                new IntIntDataInfo(5, 11),
                new IntIntDataInfo(6, 13),
                new IntIntDataInfo(7, 17),
                new IntIntDataInfo(8, 19),
                new IntIntDataInfo(9, 23)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.getPrime(dataInfo.input));
    }

}
