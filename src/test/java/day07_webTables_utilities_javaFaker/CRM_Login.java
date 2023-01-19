package day07_webTables_utilities_javaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRM_Login {
    @Test
    public void CRM_LogIn_Test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com");




        WebElement loginBox= driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginBox.sendKeys("feridguluzade@gmail.com");
        WebElement passwordBox= driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passwordBox.sendKeys("123455667");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBox.click();

        //expected title: Portal


    }
}
