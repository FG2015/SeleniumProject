package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTablesUtils {





    public static String returnOrderDate(WebDriver driver,String costumerName){
        String locator="//td[.='Bob Martin']/following-sibling::td[3]";
        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

    }

    public static void orderVerify(WebDriver driver, String costumerName,String expectedOrderDate){
        String locator="//td[.='Bob Martin']/following-sibling::td[3]";
        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        String actualOrderDate=customerDateCell.getText();
        Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }

}
