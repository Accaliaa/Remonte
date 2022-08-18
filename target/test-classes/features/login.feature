@BACBPI-139
 Feature: login page

   Background: browser launch and maximise
     Given connected to URL
     When I click on login button
     Then login page appears

  Scenario Outline: login
    Given login page opened
    When I fill in my "<email>"
    And I fill in my password "<password>"
    And I click on connect button
    Then Pop up appears

     Examples:
    | email | password|
    |    zainab@gmail.com   |   bablou     |



