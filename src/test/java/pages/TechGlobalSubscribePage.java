package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechGlobalSubscribePage {
    public TechGlobalSubscribePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //This Page factory introduces all the web elements to my driver that i am going to use in the scripts
    @FindBy(css = "div[id='comp-keehv7pd1'] span>span")
    public WebElement subscribeText;

    @FindBy(css = "div[id='comp-keei0711'] span>span")
    public WebElement stayUpToDateText;

    @FindBy(css = "#comp-khwayxk9 input")
    public WebElement firstName;

    @FindBy(css = "div[id='comp-khwaz4h2'] input")
    public WebElement lastName;

    @FindBy(css = "div[id='comp-khwb0zsz'] input")
    public WebElement emailBox;

    @FindBy(css = "div[id='comp-khwayqh22']>button")
    public WebElement subscribe_Button;


    public void subscribe(String first_name, String last_name, String email) {
        firstName.sendKeys(first_name);
        lastName.sendKeys(last_name);
        emailBox.sendKeys(email);
        subscribe_Button.click();
    }

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

    // 3 way

    @FindBy(css = "div[id='comp-keehv7pd1']>h2>span")
    public WebElement subscribeText1;

    @FindBy(css = "div[id='comp-keei0711']>p>span")
    public WebElement stayUpYoDateText1;

    @FindBy(id = "input_comp-khwayxk9")
    public WebElement firstNameInputBox1;

    @FindBy(id = "input_comp-khwaz4h2")
    public WebElement lastNameInputBox1;

    @FindBy(id = "input_comp-khwb0zsz")
    public WebElement emailInputBox1;

    @FindBy(css = "#comp-khwayqh22>button")
    public WebElement subscribeButton1;


}
