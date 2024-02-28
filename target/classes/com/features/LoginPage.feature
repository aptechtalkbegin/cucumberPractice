#Feature: To validate login with valid user credentials
#
  #Scenario: Successful login with valid credentials
    #Given User launch browser
    #And Opens URL https://www.opencart.com
    #When User navigates to My Account menu
    #And Click on login
    #And User enters Email as "xyz.abc@gamil.com" and Password as "test@123"
    #And Click on Login button
    #Then User login is successful
    #And User navigates to MyAccount page

Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "dec2020secondbatch@gmail.com"
And user enters password "Selenium@12345"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"

