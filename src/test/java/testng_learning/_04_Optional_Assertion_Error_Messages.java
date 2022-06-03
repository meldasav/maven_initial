package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Optional_Assertion_Error_Messages {
    @Test
    public void method1(){
        //TestNG way
        //Assert.assertTrue(false,"error message");
        org.testng.Assert.assertEquals("","","");

//        //junit way
//        Assert.assertTrue("",false);
//        Assert.assertEquals("","","");
    }
}
