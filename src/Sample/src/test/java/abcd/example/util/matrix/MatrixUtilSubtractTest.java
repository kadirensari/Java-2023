package abcd.example.util.matrix;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import abcd.example.util.matrix.data.MatrixMatrixMatrixDataInfo;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class MatrixUtilSubtractTest {
    public MatrixMatrixMatrixDataInfo dataInfo;

    public MatrixUtilSubtractTest(MatrixMatrixMatrixDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<MatrixMatrixMatrixDataInfo> createData()
    {
        return List.of(
                new MatrixMatrixMatrixDataInfo(
                        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                        new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}}),
                new MatrixMatrixMatrixDataInfo(
                        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}},
                        new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}})
        );
    }

    @Test
    public void test()
    {
        for(int i = 0; i < dataInfo.input1.length; i++)
            Assert.assertArrayEquals(dataInfo.output, MatrixUtil.subtract(dataInfo.input1, dataInfo.input2));
    }

}
