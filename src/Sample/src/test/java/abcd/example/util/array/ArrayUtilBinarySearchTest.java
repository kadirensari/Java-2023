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
public class ArrayUtilBinarySearchTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int[] input1;
        public int input2;
        public int expected;

        public DataInfo(int[] input1, int input2, int expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public ArrayUtilBinarySearchTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[]{1, 2, 4, 3, -5, 9, 10}, -5, -1),
                new DataInfo(new int[]{1, 2, 2, 3, -5, 9, 10}, 2, 1),
                new DataInfo(new int[]{1, 2, 2, 3, 8, 9, 10}, 9,  5),
                new DataInfo(new int[]{10, 8, 5, 2, 0, -9, -9}, 0, -1)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, ArrayUtil.binarySearch(dataInfo.input1, dataInfo.input2));
    }

}
