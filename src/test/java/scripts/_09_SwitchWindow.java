package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _09_SwitchWindow extends Base{

    @Test
   public  void switchWindow(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Multiple Windows");
        heroAppPage.clickHereLink.click();
        Assert.assertTrue(heroAppPage.heading3.isDisplayed());
        driver.switchTo().window("New Window");
        Assert.assertEquals(heroAppPage.heading3.getText(),"New Window");
        Assert.assertEquals(heroAppPage.openingHeading3.getText(),"Opening a new window");


    }

}
