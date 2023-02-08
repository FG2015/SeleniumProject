package day11_Actions_JSExuttor_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class T1_CircleDragAndDrop {
    @Test
    public void drag_n_drop_test() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));


        Actions actions=new Actions(Driver.getDriver());
        Thread.sleep(2000);
        actions.dragAndDrop(smallCircle,bigCircle).perform();



    }
}
