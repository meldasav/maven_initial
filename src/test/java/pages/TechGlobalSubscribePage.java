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
    public WebElement stayUpToDateTex;

    @FindBy(id="input_comp-khwayxk9")
    public WebElement firstName;

    @FindBy(id="comp-khwaz4h2")
    public WebElement lastName;

    @FindBy(id="comp-khwb0zsz")
    public WebElement emailBox;

    @FindBy(css = "div[id='comp-khwayqh22']>button")
    public WebElement button;


}
