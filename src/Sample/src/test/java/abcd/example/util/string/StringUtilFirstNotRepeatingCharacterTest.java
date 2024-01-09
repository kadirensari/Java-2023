package abcd.example.util.string;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

@Ignore("Tested by Kadir")
@RunWith(Parameterized.class)
public class StringUtilFirstNotRepeatingCharacterTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public String input;
        public char output;

        public DataInfo(String input, char output)
        {
            this.input = input;
            this.output = output;
        }
    }

    public StringUtilFirstNotRepeatingCharacterTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo("abcdabduytrszx", 'c'),
                new DataInfo("aaaaaaabcdbcdf", 'f'),
                new DataInfo("abcabcabcabc", '_')
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.output, StringUtil.firstNotRepeatingCharacter(dataInfo.input));
    }
}
