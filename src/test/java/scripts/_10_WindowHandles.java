package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _10_WindowHandles extends Base {


    @Test(priority = 1, description = "Validate FaceBook social media icon for TechGlobal School")
    public void validateFacebook() {
        driver.get("https://www.techglobalschool.com/");
        System.out.println(driver.getWindowHandles());
        techGlobalPage.faceBookIcon.click();

        String techGlobalWindowHandle = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (windowHandle.equals(techGlobalWindowHandle)) driver.switchTo().window(windowHandle);

        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/");

    }

    @Test(priority = 2, description = "Validate Instagram social media icon for TechGlobal School")
    public void validateInstagram() {
        driver.get("https://www.techglobalschool.com/");
        System.out.println(driver.getWindowHandles());

        techGlobalPage.instagramIcon.click();
        String techGlobalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (windowHandle.equals(techGlobalWindowHandle)) driver.switchTo().window(windowHandle);
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.techglobalschool.com/");


    }

    @Test(priority = 3, description = "TEST CASE 2: Multiple Windows")
    public void testWindowHandle2() {
        driver.get(" http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Multiple Windows");
        heroAppPage.clickHereLink.click();
        String windowHandle1 = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(windowHandle1)) driver.switchTo().window(windowHandle);
        }

        Assert.assertEquals(heroAppPage.heading3.getText(), "New Window");
        driver.switchTo().window(windowHandle1);
        Assert.assertEquals(heroAppPage.openingHeading3.getText(),"Opening a new window");

    }

    @Test(priority =3,description = "Validate comfyelite facebook icon")
    public void testNewWindow(){
        driver.get("https://comfyelite.com/");
        etsySearchPage.socialLinks.get(0).click();
        Waiter.pause(2);
        String windowHandle= driver.getWindowHandle();
        for(String windowHandle1 : driver.getWindowHandles()){
            if(!windowHandle1.equals(windowHandle))driver.switchTo().window(windowHandle1);
        }

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/comfyelite/");
        driver.switchTo().window(windowHandle);
        for(String windowHandle1 : driver.getWindowHandles()){
            if(!windowHandle1.equals(windowHandle))driver.switchTo().window(windowHandle1);
        }
        System.out.println(driver.getCurrentUrl());
    }
}