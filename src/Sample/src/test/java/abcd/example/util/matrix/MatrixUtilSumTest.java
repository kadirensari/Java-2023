package abcd.example.util.matrix;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class MatrixUtilSumTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int[][] input;
        public int expected;

        public DataInfo(int[][] input, int expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public MatrixUtilSumTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 45),
                new DataInfo(new int[][]{{1, 2, 3}, {-1, -2, -3}, {7, 8, 9}}, 24),
                new DataInfo(new int[][]{{1, 2}, {3, 4}, {0, 0}}, 10)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, MatrixUtil.sum(dataInfo.input));
    }

}
