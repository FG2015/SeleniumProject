package day02_Locators_getText_getAtributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_googleSearch {
    public static void main(String[] args) {
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
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


    }
}
