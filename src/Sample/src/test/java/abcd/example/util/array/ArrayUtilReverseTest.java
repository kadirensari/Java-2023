package abcd.example.util.array;

import abcd.example.util.array.data.ArrayArrayDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ArrayUtilReverseTest {
    public ArrayArrayDataInfo dataInfo;

    public ArrayUtilReverseTest(ArrayArrayDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<ArrayArrayDataInfo> createData()
    {
        return List.of(
                new ArrayArrayDataInfo(new int[]{1,2,3,4,5}, new int[]{5,4,3,2,1}),
                new ArrayArrayDataInfo(new int[]{-1,2,3,-4}, new int[]{-4,3,2,-1}),
                new ArrayArrayDataInfo(new int[]{0,0,0,0}, new int[]{0,0,0,0})
        );
    }

    @Test
    public void test()
    {
        ArrayUtil.reverse(dataInfo.input);
        Assert.assertArrayEquals(dataInfo.expected, dataInfo.input);
    }
}
