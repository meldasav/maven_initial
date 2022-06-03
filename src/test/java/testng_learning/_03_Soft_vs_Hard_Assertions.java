package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_Soft_vs_Hard_Assertions {
    @Test(priority = 1,description = "Practicing hard assertions")
    public void method1(){
        //hard assertions :when there is an error at any line,the program flow will break and it  will not continue with the rest
        Assert.assertTrue(true);
        Assert.assertTrue(false,"Failure");
        System.out.println("Hello world");
    }
    @Test(priority = 2,description = "Practicing soft assertions")
    public void method2(){
        //soft assertion
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertTrue(false,"Failure");//Assertion error
        System.out.println("Hello world");
        softAssert.assertAll();
    }
}
