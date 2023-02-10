package day12_Synchronization_ExplicitWaits;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LibraryLoginPage;
import utilities.Driver;

public class LibraryPOMPractices {
    @Test
    public void required_field_error_msj_test(){
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.fieldRequestErrorMsj.isDisplayed());
        Driver.closeDriver();



    }

    @Test
    public void wrong_email_address(){
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
        libraryLoginPage.inputUserName.sendKeys("ghkgy");

    }


}
