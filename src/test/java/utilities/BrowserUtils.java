package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    public void sleep(int second) {

        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedURL) {

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);


            System.out.println("current URL:" + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedURL)) {
                break;

            }
        }
    }
}