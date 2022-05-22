package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _01_AppleTest extends Base{
    //Declare your driver


   


    // 2. Validation of test - test
    @Test
    public void testAppleTitle() {
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development
        /**
         * INSTEAD OF THESE IF-ELSE WE ARE GOING TO USE TESTNG ASSERTION
        if (actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
        else System.out.println("Apple title validation failed");
         */
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void testAppleURL() {
        driver.get("https://www.apple.com/");
        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    @Test
    public void X(){
        //fail method is used to fail a test on purpose
        //we use this for know issues
        Assert.fail("Failure on purpose");
    }


    // 3. Teardown actions - after each test


}


