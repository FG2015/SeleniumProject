package day07_webTables_utilities_javaFaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


    public class toDoMvc_Test {
        public static void main(String[] args) {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://todomvc.com");
            String currentTitel = driver.getTitle();
            System.out.println(currentTitel);


//1. The first step should be to load the website, click within the JavaScript tab, and select the Polymer link.
            WebElement JavaScriptTab = driver.findElement(By.xpath("//div[.='JavaScript']"));
            JavaScriptTab.click();
            String expectedTitle = "TodoMVC";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);

            WebElement Polymer = driver.findElement(By.xpath("//a[text()='Polymer']"));
            Polymer.click();

//2. The second step should be: Add two Todo items
            WebElement toDoBox = driver.findElement(By.xpath("//input[@id='new-todo']"));
            toDoBox.sendKeys("go to hell" + Keys.ENTER);
            toDoBox.sendKeys("recycle me" + Keys.ENTER);


        }
    }