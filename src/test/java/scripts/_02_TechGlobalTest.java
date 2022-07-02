package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base {
    /*
    1. Go to "https://www.techglobalschool.com/apply-now"
    2. Validate the heading1 is displayed and the text for it is ="Application Form"
     */


    @Test(description = "TC123: Validate Application form heading")
    public void testApplicationFormHeading() {
        driver.get("https://www.techglobalschool.com/apply-now");

        Assert.assertTrue(tgApplicationPage.heading1.isDisplayed());
        Assert.assertEquals(tgApplicationPage.heading1.getText(), "Application Form"); //fails


    }

    @Test
    public void testSubscribe() {
        driver.get("https://www.techglobalschool.com/");
        System.out.println(techGlobalSubscribePage.subscribeHeading.getText());
        System.out.println(techGlobalSubscribePage.subscribeText.getText());

        System.out.println(techGlobalSubscribePage.stayUpToDateHeading.getText());
        System.out.println(techGlobalSubscribePage.stayUpToDateText.getText());

        System.out.println(techGlobalSubscribePage.firstName.getAttribute("placeholder"));
        System.out.println(techGlobalSubscribePage.firstNameInputBox.getAttribute("placeholder"));

        System.out.println(techGlobalSubscribePage.lastName.getAttribute("placeholder"));
        System.out.println(techGlobalSubscribePage.lastNameInputBox.getAttribute("placeholder"));

        System.out.println(techGlobalSubscribePage.emailBox.getAttribute("placeholder"));

        System.out.println(techGlobalSubscribePage.subscribe_Button.getText());
        System.out.println(techGlobalSubscribePage.subscribeButton.getText());
    }
}