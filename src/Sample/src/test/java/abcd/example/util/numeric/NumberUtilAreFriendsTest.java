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
public class NumberUtilAreFriendsTest {
    public DataInfo dataInfo;

    static class DataInfo {
        public int input1;
        public int input2;
        public boolean expected;

        public DataInfo(int input1, int input2, boolean expected)
        {
            this.input1 = input1;
            this.input2 = input2;
            this.expected = expected;
        }
    }

    public NumberUtilAreFriendsTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> createData()
    {
        return List.of(
                new DataInfo(220, 284, true),
                new DataInfo(1184, 1210, true),
                new DataInfo(2620, 2924, true),
                new DataInfo(5020, 5564, true),
                new DataInfo(220, 214, false),
                new DataInfo(120, 84, false)
        );
    }

    @Test
    public void test()
    {
        Assert.assertEquals(dataInfo.expected, NumberUtil.areFriends(dataInfo.input1, dataInfo.input2));
    }

}
