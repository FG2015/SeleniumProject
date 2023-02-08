package utilities;


import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

import java.util.concurrent.*;

public class Driver {


    private Driver(){}


    private static WebDriver driver; // value is null by default


    public static WebDriver getDriver(){

        if (driver == null){


            String browserType = Configuration_Reader.getProperty("browser");



            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit(); // this line will terminate the existing session. value will not even be null
            driver = null;
        }
    }

}