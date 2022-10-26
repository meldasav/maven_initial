package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeroOkuPage {
    public HeroOkuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='large-6 small-12 columns large-centered']/h3")
    public WebElement mainHeader;


    @FindBy(css="div[class='example']>p")
    public WebElement secondText;

    @FindBy(css="input[type='number']")
    public WebElement inputBox;

}
