package cydeo.day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2-create instance of the driver
        WebDriver driver =new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //3-  go to tesla.com
        driver.get("https://www.tesla.com");
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //stop code execution for 4 seconds
       Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();
        driver.navigate().forward();


        driver.navigate().refresh();

        Thread.sleep(3000);

      driver.navigate().to("https://www.cydeo.com");


     //get the title  of the page
        driver.getTitle();
        System.out.println("drivergettitle = " + driver.getTitle());
        
        //get the current url
        String currentURl= driver.getCurrentUrl();
        System.out.println("currentURl = " + currentURl);

        // this will close the currently opened window
        driver.close();

        //this will close all opened windows






    }
}
