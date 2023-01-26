package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utilities.WebDriverFactories;

import java.util.concurrent.TimeUnit;

public abstract class testBase{
    public WebDriver driver;
    @BeforeMethod
    public  void setUpMethod(){
        driver= WebDriverFactories.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https//www.google.com");
    }
}
