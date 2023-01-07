package day05_TestNG_Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement HockeyBtn= driver.findElement(By.xpath("//input[@id='hockey']"));
        HockeyBtn.click();
        if(HockeyBtn.isSelected()){
            System.out.println("Button is selected, verification Passed!");
        }else {
            System.out.println("Verification failed");
        }
    }
}
