package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecGlobalSchoolHomePage {
    public TecGlobalSchoolHomePage(WebDriver driver){
        PageFactory.initElements(driver ,this);
    }

    @FindBy(css = "#img_0_comp-kixnxkbc img")
    public WebElement faceBookIcon;

    @FindBy(css="#img_1_comp-kixnxkbc img")
    public WebElement instagramIcon;
}
