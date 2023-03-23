Feature: Create and delete an employee for reqres.in api webservice

    Scenario: Create and delete an employee
        Given I access the URL
        When I create an employee
        Then the employee must be created successfully
        When I delete this employee
        Then the employee must be deleted successfully