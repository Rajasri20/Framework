Feature: Orange HRM Add, Edit, Delete Employee Functionality

  Background: openBrowser and login are PreRequisits and common in three Scenario so Delete them put in Background
    Given openBrowser
    When login

  @AddEmployee
  Scenario: AddEmployee
    When addEmployee
    When logout
    When closeBrowser

  @EditEmployee
  Scenario: EditEmployee
    When editEmployee
    When logout
    When closeBrowser

  @DeleteEmployee
  Scenario: DeleteEmployee
    When deleteEmployee
    When logout
    When closeBrowser
