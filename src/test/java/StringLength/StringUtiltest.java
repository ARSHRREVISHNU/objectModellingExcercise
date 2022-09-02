package StringLength;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtiltest {


    @Test
    public void findStringLength(){

        int strLen = new StringLength().returnStringLength("My name is Shrrevishnu.");
        Assert.assertEquals(strLen, 23);
    }
}
