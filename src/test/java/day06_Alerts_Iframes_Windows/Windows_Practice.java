package day06_Alerts_Iframes_Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Windows_Practice {
    @Test
    public void windowsTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");


        String mainHandle= driver.getWindowHandle();
        System.out.println(mainHandle);

        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }
}
