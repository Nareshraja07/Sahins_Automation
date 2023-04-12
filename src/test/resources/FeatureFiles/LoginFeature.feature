Feature: To validate login functionality of Sahins application

  Scenario: To validate login functionalitity with username and password
    Given User have to Launch chrome browser and launch Sahins URL
    And User have to maximize the window
    When user have to enter username and password
    Then User have to click login button
    Then User is on Dashboard Screen