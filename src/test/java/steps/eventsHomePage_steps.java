package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class eventsHomePage_steps {
    HomePage homePage = new HomePage();

    @Given("User sees Brite logo")
    public void user_sees_Brite_logo() {
        Assert.assertTrue(homePage.logo.isDisplayed());
    }

    @Given("User sees footer")
    public void user_sees_footer() {
        Assert.assertTrue(homePage.footer.isDisplayed());

    }

    @When("User clicks next button of Events")
    public void user_clicks_next_button_of_Events() {
       homePage.nextButton.click();

    }

    @Then("User is able to see next page of upcoming events")
    public void user_is_able_to_see_next_page_of_upcoming_events() {

    }
}
