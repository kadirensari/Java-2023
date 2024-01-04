package abcd.example.util.numeric;

import abcd.example.util.numeric.data.IntLongDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilFactorialTest {
    public IntLongDataInfo dataInfo;

    public NumberUtilFactorialTest(IntLongDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntLongDataInfo> createData()
    {
        return List.of(
                new IntLongDataInfo(-1, 1),
                new IntLongDataInfo(0, 1),
                new IntLongDataInfo(3, 6),
                new IntLongDataInfo(5, 120),
                new IntLongDataInfo(8, 40320),
                new IntLongDataInfo(14, 87178291200L),
                new IntLongDataInfo(20, 2432902008176640000L)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.factorial(dataInfo.input));
    }

}
