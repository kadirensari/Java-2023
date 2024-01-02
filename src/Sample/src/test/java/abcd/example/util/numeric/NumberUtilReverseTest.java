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
public class NumberUtilReverseTest {
    public IntLongDataInfo dataInfo;

    public NumberUtilReverseTest(IntLongDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<IntLongDataInfo> createData()
    {
        return List.of(new IntLongDataInfo(123, 321),
                new IntLongDataInfo(-123, -321),
                new IntLongDataInfo(0,0),
                new IntLongDataInfo(Integer.MAX_VALUE, 7463847412L),
                new IntLongDataInfo(Integer.MIN_VALUE, -8463847412L));
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.reverse(dataInfo.input));
    }

}
