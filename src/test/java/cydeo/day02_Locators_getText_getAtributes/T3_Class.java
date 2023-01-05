package cydeo.day02_Locators_getText_getAtributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Class {

    public static void main(String[] args) throws InterruptedException {
/*
task----Google Search
Open a chrome browser
go to : https://www.google.com
write apple in a search box
click google search button
verify title
Expected: title should start with "apple" word
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        Thread.sleep(3000);



    }
}