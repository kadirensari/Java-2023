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
public class TriangleAreEqualsTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public Triangle input1;
        public Triangle input2;
        public boolean expected;

        public DataInfo(Triangle input1, Triangle input2, boolean expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public TriangleAreEqualsTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(new Triangle(3, 4, 5), new Triangle(3, 4, 5), true),
                new DataInfo(new Triangle(3, 4, 5), new Triangle(4, 3, 5), true),
                new DataInfo(new Triangle(5, 4, 3), new Triangle(3, 4, 5), true),
                new DataInfo(new Triangle(3, 4, 5), new Triangle(3.0001, 4, 5), false),
                new DataInfo(new Triangle(3, 4, 5), new Triangle(3.0000001, 4, 5), true)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input1.equals(dataInfo.input2));
    }

}
