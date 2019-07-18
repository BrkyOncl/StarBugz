package Project;

import Pages.LoginPage;
import org.testng.annotations.Test;
import utilities.Driver;

public class Aigerim {
    @Test
    public void logInToWebsite(){
        Driver.getDriver().get("http://54.148.96.210/web/login");

        LoginPage blp = new LoginPage();
        blp.logginIn("EventsCRM_Manager5@info.com",
                "Ugh45wQ16");

    }
}
