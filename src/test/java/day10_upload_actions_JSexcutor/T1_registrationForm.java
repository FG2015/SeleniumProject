package day10_upload_actions_JSexcutor;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Configuration_Reader;
import utilities.Driver;

public class T1_registrationForm {
    @Test
    public void registration_Form_Test(){
        Driver.getDriver().get(Configuration_Reader.getProperty("registration.form.url"));

        Faker faker= new Faker();


        WebElement inputFirstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUserName= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        // inputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        inputUserName.sendKeys(faker.bothify("helpdesk####"));

        WebElement inputEmail=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(faker.bothify("fg.423@gmail.com"));

        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys("h12345454677");


        WebElement inputPhone=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        WebElement inputGender=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        inputGender.click();


        WebElement inputBirthday=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        faker.number().numberBetween(1975,2006);
        inputBirthday.sendKeys("08/02/2000");


        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //job_title

        Select jobTitleDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(3);



        // Select programmingLanguageDropdown= new Select(Driver.getDriver().findElement(By.xpath("//input[@value='java']")));
        //jobTitleDropdown.selectByValue("java");

        WebElement inputProgrammingLanguage=Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        inputProgrammingLanguage.click();

        WebElement signUp= Driver.getDriver().findElement(By.cssSelector("button[type='submit']"));
        signUp.click();









    }
}
