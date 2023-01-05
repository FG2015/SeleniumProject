package cydeo.day03_ccsSelector_xPath.T1_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");
        WebElement inputUserName= driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        WebElement inputPassword=driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");
        WebElement loginButton= driver.findElement(By.className("login-btn"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.className("errortext"));
         String expectedErrorMessage= "Invalid name or Password";
         String actualErrorMessage=errorMessage.getText();
         if(actualErrorMessage.equals(expectedErrorMessage)){
             System.out.println("Error Message verification PASSED!");
         }else {
             System.out.println("Error Message verification FAILED");
         }


    }
}
