package day07_webTables_utilities_javaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    @Test
    public void window_handling_test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        Set<String>allWindowHandles=driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);


            System.out.println("current URL:"+ driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("facebook")){
                break;
            }
        }


        BrowserUtils.switchWindowAndVerify(driver,"facebook");
    }



}
