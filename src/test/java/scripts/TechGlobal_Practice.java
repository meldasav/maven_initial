package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

import java.util.concurrent.TimeUnit;

public class TechGlobal_Practice extends Base{

    @Test
    public void validateTitle(){
        driver.get("https://www.techglobalschool.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.techglobalschool.com/");
        Assert.assertEquals(driver.getTitle(),"SDET Bootcamp | TechGlobal");
    }

    @Test
    public void navigate() throws InterruptedException {
        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.com/");
        Assert.assertEquals(driver.getTitle(),"Amazon.com. Spend less. Smile more.");

    }
}
