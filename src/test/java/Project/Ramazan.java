package Project;

import Pages.EventsAnalysisPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class Ramazan {

    LoginPage login;
    EventsAnalysisPage events;


    @Test (priority = 0)
    public void measuresDropdownMenuTest () throws InterruptedException{
        login = new LoginPage();
        events = new EventsAnalysisPage();

        System.out.println("================Ramazan TEST-1 is running================");

        Driver.getDriver().get("http://54.148.96.210/web/login");

        System.out.println("Navigating to: " + Driver.getDriver().getTitle());
        System.out.println();

        Thread.sleep(3000);
        login.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        Thread.sleep(3000);
        login.eventsButton.click();
        Thread.sleep(3000);

        events.measures();
        Thread.sleep(3000);
        List<WebElement> measure = Driver.getDriver().findElements(By.xpath("//ul[@class='dropdown-menu o_pivot_measures_list']//li"));
        measure.remove(7);
        Assert.assertEquals(measure.size(), 8, "Measures menu numbers does not match!!!");
        System.out.println("Measures:");
        int counter = 1;
        for (WebElement i : measure) {
            System.out.println(counter+ ": " + i.getText());
            counter++;
        }
        System.out.println();
        System.out.println("The count of contains of measure dropdown is :" + measure.size());
        if(measure.size()== 8){
            System.out.println("Measures Dropdown Menu verification PASSED!");
            System.out.println();

        }


        Thread.sleep(3000);
        login.eventsButton.click();

    }

    @Test (priority = 1)
    public void measuresAvailableSeatsTest () throws InterruptedException{
        System.out.println("================Ramazan TEST-2 is running================");
        events = new EventsAnalysisPage();
        events.kanbanColorIndex();

        boolean kanbanColorIndexTableCheck = events.kanbanColorIndexTable.isDisplayed();

        Assert.assertTrue( kanbanColorIndexTableCheck,"Kancan Color Index table is NOT displayed!!!");

        if (kanbanColorIndexTableCheck = true){
            System.out.println("Kanban Color Index table is displayed. Verification PASSED!");
            System.out.println();
        }

    }

    @Test(priority = 2)
    public void maximumAttendeesNumberTest() throws InterruptedException{
        System.out.println("================Ramazan TEST-3 is running================");
        events = new EventsAnalysisPage();
        events.maximumAttendeesNumber();

        boolean maximumAttendeesNumberCheck = events.maximumAttendeesNumberTable.isDisplayed();
        Assert.assertTrue(maximumAttendeesNumberCheck, "Maximum Attendeed Number table is NOT displayed!!!");
        if (maximumAttendeesNumberCheck = true){
            System.out.println("Maximum Attendeed Number table is displayed. Verification PASSED!");
            System.out.println();

        }


    }

}
