package day02_Locators_getText_getAtributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");
        WebElement headerText= driver.findElement(By.tagName("h2"));
        String expectedHeaderText= "Registration Form";
        String actualHeaderText= headerText.getText();
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("HeaderText Verification PASSED");
        }else {
            System.out.println("HeaderText verification FAILED!!!");

            WebElement firstnameInput= driver.findElement(By.name("firstname"));


            String expectedPlaceHolder=" First name";
            String actualPlaceHolder=firstnameInput.getAttribute("placeholder");
            if (actualPlaceHolder.equals(expectedPlaceHolder)){
                System.out.println( "placeholder test verification Passed!");
            }else{
                System.out.println("placeholder test verification  Failed!!!");
            }

        }


    }
}
