package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;
    WebDriverWait explicitWait;
    Wait fluentWait;
    EtsySearchPage etsySearchPage;
    TGApplicationPage tgApplicationPage;
    GoogleSearchPage googleSearchPage;
    GoogleSearchResultPage googleSearchResultPage;
    HeroAppPage heroAppPage;
    FaceBookPage faceBookPage;
    ExpediaPage expediaPage;
    EbayDropDownPage ebayDropDownPage;
    AmazonDropDownPage amazonDropDownPage;
    SoftAssert softAssert;
    Actions actions;
    JavascriptExecutor js;
    TechGlobalPage techGlobalPage;
    AmazonSignInPage amazonSignInPage;
    RediffHomePage rediffHomePage;
    TecGlobalSchoolHomePage tecGlobalSchoolHomePage;
    TechGlobalSubscribePage techGlobalSubscribePage;
    CvsHomePage cvsHomePage;
    AmazonDropDownPage1 amazonDropDownPage1;
    ClearCoverPage clearCoverPage;


    @BeforeMethod(alwaysRun = true)
    public void setup(){
        driver = Driver.getDriver();
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        softAssert=new SoftAssert();
        actions=new Actions(driver);
        js=(JavascriptExecutor)driver;
        etsySearchPage = new EtsySearchPage(driver);
        tgApplicationPage = new TGApplicationPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchResultPage=new GoogleSearchResultPage(driver);
        heroAppPage =new HeroAppPage(driver);
        faceBookPage=new FaceBookPage(driver);
        expediaPage=new ExpediaPage(driver);
        ebayDropDownPage=new EbayDropDownPage(driver);
        amazonDropDownPage=new AmazonDropDownPage(driver);
        techGlobalPage=new TechGlobalPage(driver);
        amazonSignInPage=new AmazonSignInPage(driver);
        rediffHomePage=new RediffHomePage(driver);
        tecGlobalSchoolHomePage=new TecGlobalSchoolHomePage(driver);
        techGlobalSubscribePage=new TechGlobalSubscribePage();
        cvsHomePage=new CvsHomePage();
        amazonDropDownPage1=new AmazonDropDownPage1();
        clearCoverPage=new ClearCoverPage();
    }

    @AfterMethod(alwaysRun = true)

    public void teardown(){
        // TODO if there is a failure it will take a screen shot
        softAssert.assertAll();
        Driver.quitDriver();
    }

}






