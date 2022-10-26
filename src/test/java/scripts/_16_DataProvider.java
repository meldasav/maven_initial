package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _16_DataProvider extends Base {

    @Test(priority = 1, dataProvider = "searchKeys")
    public void testGoogleSearch(String key) {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Apple" + Keys.RETURN);
        Assert.assertTrue(driver.getTitle().contains("Apple"));

    }

    @DataProvider
    public Object[] searchKeys() {
        return new Object[]{"Apple", "Orange", "Cucumber", "Gherkin", "Eggplant", "Kiwi","banana"};
    }

    @Test(priority = 2,dataProvider = "getCredentials")
    public void testLogin(String username,String password){
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Form Authentication");
        heroAppPage.username.sendKeys(username);
        heroAppPage.password.sendKeys(password);
        heroAppPage.loginButton.click();
    }

    @DataProvider
    public Object[][] getCredentials() {
        return new Object[][]{{"johndoe", "1234abcd"}, {"alexsmith", "1234"}, {"xsmith", "abc123"}};
    }
}