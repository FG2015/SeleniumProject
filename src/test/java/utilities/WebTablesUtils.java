package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesUtils {





    public static String returnOrderDate(WebDriver driver,String costumerName){
        String locator="//td[.='Bob Martin']/following-sibling::td[3]";
        WebElement customerDateCell= driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

    }

}
