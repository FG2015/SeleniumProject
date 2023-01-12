package day06_Alerts_Iframes_Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    @Test
    public void AlertTest1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement informationAlertButton= driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        informationAlertButton.click();

        //click OK button from the Alert
        // To be able to click Alert OK button we need to switch driver's focus  Alert Itself
        Alert alert= driver.switchTo().alert();
        alert.accept();

        WebElement result= driver.findElement(By.cssSelector("p[id='result']"));
        String actualResult= result.getText();
        String expectedResult="You successfully clicked an alert";
        Assert.assertEquals(actualResult,expectedResult);




    }
}
