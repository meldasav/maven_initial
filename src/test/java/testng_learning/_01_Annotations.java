package testng_learning;

import org.testng.annotations.*;

public class _01_Annotations {
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method");
    }

    @Test
    public void Test1() {
        System.out.println("this is test1");
    }

    @Test
    public void Test2() {
        System.out.println("this is test2");
    }
}
