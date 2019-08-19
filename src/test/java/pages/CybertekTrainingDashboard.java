package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CybertekTrainingDashboard {

    private WebDriver driver;

    public CybertekTrainingDashboard(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//div[@id='sidebar-menu']/ul/li[3]/a")
    public WebElement teachersModule ;

    @FindBy (xpath = "//div[@id='sidebar-menu']/ul/li[3]/ul/li[2]")
    public WebElement addTeacherModule;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[1]")
    public WebElement firstName;


    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[2]")
    public WebElement email;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[3]")
    public WebElement password;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[4]")
    public WebElement subject;


    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[5]/select")
    public WebElement gender;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[5]")
    public WebElement birthDate;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[7]/select")
    public WebElement batch;


    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[6]")
    public WebElement lastName;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[7]")
    public WebElement joiningDate;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[8]")
    public WebElement confirmPassword;


    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[9]")
    public WebElement mobileNumber;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group'])[12]/select")
    public WebElement department;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[10]")
    public WebElement salary;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[11]")
    public WebElement section;

    @FindBy (xpath = "//form/div[@class='form-group']/textarea")
    public WebElement permanentAddress;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "(//div[@class='profile-widget'])[18]/h4/a")
    public WebElement newTeacher;

    @FindBy (xpath = "//div[@id='sidebar-menu']/ul/li[4]/a")
    public WebElement studentsModule;

    @FindBy (xpath = "//div[@id='sidebar-menu']/ul/li[4]/ul/li[2]")
    public WebElement addStudentModule;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[10]")
    public WebElement AdmissionNo;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[11]")
    public WebElement major;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[12]")
    public WebElement studentSection;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[13]")
    public WebElement companyName;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[14]")
    public WebElement startDate;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[15]")
    public WebElement street;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[16]")
    public WebElement state;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[17]")
    public WebElement title;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[18]")
    public WebElement city;

    @FindBy (xpath = "(//div[@class='form-group custom-mt-form-group']/input)[19]")
    public WebElement zipCode;

    @FindBy (xpath = "(//div[@class='profile-widget'])[8]/h4/a")
    public WebElement newStudent;

    @FindBy (xpath = "//div[@id='sidebar-menu']/ul/li[3]/ul/li/a")
    public WebElement allTeachers;

    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-12 col-lg-4 col-xl-3']/div/div[3]")
    public List<WebElement> listOfTeacher;

    @FindBy (xpath = "//div[@class='row staff-grid-row']/div[89]/div/div[2]/a/i")
    public WebElement threeDotOptions;

    @FindBy(xpath = "(//div[@class='profile-widget'])[89]/div[2]/div/a[2]")
    public WebElement teacherDeleteButton;

    @FindBy(xpath = "//div[@id='sidebar-menu']/ul/li[4]/ul/li")
    public WebElement allStudents;


    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-12 col-lg-4 col-xl-3']/div/h4")
    public List<WebElement> listOfStudent ;



    @FindBy(xpath = "(//div[@class='profile-widget'])[46]/div[2]/div/a[2]")
    public WebElement deleteStudent;












}
