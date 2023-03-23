package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class Steps {
    private static Response response;
    private static String id;
    private static String BASE_URL;

    @Given("I access the URL")
    public void iAccessTheURL() {
        BASE_URL = ResourceBundle.getBundle("config").getString("base_url");
    }


    @When("I create an employee with the name {string} and job {string}")
    public void iCreateAnEmployeeWithTheNameAndJob(String name, String job) {
        JSONObject data = new JSONObject();
        data.put("name", name);
        data.put("job", job);
        response = given()
                .body(data.toJSONString())
                .when()
                .post(BASE_URL);
    }

    @Then("the employee must be created successfully")
    public void theEmployeeMustBeCreatedSuccessfully() {
        response.then()
                .statusCode(201)
                .body(containsString("createdAt"));
        id = response.jsonPath().getJsonObject("id");
    }

    @When("I delete this employee")
    public void iDeleteThisEmployee() {
        response = RestAssured.when()
                .delete(BASE_URL + id);
    }

    @Then("the employee must be deleted successfully")
    public void theEmployeeMustBeDeletedSuccessfully() {
        response.then()
                .statusCode(204);
    }
}
