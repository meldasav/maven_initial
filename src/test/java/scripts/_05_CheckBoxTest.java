package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _05_CheckBoxTest extends Base{

    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Checkboxes” link
    Validate “checkbox 1” is displayed, enabled and not selected
    Validate “checkbox 2” is displayed, enabled and selected
    Select “checkbox 1” and validate it is selected
    Deselect both “checkbox 1” and “checkbox 2” and validate they are deselected
     */

    @Test(priority = 1, description = "TC001: Validate checkbox in hero app")
    public void testCheckBoxInHeroApp(){
        driver.get("http://the-internet.herokuapp.com/");

        Waiter.pause(2);
        heroAppPage.clickOnLink("Checkboxes");

        //Validate both checkboxes are displayed and enabled
        for(WebElement element: heroAppPage.checkboxes){
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isEnabled());
        }

        //Validate checkbox 1 is not selected and checkbox 2 is selected
        Assert.assertFalse(heroAppPage.checkboxes.get(0).isSelected());
        Assert.assertTrue(heroAppPage.checkboxes.get(1).isSelected());

        Waiter.pause(2);
        // Select “checkbox 1” and validate it is selected
        heroAppPage.checkboxes.get(0).click();
        Assert.assertTrue(heroAppPage.checkboxes.get(0).isSelected());

        // Deselect both “checkbox 1” and “checkbox 2” and validate they are deselected
        for (WebElement element: heroAppPage.checkboxes) {
            Waiter.pause(2);
            element.click();
            Assert.assertFalse(element.isSelected());
        }
    }

    @Test
    public  void testCheckBoxes(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElements(By.cssSelector(".CheckUncheck>a")).get(0).click();
        Waiter.pause(3);

    }
}