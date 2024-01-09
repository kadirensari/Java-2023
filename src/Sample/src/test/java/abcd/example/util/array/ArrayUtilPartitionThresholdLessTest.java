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
public class ArrayUtilPartitionThresholdLessTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int[] input1;
        public int input2;
        public int output;

        public DataInfo(int[] input1, int input2, int output)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.output = output;
        }
    }

    public ArrayUtilPartitionThresholdLessTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[]{1, 2, 3, 4, 5}, 3, 2),
                new DataInfo(new int[]{1, 2, 3, 4, 5}, 6, 5),
                new DataInfo(new int[]{7, 11, -5, 4, 9, 25}, 10, 4)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.output, ArrayUtil.partitionByThresholdLess(dataInfo.input1, dataInfo.input2));
    }
}
