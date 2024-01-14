package abcd.example.util.array;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ArrayUtilMultiplyByTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int[] input1;
        public int input2;
        public int[] expected;
        public int[] resultedArray;

        public DataInfo(int[] input1, int input2, int[] expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
            resultedArray = Arrays.copyOf(input1, input1.length);
            ArrayUtil.multiplyBy(resultedArray, input2);
        }
    }

    public ArrayUtilMultiplyByTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[]{1, 2, 3, 4}, 1, new int[]{1, 2, 3, 4}),
                new DataInfo(new int[]{1, 2, 3}, -1, new int[]{-1, -2, -3})
        );
    }

    @Test
    public void test()
    {
        Assert.assertArrayEquals(dataInfo.expected, dataInfo.resultedArray);
    }

}
