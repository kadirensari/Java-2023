package abcd.example.math.geometry;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class TriangleGetAreaTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public Triangle input;
        public double expected;

        public DataInfo(Triangle input, double expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }

    public TriangleGetAreaTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new Triangle(3, 4, 5), 6),
                new DataInfo(new Triangle(6, 8, 10), 24),
                new DataInfo(new Triangle(5, 5, 6), 12)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input.getArea(), 0.00001);
    }

}
