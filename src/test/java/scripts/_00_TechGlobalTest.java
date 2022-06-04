package scripts;


import org.testng.annotations.Test;


public class _00_TechGlobalTest extends Base{

    @Test
    public void validationSubscribe(){
        driver.get("https://www.techglobalschool.com/apply-now");

        techGlobalPage.subscribe("melda","sav","meldasav@gmail.com");

    }




}
