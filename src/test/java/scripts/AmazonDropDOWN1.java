package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonDropDOWN1 extends Base{

    @Test
    public void amazonDropDownValidation(){
        driver.get("https://www.amazon.com/");
        amazonDropDownPage1.dropDown.click();
        Select select =new Select(amazonDropDownPage1.element);
        select.selectByVisibleText("Books");
        amazonDropDownPage1.searchIcon.click();
        for (WebElement element : amazonDropDownPage1.dropdownList){
            Assert.assertTrue(element.isDisplayed());

        }


    }
}
