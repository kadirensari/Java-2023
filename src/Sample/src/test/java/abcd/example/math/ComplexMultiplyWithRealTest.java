package abcd.example.math;

import abcd.example.math.data.ComplexDoubleComplexDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ComplexMultiplyWithRealTest {
    public ComplexDoubleComplexDataInfo dataInfo;

    public ComplexMultiplyWithRealTest(ComplexDoubleComplexDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<ComplexDoubleComplexDataInfo> createData()
    {
        return List.of(
                new ComplexDoubleComplexDataInfo(new Complex(3, 5), 5, new Complex(15, 25)),
                new ComplexDoubleComplexDataInfo(new Complex(-3, 5), 5, new Complex(-15, 25)),
                new ComplexDoubleComplexDataInfo(new Complex(3), 5, new Complex(15, 0))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input1.multiply(dataInfo.input2));
    }

}
