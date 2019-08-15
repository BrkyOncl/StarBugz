package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,  this);

    }

    @FindBy (xpath = "//img[@src='http://54.148.96.210/web/binary/company_logo?db=BriteErpDemo&company=1']")
        public WebElement logo;
    @FindBy (xpath = "//div[@class='o_sub_menu_footer']")
    public WebElement footer;
    @FindBy (xpath = "//button[@aria-label='calendar']")
    public WebElement calendarButton;
    @FindBy (xpath = "//button[@aria-label='list']")
    public  WebElement listButton;
    @FindBy (xpath = "//button[@aria-label='pivot']")
    public  WebElement pivotButton;
    @FindBy (xpath = "//button[@aria-label='Previous']")
    public  WebElement previousButton;
    @FindBy (xpath = "//button[@aria-label='Next']")
    public  WebElement nextButton;
    @FindBy (xpath = "//span[@class = 'o_pager_value']")
    public WebElement currentPageInfo;



    @FindBy(xpath = "//div[@class='o_facet_values']")
    public WebElement searchUpcomingButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[contains(@class,'search-plus')]")
    public WebElement plusSign;


    @FindBy(xpath = "//button[contains(@class,'dropdown-toggle')]")
    public WebElement filtersDropdown;


    @FindBy(xpath = "(//button[contains(@class,'dropdown-toggle')])[2]")
    public WebElement groupByDropdown;

    @FindBy(xpath = "(//button[contains(@class,'dropdown-toggle')])[3]")
    public WebElement favoritesDropDown;

    @FindBy(xpath = "//span[contains(@class,'fa-search-minus')]")
    public WebElement minusSign;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_filters_menu']/li")
    public List<WebElement> filtersDropdownDetails;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_group_by_menu']/li")
    public List<WebElement> groupbyDropdownDetails;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_favorites_menu']/li")
    public List<WebElement> favoritesDropdownDetails;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class = 'o_calendar_button_today btn btn-sm btn-primary']")
    public WebElement todayButtonOnCalendar;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measuresButtonOnPivot;


















}
