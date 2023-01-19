package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_utilities {

    public static void crm_login(WebDriver driver){

        WebElement loginBox= driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginBox.sendKeys("feridguluzade@gmail.com");
        WebElement passwordBox= driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passwordBox.sendKeys("123455667");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBox.click();

    }
}
