package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class CreatePage {

    private WebDriver driver;

    public CreatePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

     @FindBy(xpath = "//h1/input[@name='name']")
    public WebElement eventName;

     @FindBy(xpath = "//div/button[@class='btn btn-sm btn-default oe_highlight']")
    public WebElement confirmEvent;

     @FindBy(xpath = "//input[@name='date_begin']")
    public WebElement startDate;

     @FindBy(xpath = "(//input[@class='o_datepicker_input o_input'])[2]")
    public WebElement endDate;

     @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement errorText;

     @FindBy(xpath = "//input[@name='seats_min']")
    public WebElement minimumAttendees;

     @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButtonOnErrorWindow;

     @FindBy(xpath = "(//button[@class='btn btn-sm btn-default oe_highlight'])[2]")
    public WebElement finishEventButton;

     @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement createdEventInfo;
}
