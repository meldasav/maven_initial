package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation_Practice_01Test extends Base{
    //Register User
    @Test
    public void registerUser(){
        driver.get("https://automationexercise.com/");
        WebElement signUpLoginButton= driver.findElement(By.cssSelector("a[href='/login']"));
        Assert.assertTrue(signUpLoginButton.isDisplayed());
        Assert.assertTrue(signUpLoginButton.isEnabled());
        signUpLoginButton.click();


    }





}
