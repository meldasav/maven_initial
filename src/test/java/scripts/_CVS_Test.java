package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _CVS_Test extends Base {
    @Test(priority = 1, description = "Validate Browse by category menuItems")
    public void menuItemsTest() {
        driver.get("https://www.cvs.com/");
        String[] menuItemsTest = {"All products",
                                      "Vitamins",
                                        "Beauty",
                             "Health & medicine",
                              "Home health care",
                                 "Personal care",
                                         "Photo",
                              "Diet & nutrition",
                                    "All deals"};
        for (int i = 0; i < cvsHomePage.categoryItems.size(); i++) {
            Assert.assertTrue(cvsHomePage.categoryItems.get(i).isDisplayed());
            Assert.assertEquals(cvsHomePage.categoryItems.get(i).getText(), menuItemsTest[i]);

        }
    }

    @Test(priority = 2,description = "VALIDATE CVS 6 CARDS ")
      public void cardsTest(){
        driver.get("https://www.cvs.com/");
        cvsHomePage.clickOnCards("Travel health");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.cvs.com/minuteclinic/services/travel-health");

    }
}
