package day10_upload_actions_JSexcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class Upload_Practice {
    @Test
    public void upload_Test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        String path="C:\\Users\\User\\Desktop\\Automation\\HTML\\tomato.jpg";


        WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);

        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();


    }
}
