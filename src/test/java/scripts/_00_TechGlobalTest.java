package scripts;


import org.testng.annotations.Test;
import utilities.Waiter;


public class _00_TechGlobalTest extends Base{

    @Test
    public void validationSubscribe(){
        driver.get("https://www.techglobalschool.com/");
        Waiter.pause(3);

        techGlobalSubscribePage.subscribe("melda","sav","meldasav@gmail.com");
        Waiter.pause(3);

    }




}
