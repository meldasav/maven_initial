package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonDropDownPage {
    public AmazonDropDownPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#searchDropdownBox")
    public WebElement allDropDown;

    @FindBy(css="option[value*='search-alias=baby']")
    public WebElement baby;

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "#nav-search-submit-button")
    public WebElement searchIcon;

    @FindBy(xpath = "//option[text()='All Departments']")
    public List<WebElement> allDepartments;
}
