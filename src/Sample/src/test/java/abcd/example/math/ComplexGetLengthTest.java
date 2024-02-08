package abcd.example.math;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ComplexGetLengthTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public Complex input;
        public double expected;

        public DataInfo(Complex input, double expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public ComplexGetLengthTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new Complex(3, 5), 5.83),
                new DataInfo(new Complex(-2, 3), 3.60)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input.getLength(), 0.01);
    }

}
