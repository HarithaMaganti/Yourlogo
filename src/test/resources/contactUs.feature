@sendMessage
Feature:Sending Message to Customer Services
  As a Customer
  I want to contact Customer Services
  So that I can send a message to Customer services

  Scenario: Sending Message to Customer Services
    Given I am on automationPractice Homepage
    When I click on "Contact us"
    And page navigates to "CUSTOMER SERVICE - CONTACT US"
    And I select "Customer service" from Subject Heading dropdown
    And I enter Email address "test@test.com"
    And I enter Order reference "test12345"
    And I enter text in Message box "Sending message to Customer Services"
    And I click on "Send" button
    Then I should be able to view confirmation message "Your message has been successfully sent to our team."




