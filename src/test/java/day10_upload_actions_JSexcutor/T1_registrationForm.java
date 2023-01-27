package day10_upload_actions_JSexcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Configuration_Reader;
import utilities.Driver;

public class T1_registrationForm {
    @Test
    public void registration_Form_Test(){
        Driver.getDriver().get(Configuration_Reader.getProperty("registration.form.url"));
        WebElement inputFirstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));

    }
}
