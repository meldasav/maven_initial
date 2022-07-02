package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CvsHomePage {
    public CvsHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div[class='category-section'] a")
    public List<WebElement> categoryItems;

    @FindBy(xpath = "(//ul[@class='ctas'])[1]//a")
    public List<WebElement> cards;

    public void clickOnCards(String text){
        for (WebElement element : cards){
            if(element.getText().equals(text)){
                element.click();
                break;
            }
        }
    }
}
