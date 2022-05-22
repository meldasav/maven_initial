package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _03_EtsyTest extends Base {
    //Declare your driver


    @Test
    public void testEtsyLogo() {
        driver.get("https://www.etsy.com/");

        WebElement expectedLogo = driver.findElement(By.id("logo"));

        Assert.assertTrue(expectedLogo.isDisplayed());
    }

    @Test
    public void testInputBox() {
        driver.get("https://www.etsy.com/");

        WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));
        Assert.assertTrue(searchInputBox.isDisplayed());

    }
    @Test
    public void searchButton() {
        driver.get("https://www.etsy.com/");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']"));
        Assert.assertTrue(searchButton.isDisplayed());

    }
}