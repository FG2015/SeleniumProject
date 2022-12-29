import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {


        //  in this line we create our browser driver
        WebDriverManager.chromedriver().setup();


        //open our browser
        WebDriver driver= new ChromeDriver();
//  here exactly getting where we want
        driver.get("https://www.facebook.com");
    }
}
