Feature: Create and delete an employee for reqres.in api webservice

    Background: Access URL
        Given I access the URL

    Scenario Outline: Create and delete an employee
        When I create an employee with the name "<name>" and job "<job>"
        Then the employee must be created successfully
        When I delete this employee
        Then the employee must be deleted successfully
        Examples:
            | name    | job |
            | Ricardo | QA  |