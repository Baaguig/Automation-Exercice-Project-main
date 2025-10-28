@Tnr
Feature: Contact Us Form Submission
  As a user
  I want to submit a contact form
  So that I can reach the support team for inquiries or issues.


  Scenario: User submits contact form successfully

    Given  the user navigates to Automation Exercise Website
    When the user clicks on the Contact Us button
    Then the "GET IN TOUCH" section should be visible
    When the user enters the following contact details:
      | field   | value                                         |
      | name    | Mokhtar Baaguig                              |
      | email   | mokhtar@example.com                          |
      | subject | QA Automation Inquiry                        |
      | message | This is a test message for contact form automation. |
    And the user uploads file "C:\Users\ASUS\Desktop\SafeZone/UPLOAD.jpg"
    And the user clicks on the Submit button
    And the user confirms the alert popup
    Then the success message "Success! Your details have been submitted successfully." should be visible
    When the user clicks on the Home button
