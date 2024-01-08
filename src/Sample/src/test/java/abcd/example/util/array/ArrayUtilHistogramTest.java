package abcd.example.util.array;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ArrayUtilHistogramTest {
    public DataInfo dataInfo;
    static class DataInfo {
        public int[] input1;
        public int input2;
        public int[] expected;

        public DataInfo(int[] input1, int input2, int[] expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public ArrayUtilHistogramTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[]{1, 2, 3, 4, 5}, 5, new int[]{0, 1, 1, 1, 1, 1}),
                new DataInfo(new int[]{0, 2, 3, 4, 5}, 5, new int[]{1, 0, 1, 1, 1, 1}),
                new DataInfo(new int[]{1, 5, 5}, 5, new int[]{0, 1, 0, 0, 0, 2}),
                new DataInfo(new int[]{0, 3, 7, 5, 5}, 10, new int[]{1, 0, 0, 1, 0, 2, 0, 1, 0, 0, 0})
        );
    }

    @Test
    public void test()
    {
        Assert.assertArrayEquals(dataInfo.expected, ArrayUtil.histogramData(dataInfo.input1, dataInfo.input2));
    }

}
