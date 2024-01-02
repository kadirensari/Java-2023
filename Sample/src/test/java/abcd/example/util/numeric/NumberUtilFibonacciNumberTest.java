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
public class NumberUtilFibonacciNumberTest {
    public IntIntDataInfo dataInfo;

    public NumberUtilFibonacciNumberTest(IntIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntIntDataInfo> createDate()
    {
        return List.of(new IntIntDataInfo(0, -1),
                new IntIntDataInfo(1, 0),
                new IntIntDataInfo(2, 1),
                new IntIntDataInfo(3, 1),
                new IntIntDataInfo(4, 2),
                new IntIntDataInfo(5, 3),
                new IntIntDataInfo(12, 89),
                new IntIntDataInfo(-1 , -2)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.fibonacciNumber(dataInfo.input));
    }

}
