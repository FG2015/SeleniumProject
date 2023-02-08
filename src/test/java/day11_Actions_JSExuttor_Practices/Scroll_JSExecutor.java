package day11_Actions_JSExuttor_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class Scroll_JSExecutor {
    @Test
    public void scroll_test(){
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));


        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);


    }
}
