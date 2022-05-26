package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _02_TechGlobalTest extends Base {

    /*
1. Go to "https://www.techglobalschool.com/apply-now"
2. Validate the heading1 is displayed and the text for it is ="Application Form"
*/
    //1. Set up

    //2. Validate test
    @Test(description = "TG123 : Validate Application from heading")
    public void testApplicationFormHeading() {
        driver.get("https://www.techglobalschool.com/apply-now");
        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Application Form']"));


        Assert.assertTrue(tgApplicationPage.heading1.isDisplayed());
        Assert.assertEquals(tgApplicationPage.heading1.getText(),"Application Form");
    }
}
    //3. Teardown

