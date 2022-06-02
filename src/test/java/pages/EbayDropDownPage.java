package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayDropDownPage {
    public EbayDropDownPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#gh-cat")
    public WebElement allCategoriesDropDown;

    @FindBy(xpath = "//div[@id='gh-cat-box']// option[3]")
    public WebElement art;

    @FindBy(css="#gh-btn")
    public WebElement search;

    @FindBy(tagName = "h1")
    public WebElement heading1;

    @FindBy(xpath = "//h2[contains(@class,'title-banner__')]")
    public WebElement heading2;
}
