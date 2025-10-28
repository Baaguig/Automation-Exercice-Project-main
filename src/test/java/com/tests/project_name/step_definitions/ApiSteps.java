package com.tests.project_name.step_definitions;

import com.tests.project_name.api.ApiRequest;
import io.cucumber.java.en.*;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApiSteps {

    private Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        // Since this is a public API, no cookies needed
        response = ApiRequest.get(endpoint, new Cookies());
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatus) {
        Assert.assertEquals("Status code mismatch!", expectedStatus.intValue(), response.statusCode());
    }

    @Then("the response should contain the key {string}")
    public void the_response_should_contain_the_key(String key) {
        Assert.assertTrue("Response body does not contain key: " + key, response.getBody().asString().contains(key));
    }
}
