package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
   private WebDriver driver;

    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,  this);
    }
    @FindBy(xpath = "//input[@id='login']")

    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
       private WebElement passwordInput;

        @FindBy(xpath ="//button[@type='submit']" )
    private WebElement logInButton;

   
        @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[6]/span")
     public WebElement eventsButton;

    public void logginIn(String username, String password) throws InterruptedException {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInButton.click();


    }

}
