package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeroAppPage {
    public HeroAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul/li/a")
    public List<WebElement> links;

    @FindBy(css = "#checkboxes>input")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "//ul//button")
    public List<WebElement> alertButtons;

    @FindBy(id = "result")
    public WebElement resultParagraph;

    @FindBy(xpath = "//a[text()='iFrame']")
    public WebElement iFrameLink;

    @FindBy(css = "#tinymce>p")
    public WebElement contentBox;

    @FindBy(xpath = "//h3")
    public WebElement iFrameHeading3;

    @FindBy(id = "mce_0_ifr")
    public WebElement innerIFrame;

    @FindBy(css=".example a")
    public WebElement clickHereLink;

    @FindBy(xpath = "//h3")
    public WebElement heading3;

    @FindBy(xpath = "//h3")
    public WebElement openingHeading3;

    @FindBy(id = "file-upload")
    public WebElement chooseFileInputBox;

    @FindBy(id = "file-submit")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//h3")
    public WebElement fileUploadedH3;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFileText;


    public void clickOnLink(String linkText){
        for (WebElement link : links) {
            if(link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }

    public void clickOnAlertButton(String buttonText){
        for(WebElement element: alertButtons){
            if(element.getText().equals(buttonText)){
                element.click();
                break;
            }
        }
    }
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "")
    public WebElement loginButton;

    public static boolean click(WebElement loginButton){
        return loginButton.isDisplayed();
    }

}