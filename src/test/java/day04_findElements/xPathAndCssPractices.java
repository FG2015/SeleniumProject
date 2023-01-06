package day04_findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAndCssPractices {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement header= driver.findElement(By.cssSelector("div.example>h2"));
        WebElement email= driver.findElement(By.cssSelector("label[for='email']"));
        WebElement inputBox=driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrievePassword= driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement cydeoButton=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("cydeoButton.isDisplayed() = " + cydeoButton.isDisplayed());


    }
}
