package abcd.example.util.time;


import abcd.example.util.time.data.LongStringDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class TimeUtilPrintDurationTest {
    public LongStringDataInfo dataInfo;

    public TimeUtilPrintDurationTest(LongStringDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<LongStringDataInfo> createData()
    {
        return List.of(
                new LongStringDataInfo(1234, "00:20:34"),
                new LongStringDataInfo(6000, "01:40:00"),
                new LongStringDataInfo(1, "00:00:01"),
                new LongStringDataInfo(0, "00:00:00"),
                new LongStringDataInfo(-5, "Invalid Input!")
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, TimeUtil.getDuration(dataInfo.input));
    }



}
