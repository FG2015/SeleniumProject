package day12_Synchronization_ExplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;

public class Practice {
    @Test
    public void test1(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");
        Driver.getDriver().findElement(By.partialLinkText("Example 7"));
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(driver -> ("Dynamic title"));


    }
}
