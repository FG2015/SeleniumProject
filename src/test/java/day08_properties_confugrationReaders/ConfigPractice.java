package day08_properties_confugrationReaders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactories;

import java.util.concurrent.TimeUnit;

public class ConfigPractice {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactories.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void google_search_test(){
        WebElement googleSearchBox= driver.findElement(By.cssSelector("input[class='gLFyf']"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
    }


}