package Project;

import Pages.CreatePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class Berkay{

    @BeforeMethod
      public void setUp() throws InterruptedException {
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lgp = new LoginPage();
        lgp.logginIn("EventsCRM_Manager5@info.com",
                "Ugh45wQ16");
        Thread.sleep(2000);
        lgp.eventsButton.click();
        HomePage homePage = new HomePage();
        homePage.createButton.click();
    }

    @Test
    public void createPageStartDatePastThenEndDate() throws InterruptedException {



        CreatePage create = new CreatePage();


        create.eventName.sendKeys("Test");
        create.startDate.sendKeys("07/20/2019");
        create.endDate.sendKeys("07/15/2019");
        create.confirmEvent.click();

        if (create.errorText.isDisplayed() && create.errorText.getText().equals("Closing Date cannot be set before Beginning Date.")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        create.okButtonOnErrorWindow.click();

    }
        @Test

            public void createEventMinAttendeesEnterManyNumber() throws InterruptedException {



            CreatePage create = new CreatePage();
            create.minimumAttendees.sendKeys("2222222222222222222222222222222222222222");
            create.confirmEvent.click();
            if (Driver.getDriver().getCurrentUrl().equals("http://54.148.96.210/web?#id=&view_type=form&model=event.event&menu_id=128&action=142")) {
                System.out.println("Passed");
            } else {
                System.out.println("failled");
            }
        }
          @Test

          public void createPageConfirmEvent(){

            CreatePage create = new CreatePage();
            create.eventName.sendKeys("test");
            create.startDate.sendKeys("07/20/2019");
            create.endDate.sendKeys(("07/25/2019"));
            create.minimumAttendees.sendKeys("5");
            create.confirmEvent.click();
            create.finishEventButton.click();

            if(create.createdEventInfo.isDisplayed()){
                System.out.println("Passed");
              }
            else{
                System.out.println("Failed");
            }


          }








    }

