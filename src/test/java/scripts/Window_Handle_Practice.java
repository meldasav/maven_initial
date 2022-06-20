package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class Window_Handle_Practice extends Base {

    @Test
    public void validateFacebookTitle() {
        driver.get("https://www.techglobalschool.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Waiter.pause(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.moveToElement(tecGlobalSchoolHomePage.faceBookIcon).perform();
        Waiter.pause(4);
        tecGlobalSchoolHomePage.faceBookIcon.click();
        System.out.println(driver.getTitle());
        String techGlobalSchool = driver.getWindowHandle();

        for (String windowHande : driver.getWindowHandles()) {
            if (!windowHande.equals(techGlobalSchool)) driver.switchTo().window(windowHande);
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(techGlobalSchool);
        Assert.assertEquals(driver.getTitle(),"SDET Bootcamp | TechGlobal");
    }

    @Test
    public void testComfyeliteSocialMedia(){
        driver.get("https://comfyelite.com/");
        WebElement element= driver.findElement(By.cssSelector("a[data-aid='SOCIAL_FACEBOOK_LINK']"));
        element.click();
        String cOMFYWindowHandle= driver.getWindowHandle();
        for(String element1 : driver.getWindowHandles()){
            if(!element1.equals(cOMFYWindowHandle))driver.switchTo().window(element1);
        }
        Waiter.pause(3);
        Assert.assertEquals(driver.getTitle(),"Comfy Elite - Home | Facebook");
        driver.close();
        Waiter.pause(2);
        driver.switchTo().window(cOMFYWindowHandle);
        System.out.println(driver.getTitle());

    }
}
