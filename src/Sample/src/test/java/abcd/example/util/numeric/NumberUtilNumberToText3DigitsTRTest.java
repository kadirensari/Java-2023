package abcd.example.util.numeric;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class NumberUtilNumberToText3DigitsTRTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public long input;
        public String expected;

        public DataInfo(long input, String expected)
        {
            this.input = input;
            this.expected = expected;
        }
    }


    public NumberUtilNumberToText3DigitsTRTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }


    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(123, "yüz yirmi üç"),
                new DataInfo(-123, "eksi yüz yirmi üç"),
                new DataInfo(323, "üç yüz yirmi üç"),
                new DataInfo(-323, "eksi üç yüz yirmi üç"),
                new DataInfo(0, "sıfır")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.numberToText3DigitsTR(dataInfo.input));
    }

}
