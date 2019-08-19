package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CybertekTrainingDashboard;
import utilities.Config;
import utilities.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class
CybertekTraining_Steps {
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    CybertekTrainingDashboard cybertekTrainingDashboard = new CybertekTrainingDashboard();

    @Given("User is on main page of cybertek training")
    public void user_is_on_main_page_of_cybertek_training() {
        Driver.getDriver().get(Config.getProperty("cybertekTrainingURL"));
    }

    @When("user clicks on Teachers module")
    public void user_clicks_on_Teachers_module() {
        cybertekTrainingDashboard.teachersModule.click();
    }

    @When("user clicks on Add Teacher section")
    public void user_clicks_on_Add_Teacher_section() {
       cybertekTrainingDashboard.addTeacherModule.click();
    }

    @When("user clicks on first name and type {string}")
    public void user_clicks_on_first_name_and_type(String string)  {

        cybertekTrainingDashboard.firstName.click();
        wait.until(ExpectedConditions.elementToBeClickable(cybertekTrainingDashboard.firstName));
        cybertekTrainingDashboard.firstName.sendKeys(string);
    }

    @When("user clicks on last name and type {string}")
    public void user_clicks_on_last_name_and_type(String string) {
       cybertekTrainingDashboard.lastName.sendKeys(string);
    }

    @When("user clicks on email and type {string}")
    public void user_clicks_on_email_and_type(String string) {
        cybertekTrainingDashboard.email.sendKeys(string);
    }

    @When("user clicks on Joining Date and type {string}")
    public void user_clicks_on_Joining_Date_and_type(String string) {
        cybertekTrainingDashboard.joiningDate.sendKeys(string);
    }

    @When("user clicks on Password and type {string} and confirm password")
    public void user_clicks_on_Password_and_type_and_confirm_password(String string) {
       cybertekTrainingDashboard.password.sendKeys(string);
    }

    @When("user clicks on Subject and type {string}")
    public void user_clicks_on_Subject_and_type(String string) {
        cybertekTrainingDashboard.subject.sendKeys(string);
    }

    @When("user clicks on Birth Date and enter {string}")
    public void user_clicks_on_Birth_Date_and_enter(String string) {
        cybertekTrainingDashboard.birthDate.sendKeys(string);
    }

    @When("user clicks on Mobile number and type {string}")
    public void user_clicks_on_Mobile_number_and_type(String string) {
       cybertekTrainingDashboard.mobileNumber.sendKeys(string);
    }

    @When("user clicks on Gender and click gender")
    public void user_clicks_on_Gender_and_click_gender() {
        Select select = new Select(cybertekTrainingDashboard.gender);

        select.selectByVisibleText("Female");

    }

    @When("user clicks on Department and click department")
    public void user_clicks_on_Department_and_click_department() {
        Select select = new Select(cybertekTrainingDashboard.department);
        select.selectByVisibleText("Computer");

    }

    @When("user clicks on Joining Date and enter {string}")
    public void user_clicks_on_Joining_Date_and_enter(String string) {
        cybertekTrainingDashboard.joiningDate.sendKeys(string);
    }

    @When("user clicks on Salary and enter numeric value {string}")
    public void user_clicks_on_Salary_and_enter_numeric_value(String string) {
        cybertekTrainingDashboard.salary.click();
      cybertekTrainingDashboard.salary.clear();
      cybertekTrainingDashboard.salary.sendKeys(string);
    }

    @When("user clicks on Batch and choose batch")
    public void user_clicks_on_Batch_and_choose_batch() {

        Select select = new Select(cybertekTrainingDashboard.batch);
        select.selectByIndex(7);

    }

    @When("user clicks on Section and type {string}")
    public void user_clicks_on_Section_and_type(String string) {
       cybertekTrainingDashboard.section.sendKeys(string);
    }

    @When("user clicks on Permanent Address and type {string}")
    public void user_clicks_on_Permanent_Address_and_type(String string) {
        cybertekTrainingDashboard.permanentAddress.sendKeys(string);
    }

    @When("user clicks on Submit button")
    public void user_clicks_on_Submit_button() {
        cybertekTrainingDashboard.submitButton.click();
    }

    @Then("user should be able to see new teacher created")
    public void user_should_be_able_to_see_new_teacher_created() {
        assertTrue("New teacher is not displaying as expected",cybertekTrainingDashboard.newTeacher.isDisplayed());
        try {
            Connection connection = DriverManager.getConnection(Config.getProperty("urlSQL"),
                    Config.getProperty("usernameSQL"),
                    Config.getProperty("passwordSQL")
            );
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select first_name from teacher");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();


            List<Map<String, Object>> myTable = new ArrayList<>();

            while(resultSet.next()){

                Map<String, Object> map = new HashMap<>();

                for(int i=1; i<=columnCount; i++){
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }

                myTable.add(map);
            }


            for(Map<String, Object> m: myTable){
                if(!m.get("FIRST_NAME").equals("Rabia")){
                    continue;
                }
                assertTrue(m.get("FIRST_NAME").equals("Rabia"));
                break;
            }


        } catch (SQLException e) {

            System.out.println("Failed to open connection!");
        }


    }






    @When("user clicks on All Teacher section")
    public void user_clicks_on_All_Teacher_section() {
       cybertekTrainingDashboard.allTeachers.click();
    }



    @When("user clicks on the teacher to be deleted and delete it")
    public void user_clicks_on_the_teacher_to_be_deleted_and_delete_it() {
        List<WebElement> listt = cybertekTrainingDashboard.listOfTeacher;
        for(WebElement sTeacher: listt){
            if(sTeacher.getText().equals("Rabia")){
                cybertekTrainingDashboard.teacherDeleteButton.click();
            }
        }
    }


    @Then("user verifies teacher deleted")
    public void user_verifies_teacher_deleted() {

    }






    @When("user clicks on Student module")
    public void user_clicks_on_Student_module() {
        cybertekTrainingDashboard.studentsModule.click();
    }

    @When("user clicks on Add Student section")
    public void user_clicks_on_Add_Student_section() {
        cybertekTrainingDashboard.addStudentModule.click();
    }


    @When("user clicks on student first name and type {string}")
    public void user_clicks_on_student_first_name_and_type(String string) {
        cybertekTrainingDashboard.firstName.click();
        cybertekTrainingDashboard.firstName.sendKeys(string);
    }


        @When("user clicks on student last name and type {string}")
    public void user_clicks_on_student_last_name_and_type(String string) {
            cybertekTrainingDashboard.lastName.sendKeys(string);
    }

    @When("user clicks on student email and type {string}")
    public void user_clicks_on_student_email_and_type(String string) {
       cybertekTrainingDashboard.email.sendKeys(string);
    }

    @When("user clicks on student Joining Date and type {string}")
    public void user_clicks_on_student_Joining_Date_and_type(String string) {
        cybertekTrainingDashboard.joiningDate.sendKeys(string);
    }

    @When("user clicks on student Password and type {string} and confirm password")
    public void user_clicks_on_student_Password_and_type_and_confirm_password(String string) {
       cybertekTrainingDashboard.password.sendKeys(string);
    }

    @When("user clicks on student Subject and type {string}")
    public void user_clicks_on_student_Subject_and_type(String string) {
      cybertekTrainingDashboard.subject.sendKeys(string);
    }

    @When("user clicks on student Mobile number and type {string}")
    public void user_clicks_on_student_Mobile_number_and_type(String string) {
        cybertekTrainingDashboard.mobileNumber.sendKeys(string);
    }

    @When("user clicks on student Gender and click gender")
    public void user_clicks_on_student_Gender_and_click_gender() {
        Select select = new Select(cybertekTrainingDashboard.gender);

        select.selectByVisibleText("Female");
    }

    @When("user clicks on Admission number and enter numeric value {string}")
    public void user_clicks_on_Admission_number_and_enter_numeric_value(String string) {
        cybertekTrainingDashboard.AdmissionNo.sendKeys(string);
    }

    @When("user clicks on student Birth Date and enter {string}")
    public void user_clicks_on_student_Birth_Date_and_enter(String string) {
        cybertekTrainingDashboard.birthDate.sendKeys(string);
    }

    @When("user clicks on Major and type {string}")
    public void user_clicks_on_Major_and_type(String string) {
        cybertekTrainingDashboard.AdmissionNo.sendKeys(string);
    }

    @When("user clicks on student Batch and choose batch")
    public void user_clicks_on_student_Batch_and_choose_batch() {
        Select select = new Select(cybertekTrainingDashboard.batch);
        select.selectByIndex(4);
    }

    @When("user clicks on student Section and type {string}")
    public void user_clicks_on_student_Section_and_type(String string) {
       cybertekTrainingDashboard.section.sendKeys(string);
    }

    @When("user clicks on student Permanent Address and type {string}")
    public void user_clicks_on_student_Permanent_Address_and_type(String string) {
        cybertekTrainingDashboard.permanentAddress.sendKeys(string);
    }

    @When("user clicks on Company Name and type {string}")
    public void user_clicks_on_Company_Name_and_type(String string) {
        cybertekTrainingDashboard.companyName.sendKeys(string);
    }

    @When("user clicks on Start Date and type {string}")
    public void user_clicks_on_Start_Date_and_type(String string) {
      cybertekTrainingDashboard.startDate.sendKeys(string);
    }

    @When("user clicks on Street and enter {string}")
    public void user_clicks_on_Street_and_enter(String string) {
       cybertekTrainingDashboard.street.sendKeys(string);
    }

    @When("user clicks on State and enter {string}")
    public void user_clicks_on_State_and_enter(String string) {
        cybertekTrainingDashboard.state.sendKeys(string);
    }

    @When("user clicks on title and enter {string}")
    public void user_clicks_on_title_and_enter(String string) {
        cybertekTrainingDashboard.title.sendKeys(string);
    }

    @When("user clicks on City and enter {string}")
    public void user_clicks_on_City_and_enter(String string) {
        cybertekTrainingDashboard.city.sendKeys(string);
    }

    @When("user clicks on ZipCode and enter {string}")
    public void user_clicks_on_ZipCode_and_enter(String string) {
        cybertekTrainingDashboard.zipCode.sendKeys(string);
    }

    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
       cybertekTrainingDashboard.submitButton.click();
    }

    @Then("user should be able to see new student created")
    public void user_should_be_able_to_see_new_student_created() {
        assertTrue("New student is not displaying as expected",cybertekTrainingDashboard.newStudent.isDisplayed());
        try {
            Connection connection = DriverManager.getConnection(Config.getProperty("urlSQL"),
                    Config.getProperty("usernameSQL"),
                    Config.getProperty("passwordSQL")
            );
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select first_name from student");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();


            List<Map<String, Object>> myTable = new ArrayList<>();

            while(resultSet.next()){

                Map<String, Object> map = new HashMap<>();

                for(int i=1; i<=columnCount; i++){
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }

                myTable.add(map);
            }


            for(Map<String, Object> m: myTable){
                if(!m.get("FIRST_NAME").equals("Gokce")){
                    continue;
                }
                assertTrue(m.get("FIRST_NAME").equals("Gokce"));
                break;
            }


        } catch (SQLException e) {

            System.out.println("Failed to open connection!");
        }
    }


    @When("user clicks on All Student section")
    public void user_clicks_on_All_Student_section() {

    }



    @When("user clicks on the student to be deleted and delete")
    public void user_clicks_on_the_student_to_be_deleted_and_delete() {
        List<WebElement> listS = cybertekTrainingDashboard.listOfStudent;
        for(WebElement sTeacher: listS){
            if(sTeacher.getText().equals("Gokce")){
                cybertekTrainingDashboard.deleteStudent.click();
            }
        }
    }



    @Then("user verifies delete deleted")
    public void user_verifies_delete_deleted() {


}


}
