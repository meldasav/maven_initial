package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

import java.time.Duration;
import java.util.List;

public class _12_Actions_Class extends Base {

    @Test(priority = 1, description = "Actions moves to element")

    public void moveToElementPractice1() {
        driver.get("https://www.techglobalschool.com/");
        WebElement address = driver.findElement(By.cssSelector("div[id='comp-kixny3ro'] span>span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(address).perform();
        Waiter.pause(1);
        Assert.assertEquals(address.getText(), "2860 S River Rd Suite 350, Des Plaines IL 60018");
    }


    @Test(priority = 2, description = "Actions moves to element 2")
    public void moveToElementPractice3() {
        driver.get("https://www.carvana.com/");
        List<WebElement> finances = driver.findElements(By.xpath("//a[starts-with(@data-cv-test,'headerFinance')]"));

        for (WebElement element : finances) {
            System.out.println(element.getText());
        }
        Actions actions = new Actions(driver);
    }

    /*
Go to https://www.carvana.com/
Hover over "FINANCING" menu item (dropdown)
Validate below items are displayed

WHY FINANCE WITH CARVANA
GET PREQUALIFIED
AUTO LOAN CALCULATOR
*/
    @Test(priority = 2, description = "Actions | move to element 1")
    public void moveToElementPractice2() {

        driver.get("https://www.carvana.com/");
        WebElement financeDropdown = driver.findElement(By.cssSelector("div[data-cv-test='headerFinanceDropdown']"));
        Waiter.pause(2);
        //Move to financeDropdown
        Actions actions = new Actions(driver);
        actions.moveToElement(financeDropdown).perform();
        Waiter.pause(2);
        List<WebElement> financeDropdownOptions = driver.findElements(By.cssSelector("a[data-cv-test^='headerFinance']"));

        //Validate texts expected
        String[] optionTexts = {"WHY FINANCE WITH CARVANA", "GET PREQUALIFIED", "AUTO LOAN CALCULATOR"};

        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(financeDropdownOptions.get(i).isDisplayed());
            Assert.assertEquals(financeDropdownOptions.get(i).getText(), optionTexts[i]);
            //System.out.println("======================" + financeDropdownOptions.get(i).getText() + "======================");
        }
    }

    @Test(priority = 3, description = "Actions | move to element 3")
    public void clickElementPractice2() {

        driver.get("https://www.techglobalschool.com/");
        WebElement registerSession = driver.findElement(By.cssSelector("#comp-kvjohd5t5 span"));
        actions.moveToElement(registerSession).perform();
        actions.click(registerSession).perform();
        //you can combineThem in 1 line
        //    actions.moveToElement(registerSession).pause(Duration.ofSeconds(2)).click().perform();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/apply-now-1");

        //    actions.clickAndHold(driver.findElement(By.id("draggable"))).perform();
    }

    @Test(priority = 4, description = "Actions | RIGHT click")
    public void rightClickPractice() {
        driver.get("https://www.techglobalschool.com/");
        WebElement registerSession = driver.findElement(By.cssSelector("#comp-kvjohd5t5 span"));
        actions.contextClick(driver.findElement(By.cssSelector("#comp-kvjohd5t5 span"))).perform();
        actions.click(registerSession).perform();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/apply-now-1");
    }

    @Test(priority = 5, description = "Actions | click and Hold | Drag and drop")
    public void clickAndReleasePractice() {
        driver.get("https://demoqa.com/droppable");
        WebElement dragMeBox = driver.findElement(By.id("draggable"));
        WebElement dropBox = driver.findElement(By.id("droppable"));
        //    actions.dragAndDrop(dragMeBox,dropBox).perform(); only 1 line can work to
        actions.clickAndHold(dragMeBox).pause(Duration.ofSeconds(2)).moveToElement(dropBox).pause(Duration.ofSeconds(2)).release().perform();
        Assert.assertEquals(dropBox.getText(), "Dropped!");
    }

    @Test(priority = 6, description = "Actions | keys down and key up")
    public void practiceKeyDownAndKeyUp() {
        driver.get("https://www.google.com/");
        WebElement searchInputBox = driver.findElement(By.name("q"));
        actions.sendKeys(searchInputBox, "techglobal".toUpperCase()).perform();
        Waiter.pause(2);
        Assert.assertEquals(searchInputBox.getAttribute("value"), "TECHGLOBAL");
    }

    /*
Go to https://www.google.com/
Enter "techglobal" to search input box with uppercases
Validate the value attribute for search input box is "TECHGLOBAL"
Then, copy the text and paste again
Validate the value attribute for search input box is "TECHGLOBALTECHGLOBAL"
 */

    @Test(priority = 7, description = "Actions | key down and key up")
    public void practiceKeyDownAndKeyUp1() {
        driver.get("https://www.google.com/");

        //googleSearchPage.searchInputBox.sendKeys("TECHGLOBALTECHGLOBAL");

        actions.keyDown(Keys.SHIFT)
                .sendKeys(googleSearchPage.searchInputBox, "techglobal")
                .keyUp(Keys.SHIFT)
                .pause(Duration.ofSeconds(2))
                .keyDown(Keys.COMMAND)
                .sendKeys("a")
                .pause(Duration.ofSeconds(2))
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ARROW_RIGHT)
                .pause(Duration.ofSeconds(2))
                .keyDown(Keys.COMMAND).sendKeys("v")
                .perform();

        Waiter.pause(2);
    }
}
