package Project;

import Pages.LoginPage;
import org.testng.annotations.Test;
import utilities.Driver;

public class Aigerim {
    @Test
    public void logInToWebsite() throws InterruptedException {
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lp = new LoginPage();
        lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        Thread.sleep(3000);
        lp.eventsButton.click();

    }
}
