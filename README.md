# QA Test API challenge

## PROJECT (WebService/API)
Create an automation project using a [public API][api] with the scenarios:
- Create an employee
- Validate if the employee was created correctly
- Delete this user

Required: Always validate the StatusCode and the displayed message.
Desirable: Generate a report of the tests performed.

## Environment
- Java 17
- Maven 3.9.0

## Execution
This code can be executed by [runner][runners], by [feature][features] and with maven by [pom.xml][pom]. Reports are generated after execution and are saved in the directory referring to the execution time.

(At some point there may be a need for intervention due to reCAPTCHA on login)

It was also implemented in jenkins using the git repository.


[api]: http://dummy.restapiexample.com/
[runners]: src/test/java/runners
[features]: src/test/resources/features
[pom]: pom.xml

