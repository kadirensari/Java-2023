package abcd.example.util.string;

import abcd.example.util.string.data.StringBooleanDataInfo;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilIsPangramTRTest {
    public StringBooleanDataInfo dataInfo;

    public StringUtilIsPangramTRTest(StringBooleanDataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<StringBooleanDataInfo> createData()
    {
        return List.of(
                new StringBooleanDataInfo("Pijamalı hasta yağız şoföre çabucak güvendi", true),
                new StringBooleanDataInfo("Pijamalı hasta yağız şoföre çabucak güvendii", true),
                new StringBooleanDataInfo("Pijamalı hasta yaız şoföre çabucak güvendi", false),
                new StringBooleanDataInfo("", false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, StringUtil.isPangramTR(dataInfo.input));
    }

}
