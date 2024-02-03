package abcd.example.math;

import abcd.example.math.data.ComplexComplexDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class ComplexGetConjugateTest {
    public ComplexComplexDataInfo dataInfo;

    public ComplexGetConjugateTest(ComplexComplexDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<ComplexComplexDataInfo> createData()
    {
        return List.of(
                new ComplexComplexDataInfo(new Complex(3, 5), new Complex(3, -5)),
                new ComplexComplexDataInfo(new Complex(3), new Complex(3)),
                new ComplexComplexDataInfo(new Complex(-3, 5), new Complex(-3, -5)),
                new ComplexComplexDataInfo(new Complex(-3, 0), new Complex(-3, 0))
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, dataInfo.input.getConjugate());
    }

}
