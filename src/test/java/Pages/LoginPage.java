package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,  this);
    }
    @FindBy(xpath = "//input[@id='login']")

    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
       public WebElement passwordInput;

        @FindBy(xpath ="//button[@type='submit']" )
    public WebElement logInButton;

   
        @FindBy(xpath = "//span[@class='oe_menu_text'])[10]")
     public WebElement eventsButton;

    public void logginIn(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInButton.click();
        eventsButton.click();
    }

}
