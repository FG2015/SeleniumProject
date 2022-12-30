package day02_Locators_getText_getAtributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {

        /*
        open browser
        go to : https://library2.cybertekschool.com/login.html
        enter the username "incorrect@gmail.com"
        enter the paswoord "incorrect password"
         verify visual " sorry wrong email or password" displayed
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement usernameInput= driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@gmail.com");
        WebElement passwordInput= driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrectPassword");
        WebElement signInInput= driver.findElement(By.tagName("button"));
        signInInput.click();

    }
}
