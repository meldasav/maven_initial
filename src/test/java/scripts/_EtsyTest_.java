package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _EtsyTest_ extends Base {
/*
Go to https://www.etsy.com/
Hover over on "Jewelry & Accessories" menu item
Validate below categories are displayed with their expected texts
Accessories
Bags & Purses
Necklaces
Rings
Earrings
Bracelets
Body Jewelry
All Jewelry
 */

    @Test(priority = 8, description = "Etsy | test")
    public void etsyTest() {
        driver.get("https://www.etsy.com/");
        String[] text = {"Accessories", "Bags & Purses", "Necklaces", "Rings", "Earrings", "Bracelets", "Body Jewelry", "All Jewelry"};
        actions.moveToElement(etsySearchPage.mainHeaderLinks.get(1)).perform();


        for (int i = 0; i < 8; i++) {
            Waiter.waitUntilTextToBePresentInElement(driver, 10, etsySearchPage.jewelryAndAccessoriesItems.get(i), text[i]);
            Assert.assertEquals(etsySearchPage.jewelryAndAccessoriesItems.get(i).getText(), text[i]);
            System.out.println(etsySearchPage.jewelryAndAccessoriesItems.get(i).getText());

        }
    }

}
