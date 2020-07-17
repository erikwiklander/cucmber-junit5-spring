package com.example.demo;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefsIntegrationTest extends DemoApplicationTests {


    @When("^the client calls /baeldung$")
    public void the_client_issues_POST_hello() throws Throwable {
        //
    }

    @Given("^the client calls /hello$")
    public void the_client_issues_GET_hello() throws Throwable {
        //
    }

    @When("^the client calls /version$")
    public void the_client_issues_GET_version() throws Throwable {
        System.out.println("Call version");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {

        System.out.println("Check status");
        assertThat(test).isNotBlank();

        assertThat(statusCode).isEqualTo(200);
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        System.out.println("Check version");
//        assertThat(version).isEqualTo("1.0");
    }
}
