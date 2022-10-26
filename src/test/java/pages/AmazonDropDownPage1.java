package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.DropdownHandler;

import java.util.List;

public class AmazonDropDownPage1 {
    public AmazonDropDownPage1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-search-dropdown-card")
    public WebElement dropDown;

    @FindBy(css = "#searchDropdownBox>option")
    public List<WebElement> dropdownList;

    @FindBy(id= "searchDropdownBox")
    public WebElement element;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchIcon;

    public void validateDropDown(String text) {

        for (WebElement element : dropdownList) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }
        }
    }

}
