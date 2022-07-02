package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

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

}
