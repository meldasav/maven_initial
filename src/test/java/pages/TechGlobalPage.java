package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechGlobalPage {
    public TechGlobalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Subscribe']")
    public WebElement subscribeHeading;

    @FindBy(xpath = "//div[@id='comp-keei0711']//span/span[1]")
    public WebElement visibleText;

    @FindBy(css = "#input_comp-khwayxk9")
    public WebElement firstName;

    @FindBy(css = "#input_comp-khwaz4h2")
    public WebElement lastName;

    @FindBy(css = "input_comp-khwb0zsz")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@id='comp-khwayqh22']/button")
    public WebElement subscribeButton;

    @FindBy(css="#img_1_comp-kixnxkbc img")
    public WebElement instagramIcon;

    @FindBy(css = "#img_0_comp-kixnxkbc img")
    public WebElement faceBookIcon;


    public void subscribe(String fName, String lName, String email) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        emailBox.sendKeys(email);
        subscribeButton.click();

    }


}
