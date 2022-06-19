Feature: Orange HRM Add, Edit, Delete Employee Functionality
  
  
    When login

  @AddEmployee
  Scenario: AddEmployee
    When addEmployee
    When logout

  @EditEmployee
  Scenario: EditEmployee
    When editEmployee
    When logout

  @DeleteEmployee
  Scenario: DeleteEmployee
    When deleteEmployee
    When logout
