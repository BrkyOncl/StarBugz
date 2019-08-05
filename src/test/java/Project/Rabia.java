package Project;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Rabia {

    LoginPage login ;
    @Test(priority = 1)
    public void verifySearchButton() throws InterruptedException {
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lp = new LoginPage();
        lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        lp.eventsButton.click();

        HomePage hp = new HomePage();
        Assert.assertTrue(hp.searchUpcomingButton.isDisplayed(),"Upcoming filter is not showing as expected");
        Assert.assertTrue(hp.searchButton.isDisplayed(),"Search button Not displaying");
        Assert.assertTrue(hp.plusSign.isDisplayed(),"Plus sign Not displayed");

    }

    @Test(priority = 2)
    public void advangeSearch() throws InterruptedException {
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lp = new LoginPage();
        lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        lp.eventsButton.click();
        Thread.sleep(3000);

        HomePage hp = new HomePage();
        Thread.sleep(3000);
        hp.plusSign.click();
        Assert.assertTrue(hp.filtersDropdown.isDisplayed(),"Filter button is Not display as expected");
        Assert.assertTrue(hp.groupByDropdown.isDisplayed(),"Group By button is Not display as expected");
        Assert.assertTrue(hp.favoritesDropDown.isDisplayed(),"Favorites button is Not display as expected");
        Assert.assertTrue(hp.minusSign.isDisplayed());
        Thread.sleep(3000);

        hp.minusSign.click();


    }

    @Test(priority = 3)
    public void verifyAdvangeSearchDropDowns() throws InterruptedException {
        Driver.getDriver().get("http://54.148.96.210/web/login");
        LoginPage lp = new LoginPage();
        lp.logginIn("EventsCRM_Manager5@info.com", "Ugh45wQ16");
        Thread.sleep(3000);
        lp.eventsButton.click();
        HomePage hp = new HomePage();
        Thread.sleep(2000);
        hp.plusSign.click();
        Thread.sleep(3000);

        hp.filtersDropdown.click();
        Thread.sleep(3000);

        int expectedDetailsOfFiltersDropdown = 13;
        Assert.assertTrue(hp.filtersDropdownDetails.size() == expectedDetailsOfFiltersDropdown);

        hp.groupByDropdown.click();
        Thread.sleep(3000);

        int expectedDetailsOfGroupByDropdown =8;
        Assert.assertTrue(hp.groupbyDropdownDetails.size() == expectedDetailsOfGroupByDropdown);
        Thread.sleep(3000);

        hp.favoritesDropDown.click();
        int expectedDetailsOfFavoritesDropdown = 11;
        Assert.assertTrue(hp.favoritesDropdownDetails.size()== expectedDetailsOfFavoritesDropdown);

    }


}
