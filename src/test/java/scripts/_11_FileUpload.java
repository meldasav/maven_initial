package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _11_FileUpload extends Base {

    @Test(priority = 1, description = "File upload")
    public void testFileUpload1() {
        driver.get("http://the-internet.herokuapp.com/");
        Waiter.pause(2);
        heroAppPage.clickOnLink("File Upload");
        Waiter.pause(2);
        heroAppPage.chooseFileInputBox.sendKeys("/Users/meldasav/IdeaProjects/testng_framework/myFileMsv.txt");
        Waiter.pause(10);
        heroAppPage.uploadFileButton.click();


        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "myFileTech2.xls");

    }


    @Test(priority = 1, description = "File download")
    public void testFileDownload1() {
        driver.get("http://the-internet.herokuapp.com/");
        Waiter.pause(2);
        heroAppPage.clickOnLink("File download");
        Waiter.pause(2);
        heroAppPage.chooseFileInputBox.sendKeys("/Users/meldasav/IdeaProjects/testng_framework/myFileMsv.txt");
        Waiter.pause(10);
        heroAppPage.uploadFileButton.click();

        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "myFileTech2.xls");

    }
}