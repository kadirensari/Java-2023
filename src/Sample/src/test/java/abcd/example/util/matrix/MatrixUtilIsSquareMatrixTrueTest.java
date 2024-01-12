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
public class MatrixUtilIsSquareMatrixTrueTest {
    public DataInfo dataInfo;

    static class DataInfo{
        public int[][] input;

        public DataInfo(int[][] input)
        {
            this.input = input;
        }
    }

    public MatrixUtilIsSquareMatrixTrueTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[][]{{1, 2}, {3, 4}}),
                new DataInfo(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})
        );
    }

    @Test
    public void test()
    {
        Assert.assertTrue(MatrixUtil.isSquareMatrix(dataInfo.input));
    }
}
