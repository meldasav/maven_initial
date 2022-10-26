package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ClearCoverPage {

    public ClearCoverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div[class='navbar-right']>a")
    public WebElement startButton;

    @FindBy(css = "div[class='styles_base__1c-WU']>button")
    public WebElement getStartedButton;

   @FindBy(css = ".styles_input__336vM")
   public List<WebElement> credentials;

    @FindBy(css = "select[name$='suffix']")
    public WebElement suffixDropDown;

    @FindBy(css = "div[data-testid='step-submit']")
    public WebElement nextButton;

    @FindBy(css = ".styles_input__336vM")
    public WebElement birthDate;
}
