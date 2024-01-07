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
public class ArrayUtilSumTest {

    public ArrayIntDataInfo dataInfo;

    public ArrayUtilSumTest(ArrayIntDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<ArrayIntDataInfo> createData()
    {
        return List.of(
              new ArrayIntDataInfo(new int[]{1, 2, 3, 4, 5}, 15),
              new ArrayIntDataInfo(new int[]{-2, -1, 0, 1, 2}, 0),
              new ArrayIntDataInfo(new int[]{-1, -2, -3, -4}, -10)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, ArrayUtil.sum(dataInfo.input));
    }

}
