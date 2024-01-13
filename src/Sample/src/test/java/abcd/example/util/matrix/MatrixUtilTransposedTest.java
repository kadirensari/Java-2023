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
public class MatrixUtilTransposedTest {

    public DataInfo dataInfo;

    static class DataInfo {
        public int[][] input;
        public int[][] output;
        public int inputRowSize;
        public int inputColSize;
        public int outputRowSize;
        public int outputColSize;

        public DataInfo(int[][] input, int[][] output)
        {
            this.input = input;
            this.output = output;
            this.inputRowSize = input.length;
            this.inputColSize = input[0].length;
            this.outputRowSize = output.length;
            this.outputColSize = output[0].length;
        }
    }

    public MatrixUtilTransposedTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new int[][]{{1, 2, 3}, {4, 5, 6}}, MatrixUtil.transposed(new int[][]{{1, 2, 3}, {4, 5, 6}}))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.outputRowSize, dataInfo.inputColSize);
        Assert.assertEquals(dataInfo.outputColSize, dataInfo.inputRowSize);
    }

}
