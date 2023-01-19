package day08_properties_confugrationReaders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactories;

import java.util.concurrent.TimeUnit;

public class WebTable_OrderVerify {
public WebDriver driver;

    @BeforeMethod
            public void setUpMethod(){
        driver= WebDriverFactories.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");


    }

    @Test
    public void orderVerifyTest(){
        WebElement bobMartinCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        bobMartinCell.getText();
        String actualBobName=bobMartinCell.getText();
        String expectedBobName="Bob Martin";
        Assert.assertEquals(actualBobName,expectedBobName);

        WebElement bobMartinDateCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String actualBobMartinDateCell=bobMartinDateCell.getText();
        String expectedDateCell="12/31/2021";
        Assert.assertEquals(actualBobName,expectedBobName);

    }
}
