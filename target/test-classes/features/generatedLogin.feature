Feature: Demoqa Login

Scenario: Login with user shradha
  Given user is on login page
  When user enters username "shradha" and password "Password@123"
  And clicks on login button
  Then login result should be "Success"

Scenario: Login with user amit
  Given user is on login page
  When user enters username "amit" and password "Kumar@123"
  And clicks on login button
  Then login result should be "Success"

