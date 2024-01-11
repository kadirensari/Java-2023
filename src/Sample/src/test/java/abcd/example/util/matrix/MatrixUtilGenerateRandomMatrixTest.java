package abcd.example.util.matrix;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;
import java.util.Random;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class MatrixUtilGenerateRandomMatrixTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public Random input1;
        public int input2;
        public int input3;
        public int input4;
        public int input5;
        public int expectedRowLength;
        public int expectedColLength;

        public DataInfo(Random input1, int input2, int input3, int input4, int input5, int expectedRowLength, int expectedColLength)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
            this.input4 = input4;
            this.input5 = input5;
            this.expectedRowLength = expectedRowLength;
            this.expectedColLength = expectedColLength;
        }
    }

    public MatrixUtilGenerateRandomMatrixTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new Random(), 2, 3, 0, 100, 2, 3),
                new DataInfo(new Random(), 2, 4, 0, 100, 2, 4)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expectedRowLength, MatrixUtil.generateRandomMatrix(dataInfo.input1, dataInfo.input2, dataInfo.input3, dataInfo.input4, dataInfo.input5).length);
        Assert.assertEquals(dataInfo.expectedColLength, MatrixUtil.generateRandomMatrix(dataInfo.input1, dataInfo.input2, dataInfo.input3, dataInfo.input4, dataInfo.input5)[0].length);

    }

}
