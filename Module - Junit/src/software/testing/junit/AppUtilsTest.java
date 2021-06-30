package software.testing.junit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtilsTest {

    AppUtil appUtil=new AppUtil();
    @Test
    public void add_test1(){
        int actualResult=appUtil.add(10,20);
        int expectedResult;
        expectedResult=30;
        Assert.assertEquals(actualResult,expectedResult);

       // Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void add_test2(){
        int actualResult=appUtil.add(10,-20);
        int expectedResult=-10;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void multiply_test1(){
        int actualResult=appUtil.multiply(10,-20);
        int expectedResult=-200;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void multliply_test2(){
        int actualResult=appUtil.multiply(10,-20);
        int expectedResult=200;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
