package StringLength;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtiltest {

    @Test
    public void shouldAddTwoNum()
    {
        int add = new Calculator().getAdd(10,20);
        Assert.assertEquals(add,30);

    }

    @Test
    public void shouldMultiplyTwoNum(){

        int mul = new Calculator().getMul(10,20);
        Assert.assertEquals(mul, 200);
    }

}
