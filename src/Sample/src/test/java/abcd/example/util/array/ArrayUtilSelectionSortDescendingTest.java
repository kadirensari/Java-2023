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
public class ArrayUtilSelectionSortDescendingTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int[] input1;
        public boolean input2;
        public int[] expected;
        public int[] resultedArray;

        public DataInfo(int[] input1, boolean input2, int[] expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
            resultedArray = Arrays.copyOf(input1, input1.length);
            ArrayUtil.selectionSort(resultedArray, input2);
        }
    }

    public ArrayUtilSelectionSortDescendingTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[]{15, 22, 3, -5}, true, new int[]{22, 15, 3, -5}),
                new DataInfo(new int[]{1, 2, 3}, true, new int[]{3, 2, 1})
        );
    }

    @Test
    public void test()
    {
        Assert.assertArrayEquals(dataInfo.expected, dataInfo.resultedArray);
    }

}
