package day08_properties_confugrationReaders;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Configuration_Practices {
    @Test
    public void google_search_test(){



        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");


            WebElement denyAll = driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
            denyAll.click();

            WebElement googleSearchBox= driver.findElement(By.cssSelector("input[class='gLFyf']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);





         //  WebElement googleSearchBox= driver.findElement(By.cssSelector("input[class='gLFyf']"));
        //googleSearchBox.sendKeys("apple"+ Keys.ENTER);





    }
}
