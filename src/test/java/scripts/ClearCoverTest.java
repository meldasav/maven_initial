package scripts;

import org.testng.annotations.Test;
import utilities.DropdownHandler;
import utilities.Waiter;

public class ClearCoverTest extends Base{

    @Test
    public void testValidationOfPrice(){
        driver.get("https://clearcover.com/home/");
        clearCoverPage.startButton.click();
        Waiter.pause(2);
        clearCoverPage.getStartedButton.click();
        clearCoverPage.credentials.get(0).sendKeys("Melda");
        clearCoverPage.credentials.get(2).sendKeys("Sav");
        DropdownHandler.selectOptionByVisibleText(clearCoverPage.suffixDropDown, "IV");
        clearCoverPage.nextButton.click();
        Waiter.pause(2);
        clearCoverPage.birthDate.sendKeys("05251983");

    }
}
