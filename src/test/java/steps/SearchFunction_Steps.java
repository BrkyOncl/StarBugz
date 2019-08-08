package steps;

import pages.HomePage;
import pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SearchFunction_Steps {

    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();


    @Given("User is on the events page")
    public void user_is_on_the_events_page()  {
        Driver.getDriver().get(Config.getProperty("url"));
        lp.logginIn(Config.getProperty("username"), Config.getProperty("password"));
        lp.eventsButton.click();
    }


    @When("User sees search box")
    public void user_sees_search_box() {

        Assert.assertTrue("Search button Not displaying",hp.searchButton.isDisplayed());



    }

    @When("User sees Upcoming button")
    public void user_sees_Upcoming_button() {
        Assert.assertTrue("Upcoming filter is not showing as expected",hp.searchUpcomingButton.isDisplayed());
    }

    @When("User sees plus icon")
    public void user_sees_plus_icon() {
        Assert.assertTrue("Plus sign Not displayed",hp.plusSign.isDisplayed());

    }



    @When("User hover overs to plus icon")
    public void user_hover_overs_to_plus_icon() throws InterruptedException {
        String expectedIconName = "Advance Search";
        Thread.sleep(3000);
       Assert.assertTrue(hp.plusSign.isDisplayed());

    }

    @When("User clicks on the plus icon")
    public void user_clicks_on_the_plus_icon() {
        hp.plusSign.click();
        Assert.assertTrue("Filters drop-down is NOT displaying",hp.filtersDropdown.getText().equalsIgnoreCase("Filters"));
        Assert.assertTrue("Group-By drop-down is NOT displaying",hp.groupByDropdown.getText().equalsIgnoreCase("Group By"));
        Assert.assertTrue("Favorites drop-down is NOT displaying",hp.favoritesDropDown.getText().equalsIgnoreCase("Favorites"));

    }

    @Then("User clicks on the minus icon")
    public void user_clicks_on_the_minus_icon() {
        hp.minusSign.click();

    }

    @When("User clicks on plus icon")
    public void user_clicks_on_plus_icon() throws InterruptedException {
        Thread.sleep(3000);
        hp.plusSign.click();
    }


    @Then("User sees three drop downs")
    public void user_sees_three_drop_downs() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        hp.filtersDropdown.click();
        int expectedDetailsOfFiltersDropdown = 13;
        Assert.assertTrue(hp.filtersDropdownDetails.size() == expectedDetailsOfFiltersDropdown);

        hp.groupByDropdown.click();

        int expectedDetailsOfGroupByDropdown =8;
        Assert.assertTrue(hp.groupbyDropdownDetails.size() == expectedDetailsOfGroupByDropdown);

        hp.favoritesDropDown.click();
        int expectedDetailsOfFavoritesDropdown = 11;
        Assert.assertTrue(hp.favoritesDropdownDetails.size()== expectedDetailsOfFavoritesDropdown);

    }


}
