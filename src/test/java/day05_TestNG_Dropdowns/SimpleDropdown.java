package day05_TestNG_Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropdown {




    @Test
    public void simpleDropDownTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
       Select simpleDropdown= new Select(driver.findElement(By.cssSelector("select[id='dropdown']")));
        WebElement currentlySelectedOptıon= simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdownTest= currentlySelectedOptıon.getText();
        System.out.println(actualSimpleDropdownTest);


        Select stateDropDown= new Select(driver.findElement(By.cssSelector("select[id='state']")));





    }
}
