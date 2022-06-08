package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

    public RediffHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#nav-global-location-popover-link")
    public WebElement addressSelector;

}
