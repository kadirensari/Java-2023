package abcd.example.util.array;

import abcd.example.util.array.data.ArrayIntDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ArrayUtilMinTest {
    public ArrayIntDataInfo dataInfo;

    public ArrayUtilMinTest(ArrayIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<ArrayIntDataInfo> createData()
    {
        return List.of(
                new ArrayIntDataInfo(new int[]{-1, 0, 1, 2}, -1),
                new ArrayIntDataInfo(new int[]{-4, -3, -2, -1}, -4),
                new ArrayIntDataInfo(new int[]{1, 2, 3, 4}, 1),
                new ArrayIntDataInfo(new int[]{0,0,0,0}, 0)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, ArrayUtil.min(dataInfo.input));
    }


}
