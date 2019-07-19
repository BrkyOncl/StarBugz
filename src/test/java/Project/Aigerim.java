package Project;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.mustache.StringChunk;
import utilities.Driver;

import java.util.Properties;

public class Aigerim {
    @Test
    public void logInToWebsite() throws InterruptedException {
        Properties p = new Properties();
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lp = new LoginPage();
        lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        Thread.sleep(3000);
        lp.eventsButton.click();
        HomePage hp = new HomePage();
        Thread.sleep(2000);
        Assert.assertTrue(hp.logo.isDisplayed());
        Assert.assertTrue(hp.footer.isDisplayed());
        Assert.assertTrue(hp.calendarButton.isDisplayed()&&hp.calendarButton.isEnabled());
        Assert.assertTrue(hp.listButton.isDisplayed()&&hp.listButton.isEnabled());
        Assert.assertTrue(hp.pivotButton.isDisplayed()&&hp.pivotButton.isEnabled());
        Assert.assertTrue(hp.previousButton.isDisplayed()&&hp.previousButton.isEnabled());
        Assert.assertTrue(hp.nextButton.isDisplayed()&&hp.nextButton.isEnabled());

        String expected = "1-80";
        Assert.assertEquals(hp.currentPageInfo.getText(),expected);
        hp.nextButton.click();
        String expectedAfterClicking = "81-121";
        Assert.assertEquals(hp.currentPageInfo.getText(),expectedAfterClicking);





    }
}
