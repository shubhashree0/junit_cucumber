
@tag
Feature: Form Feature
  

  @Smoke 
  Scenario: To validate simple form and all the text box present.
    Given user oprn chrome browser and enter simpleform url 
    And text box should be enabled
    When user enter text in firstname, lastname,email,contact, message
    And user clicks on the submit button
    Then and alert is displayed
  

 