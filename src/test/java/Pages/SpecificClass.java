package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpecificClass {

        private WebDriver driver;

        public SpecificClass() {
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);


        }

        @FindBy(xpath = "//ol[@class='breadcrumb']/li[2]")
        public WebElement dateofEvent;

        @FindBy(xpath = "//div[@class='oe_kanban_color_0 oe_kanban_card oe_kanban_global_click o_kanban_record'][1]")
        public WebElement oneOfEvent;

        @FindBy(xpath =  "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']")
        public WebElement allEvents;


        @FindBy(xpath = "//ol[@class='breadcrumb']/li[2]")
        public WebElement verifyingEventDate ;

        @FindBy(xpath = "//span[@class='o_stat_text o_not_hover text-success']")
        public WebElement activeButton;

        @FindBy(xpath = "//span[@class=\'o_stat_text o_value text-danger\']")
        public WebElement unPublishButton;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
        public WebElement editButton;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement saveButton;

        @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
        public WebElement discartButton;

        @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_create']")
        public WebElement createButton;

        @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
        public WebElement confirmEventButton;

        @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
        public WebElement cancelEventButton;

}
