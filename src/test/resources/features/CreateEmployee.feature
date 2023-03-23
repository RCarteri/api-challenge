Feature: Create and delete an employee for reqres.in api webservice

    Scenario Outline: Create and delete an employee
        Given I access the URL
        When I create an employee with the name "<name>" and job "<job>"
        Then the employee must be created successfully
        When I delete this employee
        Then the employee must be deleted successfully
        Examples:
            | name    | job |
            | Ricardo | QA  |