package day02_Locators_getText_getAtributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice {
    public static void main(String[] args) {

        //TC: #2  Back and Forth navigation
        // open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        // go to :  https://practice.cydeo.com
        driver.get(" https://practice.cydeo.com");
        //  click A/B from top of the list
        driver.findElement(By.linkText("A/B Testing")).click();
        // verify title is:
        // Expected: no A/B test
        String expectedTitle="A/B Testing";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("FAILED!!!");
        }
        //  go back to home page by using .back()
        driver.navigate().back();
        //  verify title equals
        //  expected :Practice




    }
}
