package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecGlobalSchoolHomePage {
    public TecGlobalSchoolHomePage(WebDriver driver){
        PageFactory.initElements(driver ,this);
    }

    @FindBy(id = "dataItem-kuiqff9g-comp-kixnxkbc")
    public WebElement faceBookIcon;

    @FindBy(css="#img_1_comp-kixnxkbc img")
    public WebElement instagramIcon;

    @FindBy(css = "#comp-kvjohd5t5>a")
    public WebElement registerForIntroLink;

}
