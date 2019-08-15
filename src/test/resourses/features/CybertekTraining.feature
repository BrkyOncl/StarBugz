@DataBaseTest
  Feature: Creating new Teachers and Students
    @Rabia
    Scenario: Admin user should be able to create a teacher
      Given User is on main page of cybertek training
      When user clicks on Teachers module
      And user clicks on Add Teacher section
      And user clicks on first name and type "Rabia"
      And user clicks on last name and type "Kadioglu"
      And user clicks on email and type "r123@gmail.com"
      And user clicks on Joining Date and type "8/10/2019"
      And user clicks on Password and type "123456" and confirm password
      And user clicks on Subject and type "Computer Programming"
      And user clicks on Mobile number and type "123123123"
      And user clicks on Gender and click gender
      And user clicks on Department and click department
      And user clicks on Birth Date and enter "9/10/1990"
      And user clicks on Salary and enter numeric value "115000"
      And user clicks on Batch and choose batch
      And user clicks on Section and type "A"
      And user clicks on Permanent Address and type "2700 Desplanes"
      And user clicks on Submit button
      Then user should be able to see new teacher created

      @Rabia
      Scenario: Admin user should be able to create a student
        Given User is on main page of cybertek training
        When user clicks on Student module
        And user clicks on Add Student section
        And user clicks on student first name and type "Gokce"
        And user clicks on student last name and type "kadioglu"
        And user clicks on student email and type "g123@gmail.com"
        And user clicks on student Joining Date and type "8/10/2019"
        And user clicks on student Password and type "123456" and confirm password
        And user clicks on student Subject and type "Computer Programming"
        And user clicks on student Mobile number and type "123123123"
        And user clicks on student Gender and click gender
        And user clicks on Admission number and enter numeric value "12345"
        And user clicks on student Birth Date and enter "9/10/2005"
        And user clicks on Major and type "GFJ"
        And user clicks on student Batch and choose batch
        And user clicks on student Section and type "A"
        And user clicks on student Permanent Address and type "2700 Desplanes"
        And user clicks on Company Name and type "Cybertek"
        And user clicks on Start Date and type "8/10/2019"
        And user clicks on Street and enter "123 N. California, Apt 1"
        And user clicks on State and enter "IL"
        And user clicks on title and enter "ABC"
        And user clicks on City and enter "Chicago"
        And user clicks on ZipCode and enter "60600"
        Then user clicks on submit button
        Then user should be able to see new student created



















