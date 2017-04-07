
    Feature: Register functionality of Scruwfix

    Background:
    Given I am home page of Screwfix
      And I click on your account link text
      And I click on on Register now link

    Scenario: Register functionality with valid credential


     When I enter valid email address
      And  I click on continue button
      And I select Mr form drop down list
      And I enter valid first name on firstname filed
      And  I enter valid last name on lastname filed
      And  I select profation form drop down list
      And  I enter my postcode
      And I click on find address
      And I select valid address form drop down list
      And I enter valid password in password filed
      And  I  retype same password in password field
      And  I click on Register now link
      Then   I should see welcome massage