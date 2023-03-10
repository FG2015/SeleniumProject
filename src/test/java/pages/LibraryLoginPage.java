package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUserName;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement fieldRequestErrorMsj;

    @FindBy(xpath = "//div[.='Please enter a valid email address']/div")
    public WebElement enterValidEmailErrorMsj;


    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordMsj;






}
