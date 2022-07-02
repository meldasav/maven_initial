package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechGlobalSubscribePage {
    public TechGlobalSubscribePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //This Page factory introduces all the web elements to my driver that i am going to use in the scripts
    @FindBy(css = "div[id='comp-keehv7pd1'] span:nth-child(1)")
    public WebElement subscribeText;

    @FindBy(css="div[id='comp-keei0711'] span:nth-child(1)")
    public WebElement stayUpToDateText;

    @FindBy(id="input_comp-khwayxk9")
    public WebElement firstName;

    @FindBy(css="div[id='comp-khwaz4h2'] input")
    public WebElement lastName;

    @FindBy(css="div[id='comp-khwb0zsz'] input")
    public WebElement emailBox;

    @FindBy(css = "div[id='comp-khwayqh22']>button")
    public WebElement subscribe_Button;


    // second way
    @FindBy(css = "#comp-keehv7pd1 h2")
    public WebElement subscribeHeading;

    @FindBy(css = "#comp-keei0711 p")
    public WebElement stayUpToDateHeading;

    @FindBy(id = "input_comp-khwayxk9")
    public WebElement firstNameInputBox;

    @FindBy(id = "input_comp-khwaz4h2")
    public WebElement lastNameInputBox;

    @FindBy(css = "#comp-khwayqh22 button")
    public WebElement subscribeButton;





}
