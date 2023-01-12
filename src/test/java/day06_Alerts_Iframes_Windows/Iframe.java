package day06_Alerts_Iframes_Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {
    @Test
    public void IframeTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement YourContentGoesHere= driver.findElement(By.xpath("//p"));
        Assert.assertTrue(YourContentGoesHere.isDisplayed());

        //verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        // to be able to verify header we must be back to main HTML

        driver.switchTo().parentFrame();
        WebElement header= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed());


    }
}
