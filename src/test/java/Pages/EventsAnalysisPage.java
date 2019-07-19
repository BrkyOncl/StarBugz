package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EventsAnalysisPage {
    WebDriver driver;

    public EventsAnalysisPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,  this);
    }

    @FindBy (xpath = "//a[@href='/web#menu_id=129&action=141']")
    public WebElement eventsButtonLeft;


    @FindBy(xpath = "//button[contains(text(), 'Measures')]" )
    public WebElement measuresButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_measures_list']//li")
    public WebElement measuresList;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_measures_list']//li[2]")
    public WebElement kanbanColorIndex;

    @FindBy(xpath = "//th[contains(text(),'Kanban Color')]")
    public WebElement kanbanColorIndexTable;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_measures_list']//li[3]")
    public WebElement maximumAttendeesNumber;

    @FindBy(xpath = "//th[contains(text(),'Maximum Attendees')]")
    public WebElement maximumAttendeesNumberTable;



    public void measures()throws InterruptedException{
        eventsButtonLeft.click();
        Thread.sleep(2000);
        measuresButton.click();
        Thread.sleep(2000);

    }

    public void kanbanColorIndex() throws InterruptedException{
        eventsButtonLeft.click();
        Thread.sleep(2000);
        measuresButton.click();
        Thread.sleep(2000);
        kanbanColorIndex.click();

    }

    public void maximumAttendeesNumber() throws InterruptedException{

        eventsButtonLeft.click();
        Thread.sleep(2000);
        measuresButton.click();
        Thread.sleep(2000);
        maximumAttendeesNumber.click();
    }


}
