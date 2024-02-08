package abcd.example.math;

import abcd.example.math.data.DoubleComplexComplexDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ComplexRealMultiplyWithComplexTest {
    public DoubleComplexComplexDataInfo dataInfo;

    public ComplexRealMultiplyWithComplexTest(DoubleComplexComplexDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DoubleComplexComplexDataInfo> createData()
    {
        return List.of(
                new DoubleComplexComplexDataInfo(5, new Complex(3, -5), new Complex(15, -25)),
                new DoubleComplexComplexDataInfo(-5, new Complex(3, -5), new Complex(-15, 25))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, Complex.multiply(dataInfo.input1, dataInfo.input2));
    }

}
