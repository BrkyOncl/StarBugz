package Project;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SpecificClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

    public class Elvira {
        SpecificClass SC = new SpecificClass();
        @Test(priority = 1)
        public void firstTest() throws InterruptedException {
            Driver.getDriver().get("http://54.148.96.210/web/login");
            LoginPage lp = new LoginPage();
            lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
            Thread.sleep(3000);
            lp.eventsButton.click();
            HomePage hp = new HomePage();
            Assert.assertTrue(SC.allEvents.isDisplayed());

        }

        @Test(priority = 2)
        public void eventsDetails() throws InterruptedException {
            Driver.getDriver().get("http://54.148.96.210/web/login");
            LoginPage lp = new LoginPage();
            lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
            Thread.sleep(3000);
            lp.eventsButton.click();
            HomePage hp = new HomePage();
            SC.oneOfEvent.click();
            SpecificClass sep = new SpecificClass();
            Assert.assertTrue(sep.verifyingEventDate.isDisplayed());
            Assert.assertFalse(sep.activeButton.isSelected());
            Assert.assertFalse(sep.unPublishButton.isSelected());

        }

        @Test(priority = 3)
        public void makeChanges() throws InterruptedException {
            Driver.getDriver().get("http://54.148.96.210/web/login");
            LoginPage lp = new LoginPage();
            lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
            Thread.sleep(3000);
            lp.eventsButton.click();
            HomePage hp = new HomePage();
            SC.oneOfEvent.click();
            SpecificClass sep = new SpecificClass();
            sep.editButton.click();
            sep.discartButton.click();
            sep.createButton.click();
            sep.cancelEventButton.click();

        }

    }


