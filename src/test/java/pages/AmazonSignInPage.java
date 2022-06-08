package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage {
    public AmazonSignInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#nav-global-location-popover-link")
    public WebElement addressSelector;
    @FindBy(css=".a-popover-wrapper")
    public WebElement chooseYourLocation;

    @FindBy(css="#GLUXZipUpdateInput")
    public WebElement zipCodeInputBox;

    @FindBy(css="#GLUXZipUpdate")
    public WebElement applyButton;
    @FindBy(css = "div[class='a-row a-spacing-top-micro']")
    public WebElement deliveryMessage;

}
