package day11_Actions_JSExuttor_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class Actions_Practices {
    @Test
    public void task_practices(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Actions actions=new Actions(Driver.getDriver());

        WebElement cydeoLinkButton=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLinkButton).perform();


        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
