package Project;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;

import java.util.Properties;

public class Aigerim {
    @Test
    public void logInToWebsite() throws InterruptedException {
        Properties p = new Properties();
        Driver.getDriver().get(Config.getProperty("url"));
        LoginPage lp = new LoginPage();
        lp.logginIn(Config.getProperty("username"), Config.getProperty("password"));
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
        String expectedAfterClicking = "81-117";
        Assert.assertEquals(hp.currentPageInfo.getText(),expectedAfterClicking);





    }
}
