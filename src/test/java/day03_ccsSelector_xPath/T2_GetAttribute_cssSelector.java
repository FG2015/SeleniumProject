package day03_ccsSelector_xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_GetAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement signInButton= driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText="Log In";
        String actualButtonText= signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equalsIgnoreCase(expectedButtonText)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

    }
}
