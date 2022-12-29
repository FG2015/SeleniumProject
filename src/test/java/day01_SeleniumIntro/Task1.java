package day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        // TC: #1: Yahoo title verification
        // do set up for browser driver
        WebDriverManager.chromedriver().setup();

         // 1- Open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        //  2- Go to https://www.cnn.com

        driver.get("https://www.cnn.com");
        //  3- Verify Title:
        //   Expected Yahoo:

        String expectedTitle= "CNN International - Breaking News, US News, World News and Video";

        String actualTitle= driver.getTitle();

       if (actualTitle.equals(expectedTitle)){
           System.out.println("Expected");
       }else
           System.out.println("failed");


    }
}
