Feature: Orange HRM Application Functionality

  @Login
  Scenario: Login
    Given open browser and enter the url
    When enter username and password, click on login
    Then verification for welcome page
    When click on welcome and logout
    When close the browser

  @Parameters
  Scenario: Login
    Given open browser and enter the url
    When enter "Admin" and "admin123", click on login
    Then verification for welcome page
    When click on welcome and logout
    When close the browser
    
    @DataTable
  Scenario: DataTable for username and password warning message is not displaying
    Given open browser and enter the url
    When enter username and password, click on login
    |Admin|admin123|
    Then verification for welcome page
    When click on welcome and logout
    When close the browser
    
    @DataDriven
  Scenario Outline: DataDriven
    Given open browser and enter the url
    When enter "<username>" and "<password>", click on login
    Then verification for welcome page
    When click on welcome and logout
    When close the browser
    
    Examples: 
    |username|password|
    |Admin|admin123|
    |Admin|admin12|
   
