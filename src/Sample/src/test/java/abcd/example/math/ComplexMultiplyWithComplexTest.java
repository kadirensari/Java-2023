package abcd.example.math;

import abcd.example.math.data.ComplexComplexComplexDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ComplexMultiplyWithComplexTest {
    public ComplexComplexComplexDataInfo dataInfo;

    public ComplexMultiplyWithComplexTest(ComplexComplexComplexDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<ComplexComplexComplexDataInfo> createData()
    {
        return List.of(
                new ComplexComplexComplexDataInfo(new Complex(3, 5), new Complex(-2, 3), new Complex(-21, -1)),
                new ComplexComplexComplexDataInfo(new Complex(5, 5), new Complex(-2, -3), new Complex(5, -25))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input1.multiply(dataInfo.input2));
    }

}
