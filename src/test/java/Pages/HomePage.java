package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    WebDriver driver;

    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,  this);
    }

}
